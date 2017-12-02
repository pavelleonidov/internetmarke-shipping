package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.util.List;

public class NationalZipCodeListType {
    protected String name;
    protected String description;
    protected List<String> nationalZipCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getNationalZipCode() {
        return nationalZipCode;
    }

    public void setNationalZipCode(List<String> nationalZipCode) {
        this.nationalZipCode = nationalZipCode;
    }
}
