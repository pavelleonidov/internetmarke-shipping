package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import java.math.BigDecimal;

public class CurrencyAmountType {

    protected String sign;
    protected BigDecimal value;
    protected String currency;
    protected boolean calculated;

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isCalculated() {
        return calculated;
    }

    public void setCalculated(boolean calculated) {
        this.calculated = calculated;
    }
}
