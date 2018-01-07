package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;


public class PropertyValueType {
    protected AlphanumericValueType alphanumericValue;
    protected NumericValueType numericValue;
    protected Boolean booleanValue;
    protected DateValueType dateValue;
    protected CurrencyValueType currencyValue;
    protected String hyperlinkValue;

    public AlphanumericValueType getAlphanumericValue() {
        return alphanumericValue;
    }

    public void setAlphanumericValue(AlphanumericValueType alphanumericValue) {
        this.alphanumericValue = alphanumericValue;
    }

    public NumericValueType getNumericValue() {
        return numericValue;
    }

    public void setNumericValue(NumericValueType numericValue) {
        this.numericValue = numericValue;
    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    public DateValueType getDateValue() {
        return dateValue;
    }

    public void setDateValue(DateValueType dateValue) {
        this.dateValue = dateValue;
    }

    public CurrencyValueType getCurrencyValue() {
        return currencyValue;
    }

    public void setCurrencyValue(CurrencyValueType currencyValue) {
        this.currencyValue = currencyValue;
    }

    public String getHyperlinkValue() {
        return hyperlinkValue;
    }

    public void setHyperlinkValue(String hyperlinkValue) {
        this.hyperlinkValue = hyperlinkValue;
    }
}
