package com.allaboutapple.WaWi.WaWiApplication.model;

public class Settings {
    private String magento2ApiUrl;
    private String magento2AccessToken;
    private String magento2AccessTokenSecret;

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
}
