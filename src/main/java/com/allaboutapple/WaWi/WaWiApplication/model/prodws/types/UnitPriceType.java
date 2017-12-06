package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.list.TempPriceList;

import java.math.BigDecimal;

public class UnitPriceType {
    protected CurrencyAmountType netPrice;
    protected BigDecimal rate;
    protected CurrencyAmountType grossPrice;
    protected ValidityType priceValidity;
    protected TempPriceList tempPriceList;

    public CurrencyAmountType getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(CurrencyAmountType netPrice) {
        this.netPrice = netPrice;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public CurrencyAmountType getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(CurrencyAmountType grossPrice) {
        this.grossPrice = grossPrice;
    }

    public ValidityType getPriceValidity() {
        return priceValidity;
    }

    public void setPriceValidity(ValidityType priceValidity) {
        this.priceValidity = priceValidity;
    }

    public TempPriceList getTempPriceList() {
        return tempPriceList;
    }

    public void setTempPriceList(TempPriceList tempPriceList) {
        this.tempPriceList = tempPriceList;
    }
}
