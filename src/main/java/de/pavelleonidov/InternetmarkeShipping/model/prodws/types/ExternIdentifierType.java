package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.math.BigInteger;

public class ExternIdentifierType {
    protected String source;
    protected String id;
    protected String name;
    protected String description;
    protected String annotation;
    protected BigInteger firstPPLVersion;
    protected BigInteger lastPPLVersion;
    protected BigInteger actualPPLVersion;
    protected String sapProductType;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public BigInteger getFirstPPLVersion() {
        return firstPPLVersion;
    }

    public void setFirstPPLVersion(BigInteger firstPPLVersion) {
        this.firstPPLVersion = firstPPLVersion;
    }

    public BigInteger getLastPPLVersion() {
        return lastPPLVersion;
    }

    public void setLastPPLVersion(BigInteger lastPPLVersion) {
        this.lastPPLVersion = lastPPLVersion;
    }

    public BigInteger getActualPPLVersion() {
        return actualPPLVersion;
    }

    public void setActualPPLVersion(BigInteger actualPPLVersion) {
        this.actualPPLVersion = actualPPLVersion;
    }

    public String getSapProductType() {
        return sapProductType;
    }

    public void setSapProductType(String sapProductType) {
        this.sapProductType = sapProductType;
    }
}
