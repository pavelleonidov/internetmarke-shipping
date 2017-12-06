package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.math.BigInteger;

public class FormulaComponentType {
    protected int prodwsID;
    protected BigInteger version;
    protected String component;

    public int getProdwsID() {
        return prodwsID;
    }

    public void setProdwsID(int prodwsID) {
        this.prodwsID = prodwsID;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
}
