package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.util.Date;

public class ValidityType {
    protected Date validFrom;
    protected Date validTo;

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
