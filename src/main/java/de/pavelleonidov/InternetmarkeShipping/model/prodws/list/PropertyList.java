package de.pavelleonidov.InternetmarkeShipping.model.prodws.list;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.PropertyType;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.PropertyType;

import java.util.ArrayList;
import java.util.List;

public class PropertyList {

    protected List<PropertyType> property;

    public List<PropertyType> getProperty() {
        if (property == null) {
            property = new ArrayList<PropertyType>();
        }
        return this.property;
    }
}
