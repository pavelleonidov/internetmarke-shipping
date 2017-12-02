package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

import java.math.BigDecimal;

public class NumericValueType {
    protected BigDecimal minValue;
    protected BigDecimal maxValue;
    protected BigDecimal fixValue;
    protected String unit;

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public BigDecimal getFixValue() {
        return fixValue;
    }

    public void setFixValue(BigDecimal fixValue) {
        this.fixValue = fixValue;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
