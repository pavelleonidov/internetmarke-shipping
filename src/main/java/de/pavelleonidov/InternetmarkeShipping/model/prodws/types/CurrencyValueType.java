package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

public class CurrencyValueType {
    protected CurrencyAmountType minValue;
    protected CurrencyAmountType maxValue;
    protected CurrencyAmountType fixValue;

    public CurrencyAmountType getMinValue() {
        return minValue;
    }

    public void setMinValue(CurrencyAmountType minValue) {
        this.minValue = minValue;
    }

    public CurrencyAmountType getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(CurrencyAmountType maxValue) {
        this.maxValue = maxValue;
    }

    public CurrencyAmountType getFixValue() {
        return fixValue;
    }

    public void setFixValue(CurrencyAmountType fixValue) {
        this.fixValue = fixValue;
    }
}
