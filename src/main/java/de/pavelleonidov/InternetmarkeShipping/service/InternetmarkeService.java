package de.pavelleonidov.InternetmarkeShipping.service;

import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import de.pavelleonidov.InternetmarkeShipping.model.Settings;
import de.pavelleonidov.InternetmarkeShipping.model.internetmarke.OrderedProduct;
import de.pavelleonidov.InternetmarkeShipping.service.internetmarke.*;
import de.pavelleonidov.InternetmarkeShipping.service.internetmarke.Name;
import de.pavelleonidov.InternetmarkeShipping.utility.handler.soap.SOAPMessageWriterHandler;
import de.pavelleonidov.InternetmarkeShipping.utility.handler.soap.WSSecurityHeaderSOAPHandler;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import de.pavelleonidov.InternetmarkeShipping.service.internetmarke.*;
import de.pavelleonidov.InternetmarkeShipping.utility.handler.soap.SOAPMessageWriterHandler;
import org.apache.commons.io.Charsets;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.message.WSSecHeader;
import org.apache.ws.security.message.WSSecUsernameToken;
import org.codehaus.plexus.util.StringUtils;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class InternetmarkeService {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("ddMMyyyy-HHmmss");

    private static final ZoneId ZONE_ID = ZoneId.of("Europe/Berlin");

    private static final InternetmarkeService OBJ = new InternetmarkeService();

    private String userToken;

    private int walletBalance = 0;

    private OneClickForAppServiceV3 pcfOneClickService;

    private OneClickForAppPortTypeV3 port;

    private LocalDateTime lastTokenRequestTime;


    public static InternetmarkeService getInstance() {
        return OBJ;
    }

    public void init() {
        pcfOneClickService = new OneClickForAppServiceV3();
        port = pcfOneClickService.getOneClickForAppPortV3();


        BindingProvider bindingProvider = (BindingProvider) port;
        Binding binding = bindingProvider.getBinding();

        //bindingProvider.
        List<Handler> handlerList = binding.getHandlerChain();

        handlerList.add(new InternetmarkeHeaderSOAPHandler());
        handlerList.add(new SOAPMessageWriterHandler());

       // Map<String, Object> ctx = bindingProvider.getRequestContext();
       // ctx.put(BindingProvider.USERNAME_PROPERTY, getSettings().getPcfOneClickUsername());



        binding.setHandlerChain(handlerList);


        // port.authenticateUser()

    }

    protected Settings getSettings() {
        return SettingsController.getSettings();
    }

    public String authenticateAndGetToken() {


        LocalDateTime currentTime = LocalDateTime.now();

        long difference = 100;

        if(lastTokenRequestTime != null) {
            difference = Duration.between(lastTokenRequestTime, currentTime).toMinutes();
        }


        if(difference > 59) {
            init();

            if(getSettings().getPcfOneClickUsername() != null && getSettings().getPcfOneClickPassword() != null) {
                try {
                    AuthenticateUserRequestType internetmarkeRequest = new AuthenticateUserRequestType();
                    internetmarkeRequest.setUsername(getSettings().getPcfOneClickUsername());
                    internetmarkeRequest.setPassword(getSettings().getPcfOneClickPassword());

                    AuthenticateUserResponseType authenticationResponse = port.authenticateUser(internetmarkeRequest);
                    userToken = authenticationResponse.getUserToken();
                    setWalletBalance(authenticationResponse.getWalletBalance());
                    lastTokenRequestTime = LocalDateTime.now();
                    System.out.println(authenticationResponse.getInfoMessage());
                } catch (AuthenticateUserException_Exception e) {
                    e.printStackTrace();
                    userToken = "";
                }
            } else {
                System.out.println("Username and password for the Internetmarke account are missing!");
            }


        }
        return userToken;
    }

    public int getWalletBalance() {
        init();
        authenticateAndGetToken();
        return walletBalance;
    }

    public void setWalletBalance(int balance) {
        walletBalance = balance;
    }

    public String getFormattedWalletBalance() {
        int balance = getWalletBalance();
        //System.out.println(balance);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        return nf.format(balance / 100.0);
    }

    public String getOrderId() {
       init();
       CreateShopOrderIdRequest orderIdRequest = new CreateShopOrderIdRequest();
       orderIdRequest.setUserToken(authenticateAndGetToken());
       CreateShopOrderIdResponse orderIdResponse;
        try {
            orderIdResponse = port.createShopOrderId(orderIdRequest);
            System.out.println(orderIdResponse.getShopOrderId());
            return orderIdResponse.getShopOrderId();
        } catch (IdentifyException_Exception e) {
            e.printStackTrace();
            return "";
        }


    }

    public OrderedProduct getProduct(int productId, String receiverFirstName, String receiverLastName, String receiverCompany, String receiverZip, String receiverCity, String receiverStreet, String receiverHouseNumber, String receiverCountry, int totalValue) {
        init();
        ShoppingCartPDFRequestType pdfRequestType = new ShoppingCartPDFRequestType();
        pdfRequestType.setUserToken(authenticateAndGetToken());
        pdfRequestType.setShopOrderId(getOrderId());
        pdfRequestType.setPageFormatId(1);

        //List<ShoppingCartPDFPosition> pdfPositions = pdfRequestType.getPositions();

        ShoppingCartPDFPosition defaultPosition = new ShoppingCartPDFPosition();
        defaultPosition.setProductCode(productId);

        Address senderAddress = new Address();

        PersonName senderPersonName = new PersonName();
        senderPersonName.setFirstname(getSettings().getSenderForename());
        senderPersonName.setLastname(getSettings().getSenderSurname());

        de.pavelleonidov.InternetmarkeShipping.service.internetmarke.Name senderName = new de.pavelleonidov.InternetmarkeShipping.service.internetmarke.Name();

        if(getSettings().getSenderCompany() != null) {
            CompanyName senderCompanyName = new CompanyName();
            senderCompanyName.setCompany(getSettings().getSenderCompany());
            senderCompanyName.setPersonName(senderPersonName);
            senderName.setCompanyName(senderCompanyName);
        } else {
            senderName.setPersonName(senderPersonName);
        }

        senderAddress.setCity(getSettings().getSenderCity());
        senderAddress.setHouseNo(getSettings().getSenderHouseNumber());
        senderAddress.setStreet(getSettings().getSenderStreet());
        senderAddress.setZip(getSettings().getSenderZip());
        senderAddress.setCountry("DEU");

        NamedAddress sender = new NamedAddress();
        sender.setAddress(senderAddress);
        sender.setName(senderName);

        Address receiverAddress = new Address();
        receiverAddress.setCity(receiverCity);
        receiverAddress.setHouseNo(receiverHouseNumber);
        receiverAddress.setStreet(receiverStreet);
        receiverAddress.setZip(receiverZip);
        receiverAddress.setCountry(receiverCountry);

        PersonName receiverPersonName = new PersonName();
        receiverPersonName.setFirstname(receiverFirstName);
        receiverPersonName.setLastname(receiverLastName);

        de.pavelleonidov.InternetmarkeShipping.service.internetmarke.Name receiverName = new de.pavelleonidov.InternetmarkeShipping.service.internetmarke.Name();
        if(receiverCompany != null) {
           CompanyName receiverCompanyName = new CompanyName();
           receiverCompanyName.setCompany(receiverCompany);
           receiverCompanyName.setPersonName(receiverPersonName);
           receiverName.setCompanyName(receiverCompanyName);
        } else {
           receiverName.setPersonName(receiverPersonName);
        }

        NamedAddress receiver = new NamedAddress();
        receiver.setAddress(receiverAddress);
        receiver.setName(receiverName);


        AddressBinding addressBinding = new AddressBinding();
        addressBinding.setSender(sender);
        addressBinding.setReceiver(receiver);

        defaultPosition.setAddress(addressBinding);

        VoucherPosition voucherPosition = new VoucherPosition();
        voucherPosition.setPage(1);
        voucherPosition.setLabelX(1);
        voucherPosition.setLabelY(1);
        defaultPosition.setPosition(voucherPosition);

        defaultPosition.setVoucherLayout(VoucherLayout.ADDRESS_ZONE);

        pdfRequestType.getPositions().add(defaultPosition);
        pdfRequestType.setTotal(totalValue);

        try {
            ShoppingCartResponseType shoppingCartResponse = port.checkoutShoppingCartPDF(pdfRequestType);
            //System.out.println("Link: " + shoppingCartResponse.getLink());
            setWalletBalance(walletBalance -= totalValue);


            OrderedProduct orderedProduct = new OrderedProduct();
            orderedProduct.setLink(shoppingCartResponse.getLink());

            String trackId = shoppingCartResponse.getShoppingCart().getVoucherList().getVoucher().get(0).getTrackId();

            // For most trackable ProdWS / Internetmarke products the track id is actually the same as the voucher id
            if(StringUtils.isBlank(trackId)) {
                trackId = shoppingCartResponse.getShoppingCart().getVoucherList().getVoucher().get(0).getVoucherId();
            }

            System.out.println("Track-ID: " + trackId);

           // System.out.println("Track-ID: " + shoppingCartResponse.getShoppingCart().getVoucherList().getVoucher().get(0).getTrackId());
           // System.out.println("Voucher-ID: " + shoppingCartResponse.getShoppingCart().getVoucherList().getVoucher().get(0).getVoucherId());
            orderedProduct.setTrackId(trackId);
            orderedProduct.setLink(shoppingCartResponse.getLink());
            return orderedProduct;
        } catch (IdentifyException_Exception e) {
            e.printStackTrace();
            return null;
        } catch (ShoppingCartValidationException_Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    public List<PageFormat> getPageFormats() {
        init();

        RetrievePageFormatsRequestType pageFormatsRequestType = new RetrievePageFormatsRequestType();

        RetrievePageFormatsResponseType pageFormatsResponseType;

        pageFormatsResponseType = port.retrievePageFormats(pageFormatsRequestType);
        return pageFormatsResponseType.getPageFormat();
    }


    public class InternetmarkeHeaderSOAPHandler implements SOAPHandler<SOAPMessageContext> {

        @Override
        public boolean handleMessage(SOAPMessageContext context) {
            Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

            if (outboundProperty.booleanValue()) {

                try {
                    SOAPMessage message = context.getMessage();
                    SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();

                    SOAPHeader soapHeader = envelope.getHeader();
                    if (soapHeader == null) {
                        soapHeader = envelope.addHeader();
                    }

                    ZonedDateTime berlinTime = LocalDateTime.now().atZone(ZONE_ID);
                    String requestTimestamp = DATE_TIME_FORMATTER.format(berlinTime);

                    SOAPElement partnerId = soapHeader.addChildElement("PARTNER_ID", "v3", "http://oneclickforapp.dpag.de/V3");
                    SOAPElement requestTimestampElement = soapHeader.addChildElement("REQUEST_TIMESTAMP", "v3", "http://oneclickforapp.dpag.de/V3");
                    SOAPElement keyPhase = soapHeader.addChildElement("KEY_PHASE", "v3", "http://oneclickforapp.dpag.de/V3");
                    SOAPElement partnerSignature = soapHeader.addChildElement("PARTNER_SIGNATURE", "v3", "http://oneclickforapp.dpag.de/V3");

                    partnerId.setTextContent(getSettings().getPcfOneClickPartnerId());
                    requestTimestampElement.setTextContent(requestTimestamp);
                    keyPhase.setTextContent("1");
                    partnerSignature.setTextContent(calculateInternetmarkeSignature(requestTimestamp));

                    message.saveChanges();
                } catch (Exception e) {
                    throw new RuntimeException("Error on wsSecurityHandler: " + e.getMessage());
                }

            }

            return true;
        }

        @Override
        public boolean handleFault(SOAPMessageContext context) {
            return false;
        }

        @Override
        public void close(MessageContext context) {

        }

        @Override
        public Set<QName> getHeaders() {
            return null;
        }

        protected Settings getSettings() {
            return SettingsController.getSettings();
        }

        public String calculateInternetmarkeSignature(String timestamp) {

            String hash = getSettings().getPcfOneClickPartnerId() + "::" + timestamp + "::" + "1" + "::" + getSettings().getPcfOneClickPartnerSignature();
            HashCode hashedBytes = Hashing.md5().hashString(hash.trim(), Charsets.ISO_8859_1);
            String hashString = hashedBytes.toString();
            return hashString.substring(0, 8);
        }
    }
}


