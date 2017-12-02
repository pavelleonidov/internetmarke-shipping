package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.math.BigInteger;
import java.util.Date;

public class CountryType {

    protected String name;

    protected String alternativeName;

    protected String insularAreaOf;

    protected String annotation;

    protected String alpha2ISOCode;

    protected String alpha3ISOCode;

    protected BigInteger numISOCode;

    protected String pseudoCode;

    protected boolean syntheticKey;


    protected Date validFrom;

    protected Date validTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlternativeName() {
        return alternativeName;
    }

    public void setAlternativeName(String alternativeName) {
        this.alternativeName = alternativeName;
    }

    public String getInsularAreaOf() {
        return insularAreaOf;
    }

    public void setInsularAreaOf(String insularAreaOf) {
        this.insularAreaOf = insularAreaOf;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getAlpha2ISOCode() {
        return alpha2ISOCode;
    }

    public void setAlpha2ISOCode(String alpha2ISOCode) {
        this.alpha2ISOCode = alpha2ISOCode;
    }

    public String getAlpha3ISOCode() {
        return alpha3ISOCode;
    }

    public void setAlpha3ISOCode(String alpha3ISOCode) {
        this.alpha3ISOCode = alpha3ISOCode;
    }

    public BigInteger getNumISOCode() {
        return numISOCode;
    }

    public void setNumISOCode(BigInteger numISOCode) {
        this.numISOCode = numISOCode;
    }

    public String getPseudoCode() {
        return pseudoCode;
    }

    public void setPseudoCode(String pseudoCode) {
        this.pseudoCode = pseudoCode;
    }

    public boolean isSyntheticKey() {
        return syntheticKey;
    }

    public void setSyntheticKey(boolean syntheticKey) {
        this.syntheticKey = syntheticKey;
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
