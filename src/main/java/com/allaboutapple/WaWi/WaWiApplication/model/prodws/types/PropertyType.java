package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

public class PropertyType {
    protected PropertyValueType propertyValue;
    protected UnitPriceType price;
    protected String name;
    protected String shortName;
    protected String description;
    protected String annotation;

    public PropertyValueType getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(PropertyValueType propertyValue) {
        this.propertyValue = propertyValue;
    }

    public UnitPriceType getPrice() {
        return price;
    }

    public void setPrice(UnitPriceType price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
