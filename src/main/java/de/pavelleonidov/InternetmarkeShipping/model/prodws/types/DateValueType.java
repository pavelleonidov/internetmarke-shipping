package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.util.Date;

public class DateValueType {

    protected Date firstDate;

    protected Date lastDate;

    protected Date fixDate;

    public Date getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(Date firstDate) {
        this.firstDate = firstDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Date getFixDate() {
        return fixDate;
    }

    public void setFixDate(Date fixDate) {
        this.fixDate = fixDate;
    }
}
