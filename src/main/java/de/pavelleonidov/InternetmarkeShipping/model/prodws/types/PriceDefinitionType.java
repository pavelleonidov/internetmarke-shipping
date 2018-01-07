package de.pavelleonidov.InternetmarkeShipping.model.prodws.types;

import de.pavelleonidov.InternetmarkeShipping.model.prodws.list.TempPriceList;

public class PriceDefinitionType {
    protected PriceType price;
    protected TempPriceList tempPriceList;
    protected PriceType minimalPrice;
    protected PriceFormulaType priceFormula;


    public PriceType getPrice() {
        return price;
    }

    public void setPrice(PriceType price) {
        this.price = price;
    }

    public TempPriceList getTempPriceList() {
        return tempPriceList;
    }

    public void setTempPriceList(TempPriceList tempPriceList) {
        this.tempPriceList = tempPriceList;
    }

    public PriceType getMinimalPrice() {
        return minimalPrice;
    }

    public void setMinimalPrice(PriceType minimalPrice) {
        this.minimalPrice = minimalPrice;
    }

    public PriceFormulaType getPriceFormula() {
        return priceFormula;
    }

    public void setPriceFormula(PriceFormulaType priceFormula) {
        this.priceFormula = priceFormula;
    }
}
