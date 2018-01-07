package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

public class PriceType {
    protected CurrencyAmountType calculatedNetPrice;
    protected CurrencyAmountType calculatedGrossPrice;
    protected CurrencyAmountType commercialBalance;
    protected CurrencyAmountType commercialGrossPrice;
    protected ValidityType priceValidity;

    public CurrencyAmountType getCalculatedNetPrice() {
        return calculatedNetPrice;
    }

    public void setCalculatedNetPrice(CurrencyAmountType calculatedNetPrice) {
        this.calculatedNetPrice = calculatedNetPrice;
    }

    public CurrencyAmountType getCalculatedGrossPrice() {
        return calculatedGrossPrice;
    }

    public void setCalculatedGrossPrice(CurrencyAmountType calculatedGrossPrice) {
        this.calculatedGrossPrice = calculatedGrossPrice;
    }

    public CurrencyAmountType getCommercialBalance() {
        return commercialBalance;
    }

    public void setCommercialBalance(CurrencyAmountType commercialBalance) {
        this.commercialBalance = commercialBalance;
    }

    public CurrencyAmountType getCommercialGrossPrice() {
        return commercialGrossPrice;
    }

    public void setCommercialGrossPrice(CurrencyAmountType commercialGrossPrice) {
        this.commercialGrossPrice = commercialGrossPrice;
    }

    public ValidityType getPriceValidity() {
        return priceValidity;
    }

    public void setPriceValidity(ValidityType priceValidity) {
        this.priceValidity = priceValidity;
    }
}
