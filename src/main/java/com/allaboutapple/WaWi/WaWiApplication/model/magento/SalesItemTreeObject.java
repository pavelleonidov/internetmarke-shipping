package com.allaboutapple.WaWi.WaWiApplication.model.magento;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesItemTreeObject extends TreeObject<SalesItemTreeObject> {
    Map<String, StringProperty> properties;
    io.swagger.client.model.SalesDataOrderItemInterface responseProduct;

    public SalesItemTreeObject(io.swagger.client.model.SalesDataOrderItemInterface product) {

        super();
        responseProduct = product;


        setName(product.getName());
        setSku(product.getSku());
        setPrice(product.getBaseOriginalPrice().toString());

    }

    public StringProperty getSku() {

        return getProperty("sku");
    }

    public void setSku(String sku) {

        setProperty("sku", sku);
    }

    public StringProperty getPrice() {
        return getProperty("price");
    }

    public void setPrice(String price) {

        setProperty("price", price);
    }

    public StringProperty getName() {
        return getProperty("name");
    }

    public void setName(String name) {

        setProperty("name", name);
    }

    public io.swagger.client.model.SalesDataOrderItemInterface getResponseProduct() {
        return responseProduct;
    }
}
