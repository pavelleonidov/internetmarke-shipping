package com.allaboutapple.WaWi.WaWiApplication.service;

import com.allaboutapple.WaWi.WaWiApplication.controller.SettingsController;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.Product;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.ProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.GetProductListRequestType;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.GetProductListResponse;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.ProdWSPortType;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.ProdWSService;
import com.allaboutapple.WaWi.WaWiApplication.utility.handler.soap.WSSecurityHeaderSOAPHandler;

import javax.xml.soap.SOAPMessage;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Set;

abstract public class ProdWSProductService<T extends ProductList<? extends Product>, K> extends MarshalService<T> {

    protected List<K> responseProducts;
    protected GetProductListResponse prodListResp;

    protected GetProductListResponse getProductListResponse() {
        if(prodListResp == null) {
            //Aufruf des Service Objektes
            ProdWSService service = new ProdWSService();

            //Holen eines Port Typs
            ProdWSPortType port = service.getProdWSPort();

            BindingProvider bindingProvider = (BindingProvider) port;
            Binding binding = bindingProvider.getBinding();

            List<Handler> handlerList = binding.getHandlerChain();

           // handlerList.add(new SOAPMessageWriterHandler());
            handlerList.add(new WSSecurityHeaderSOAPHandler(getSettings().getProdWSUsername(), getSettings().getProdWSPassword()));

            Map<String, Object> ctx = bindingProvider.getRequestContext();

            ctx.put(BindingProvider.USERNAME_PROPERTY, getSettings().getProdWSUsername());
            ctx.put(BindingProvider.PASSWORD_PROPERTY, getSettings().getProdWSPassword());

            System.out.println(getSettings().getProdWSUsername());

            //Erzeugen eines Request Objektes
            GetProductListRequestType prodListType = new GetProductListRequestType();
            prodListType.setDedicatedProducts(true);
            prodListType.setMandantID(getSettings().getProdWSMandantId());
            prodListType.setResponseMode(new BigInteger("0"));

            binding.setHandlerChain(handlerList);

            prodListResp = port.getProductList(prodListType);
        }
        return prodListResp;
    }

    abstract protected void saveProducts();

    abstract protected T getProducts();

    protected Settings getSettings() {
        return SettingsController.getSettings();
    }

    public class SOAPMessageWriterHandler implements SOAPHandler<SOAPMessageContext> {

        public boolean handleMessage(SOAPMessageContext smc) {

            Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

            SOAPMessage message = smc.getMessage();

            try {
                if (!outboundProperty.booleanValue()) {
                    System.out.println("SOAP Response : ");
                    message.writeTo(System.out);
                } else {
                    System.out.println("SOAP Request : ");
                    message.writeTo(System.out);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return outboundProperty;
        }

        public Set getHeaders() {
            return null;
        }

        public boolean handleFault(SOAPMessageContext context) {
            return true;
        }

        public void close(MessageContext context) {
        }


    }
}
