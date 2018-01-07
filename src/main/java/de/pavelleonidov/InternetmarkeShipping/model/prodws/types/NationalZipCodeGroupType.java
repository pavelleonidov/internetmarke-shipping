package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.NationalZipCodeArea;

public class NationalZipCodeGroupType {
    protected String name;
    protected String description;
    protected String routeRegion;
    protected String routeZone;
    protected NationalZipCodeArea nationalZipCodeArea;

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

    public String getRouteRegion() {
        return routeRegion;
    }

    public void setRouteRegion(String routeRegion) {
        this.routeRegion = routeRegion;
    }

    public String getRouteZone() {
        return routeZone;
    }

    public void setRouteZone(String routeZone) {
        this.routeZone = routeZone;
    }

    public NationalZipCodeArea getNationalZipCodeArea() {
        return nationalZipCodeArea;
    }

    public void setNationalZipCodeArea(NationalZipCodeArea nationalZipCodeArea) {
        this.nationalZipCodeArea = nationalZipCodeArea;
    }
}
