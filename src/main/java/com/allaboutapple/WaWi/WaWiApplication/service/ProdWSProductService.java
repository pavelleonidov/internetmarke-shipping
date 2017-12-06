package com.allaboutapple.WaWi.WaWiApplication.service;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.controller.SettingsController;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.BasicProductList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.Product;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.ProductList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.GetProductListRequestType;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.GetProductListResponse;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.ProdWSPortType;
import com.allaboutapple.WaWi.WaWiApplication.service.prodws.ProdWSService;
import com.allaboutapple.WaWi.WaWiApplication.utility.handler.soap.WSSecurityHeaderSOAPHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

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

            //handlerList.add(new SOAPMessageWriterHandler());
            handlerList.add(new WSSecurityHeaderSOAPHandler(getSettings().getProdWSUsername(), getSettings().getProdWSPassword()));

            Map<String, Object> ctx = bindingProvider.getRequestContext();

            ctx.put(BindingProvider.USERNAME_PROPERTY, getSettings().getProdWSUsername());
            ctx.put(BindingProvider.PASSWORD_PROPERTY, getSettings().getProdWSPassword());

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

}
