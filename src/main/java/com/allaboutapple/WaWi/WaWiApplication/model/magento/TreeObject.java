package com.allaboutapple.WaWi.WaWiApplication.model.magento;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeObject<T> extends RecursiveTreeObject<T> {
    Map<String, StringProperty> properties;

    public TreeObject() {
        super();
        properties = new HashMap<String, StringProperty>();
    }

    public void setProperty(String propertyName, String propertyValue) {
        properties.put(propertyName, new SimpleStringProperty(propertyValue));
    }

    public StringProperty getProperty(String propertyName) {
        return properties.get(propertyName);
    }

}
