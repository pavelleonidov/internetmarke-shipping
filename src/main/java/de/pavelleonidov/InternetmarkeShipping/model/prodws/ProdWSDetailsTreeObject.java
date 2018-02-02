package de.pavelleonidov.InternetmarkeShipping.model.prodws;

import de.pavelleonidov.InternetmarkeShipping.model.magento.TreeObject;
import javafx.beans.property.StringProperty;

import java.util.List;

public class ProdWSDetailsTreeObject extends TreeObject<ProdWSDetailsTreeObject> {

    io.swagger.client.model.SalesDataOrderInterface responseOrder;

    public ProdWSDetailsTreeObject(String label, String value) {

        super();
        setLabel(label);
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
