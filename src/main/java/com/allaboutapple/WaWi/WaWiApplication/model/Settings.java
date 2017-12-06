package com.allaboutapple.WaWi.WaWiApplication.model;

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
}
