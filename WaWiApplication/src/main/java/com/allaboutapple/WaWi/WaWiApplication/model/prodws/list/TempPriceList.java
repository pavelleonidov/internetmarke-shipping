package com.allaboutapple.WaWi.WaWiApplication.model.prodws.list;

import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.TempPriceType;

import java.util.ArrayList;
import java.util.List;

public class TempPriceList {

    protected List<TempPriceType> tempPrice;


    public List<TempPriceType> getTempPrice() {
        if (tempPrice == null) {
            tempPrice = new ArrayList<TempPriceType>();
        }
        return this.tempPrice;
    }
}
