package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.util.Date;

public class TempPriceType {

    protected PriceType price;
    protected Date validFrom;
    protected Date validTo;

    public PriceType getPrice() {
        return price;
    }

    public void setPrice(PriceType price) {
        this.price = price;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
}
