package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.math.BigInteger;
import java.util.List;

public class ExtendedIdentifierType {
    protected List<ExternIdentifierType> externIdentifier;
    protected String prodWSID;
    protected String name;
    protected String shortName;
    protected String description;
    protected String annotation;
    protected String branche;
    protected String destination;
    protected String transport;
    protected String type;
    protected String state;
    protected BigInteger version;

    public List<ExternIdentifierType> getExternIdentifier() {
        return externIdentifier;
    }

    public void setExternIdentifier(List<ExternIdentifierType> externIdentifier) {
        this.externIdentifier = externIdentifier;
    }

    public String getProdWSID() {
        return prodWSID;
    }

    public void setProdWSID(String prodWSID) {
        this.prodWSID = prodWSID;
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

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }
}
