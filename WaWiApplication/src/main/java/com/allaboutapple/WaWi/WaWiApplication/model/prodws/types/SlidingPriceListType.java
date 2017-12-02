package com.allaboutapple.WaWi.WaWiApplication.model.prodws.types;

public class SlidingPriceListType {
    protected NumericValueType slidingScale;
    protected UnitPriceType price;

    public NumericValueType getSlidingScale() {
        return slidingScale;
    }

    public void setSlidingScale(NumericValueType slidingScale) {
        this.slidingScale = slidingScale;
    }

    public UnitPriceType getPrice() {
        return price;
    }

    public void setPrice(UnitPriceType price) {
        this.price = price;
    }
}
