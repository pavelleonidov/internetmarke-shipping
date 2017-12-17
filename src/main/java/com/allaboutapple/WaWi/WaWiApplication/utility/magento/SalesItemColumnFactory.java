package com.allaboutapple.WaWi.WaWiApplication.utility.magento;

import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.SalesItemTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.utility.ColumnFactory;

public class SalesItemColumnFactory extends ColumnFactory<SalesItemTreeObject> {

    private static final SalesItemColumnFactory OBJ = new SalesItemColumnFactory();

    public static SalesItemColumnFactory getInstance() {
        return OBJ;
    }
}