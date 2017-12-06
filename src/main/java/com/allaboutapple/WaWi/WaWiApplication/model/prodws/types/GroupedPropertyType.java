package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.DocumentReferenceList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.FormatedTextList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.PropertyList;

public class GroupedPropertyType {
    protected PropertyList propertyList;
    protected UnitPriceType price;
    protected DocumentReferenceList documentReferenceList;
    protected FormatedTextList formatedTextList;
    protected String name;
    protected String shortName;
    protected String description;
    protected String annotation;

    public PropertyList getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(PropertyList propertyList) {
        this.propertyList = propertyList;
    }

    public UnitPriceType getPrice() {
        return price;
    }

    public void setPrice(UnitPriceType price) {
        this.price = price;
    }

    public DocumentReferenceList getDocumentReferenceList() {
        return documentReferenceList;
    }

    public void setDocumentReferenceList(DocumentReferenceList documentReferenceList) {
        this.documentReferenceList = documentReferenceList;
    }

    public FormatedTextList getFormatedTextList() {
        return formatedTextList;
    }

    public void setFormatedTextList(FormatedTextList formatedTextList) {
        this.formatedTextList = formatedTextList;
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
