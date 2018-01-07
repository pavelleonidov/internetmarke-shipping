package de.pavelleonidov.InternetmarkeShipping.model.magento;

import javafx.beans.property.StringProperty;

import java.util.List;

public class OrderDetailsTreeObject extends TreeObject<OrderDetailsTreeObject> {


    public OrderDetailsTreeObject(String name, String value) {

        super();

        setLabel(name);
        setValue(value);

    }


    public StringProperty getLabel() {
        return getProperty("label");
    }

    public void setLabel(String label) {
        setProperty("label", label);
    }

    public StringProperty getValue() {
        return getProperty("value");
    }

    public void setValue(String value) {
        setProperty("value", value);
    }

}
