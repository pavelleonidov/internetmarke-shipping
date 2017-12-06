package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

public class DestinationAreaType {
    protected NationalDestinationAreaType nationalDestinationArea;
    protected InternationalDestinationAreaType internationalDestinationArea;

    public NationalDestinationAreaType getNationalDestinationArea() {
        return nationalDestinationArea;
    }

    public void setNationalDestinationArea(NationalDestinationAreaType nationalDestinationArea) {
        this.nationalDestinationArea = nationalDestinationArea;
    }

    public InternationalDestinationAreaType getInternationalDestinationArea() {
        return internationalDestinationArea;
    }

    public void setInternationalDestinationArea(InternationalDestinationAreaType internationalDestinationArea) {
        this.internationalDestinationArea = internationalDestinationArea;
    }
}
