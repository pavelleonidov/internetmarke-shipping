package de.pavelleonidov.InternetmarkeShipping.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Settings")
public class Settings {
    private String magento2ApiUrl;
    private String magento2AccessToken;
    private String magento2AccessTokenSecret;
    private String prodWSUsername;
    private String prodWSPassword;
    private String prodWSMandantId;
    private String pcfOneClickUsername;
    private String pcfOneClickPassword;
    private String pcfOneClickPartnerId;
    private String pcfOneClickPartnerSignature;

    private String senderCompany;
    private String senderForename;
    private String senderSurname;
    private String senderHouseNumber;

    private String senderStreet;
    private String senderZip;
    private String senderCity;

    private int currentPrinter;
    private boolean isLabelPrinter;

    private String internetmarkeDestination;
    private String invoiceDestination;

    public String getMagento2ApiUrl() {
        return magento2ApiUrl;
    }

    public void setMagento2ApiUrl(String magento2ApiUrl) {
        this.magento2ApiUrl = magento2ApiUrl;
    }

    public String getMagento2AccessToken() {
        return magento2AccessToken;
    }

    public void setMagento2AccessToken(String magento2AccessToken) {
        this.magento2AccessToken = magento2AccessToken;
    }

    public String getMagento2AccessTokenSecret() {
        return magento2AccessTokenSecret;
    }

    public void setMagento2AccessTokenSecret(String magento2AccessTokenSecret) {
        this.magento2AccessTokenSecret = magento2AccessTokenSecret;
    }

    public String getProdWSUsername() {
        return prodWSUsername;
    }

    public void setProdWSUsername(String prodWSUsername) {
        this.prodWSUsername = prodWSUsername;
    }

    public String getProdWSPassword() {
        return prodWSPassword;
    }

    public void setProdWSPassword(String prodWSPassword) {
        this.prodWSPassword = prodWSPassword;
    }

    public String getProdWSMandantId() {
        return prodWSMandantId;
    }

    public void setProdWSMandantId(String prodWSMandantId) {
        this.prodWSMandantId = prodWSMandantId;
    }

    public String getPcfOneClickUsername() {
        return pcfOneClickUsername;
    }

    public void setPcfOneClickUsername(String pcfOneClickUsername) {
        this.pcfOneClickUsername = pcfOneClickUsername;
    }

    public String getPcfOneClickPassword() {
        return pcfOneClickPassword;
    }

    public void setPcfOneClickPassword(String pcfOneClickPassword) {
        this.pcfOneClickPassword = pcfOneClickPassword;
    }

    public int getCurrentPrinter() {
        return currentPrinter;
    }

    public void setCurrentPrinter(int currentPrinter) {
        this.currentPrinter = currentPrinter;
    }

    public String getPcfOneClickPartnerId() {
        return pcfOneClickPartnerId;
    }

    public void setPcfOneClickPartnerId(String pcfOneClickPartnerId) {
        this.pcfOneClickPartnerId = pcfOneClickPartnerId;
    }

    public String getPcfOneClickPartnerSignature() {
        return pcfOneClickPartnerSignature;
    }

    public void setPcfOneClickPartnerSignature(String pcfOneClickPartnerSignature) {
        this.pcfOneClickPartnerSignature = pcfOneClickPartnerSignature;
    }

    public String getSenderCompany() {
        return senderCompany;
    }

    public void setSenderCompany(String senderCompany) {
        this.senderCompany = senderCompany;
    }

    public String getSenderForename() {
        return senderForename;
    }

    public void setSenderForename(String senderForename) {
        this.senderForename = senderForename;
    }

    public String getSenderSurname() {
        return senderSurname;
    }

    public void setSenderSurname(String senderSurname) {
        this.senderSurname = senderSurname;
    }

    public String getSenderHouseNumber() {
        return senderHouseNumber;
    }

    public void setSenderHouseNumber(String senderHouseNumber) {
        this.senderHouseNumber = senderHouseNumber;
    }

    public String getSenderZip() {
        return senderZip;
    }

    public void setSenderZip(String senderZip) {
        this.senderZip = senderZip;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderStreet() {
        return senderStreet;
    }

    public void setSenderStreet(String senderStreet) {
        this.senderStreet = senderStreet;
    }

    public boolean isLabelPrinter() {
        return isLabelPrinter;
    }

    public void setLabelPrinter(boolean labelPrinter) {
        isLabelPrinter = labelPrinter;
    }

    public String getInternetmarkeDestination() {
        return internetmarkeDestination;
    }

    public void setInternetmarkeDestination(String internetmarkeDestination) {
        this.internetmarkeDestination = internetmarkeDestination;
    }

    public String getInvoiceDestination() {
        return invoiceDestination;
    }

    public void setInvoiceDestination(String invoiceDestination) {
        this.invoiceDestination = invoiceDestination;
    }
}
