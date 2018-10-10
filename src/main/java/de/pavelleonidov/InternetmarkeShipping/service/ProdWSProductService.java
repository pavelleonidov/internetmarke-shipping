package de.pavelleonidov.InternetmarkeShipping.service;

import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import de.pavelleonidov.InternetmarkeShipping.model.Settings;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.Product;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.ProductList;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.GetProductListRequestType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.GetProductListResponse;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.ProdWSPortType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.ProdWSService;
import de.pavelleonidov.InternetmarkeShipping.utility.handler.soap.SOAPMessageWriterHandler;
import de.pavelleonidov.InternetmarkeShipping.utility.handler.soap.WSSecurityHeaderSOAPHandler;
import de.pavelleonidov.InternetmarkeShipping.controller.SettingsController;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.GetProductListRequestType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.GetProductListResponse;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.ProdWSPortType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.ProdWSService;
import de.pavelleonidov.InternetmarkeShipping.utility.handler.soap.WSSecurityHeaderSOAPHandler;

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

            ProdWSService service = new ProdWSService();
            ProdWSPortType port = service.getProdWSPort();

            BindingProvider bindingProvider = (BindingProvider) port;
            Binding binding = bindingProvider.getBinding();

            List<Handler> handlerList = binding.getHandlerChain();

            handlerList.add(new WSSecurityHeaderSOAPHandler(getSettings().getProdWSUsername(), getSettings().getProdWSPassword()));
            handlerList.add(new SOAPMessageWriterHandler());

            Map<String, Object> ctx = bindingProvider.getRequestContext();

            ctx.put(BindingProvider.USERNAME_PROPERTY, getSettings().getProdWSUsername());
            ctx.put(BindingProvider.PASSWORD_PROPERTY, getSettings().getProdWSPassword());

            System.out.println(getSettings().getProdWSUsername());


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


}
