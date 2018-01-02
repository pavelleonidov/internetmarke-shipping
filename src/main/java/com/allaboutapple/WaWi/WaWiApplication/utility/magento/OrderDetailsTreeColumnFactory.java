package com.allaboutapple.WaWi.WaWiApplication.utility.magento;

import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderDetailsTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.utility.ColumnFactory;

public class OrderDetailsTreeColumnFactory extends ColumnFactory<OrderDetailsTreeObject> {

    private static final OrderDetailsTreeColumnFactory OBJ = new OrderDetailsTreeColumnFactory();

    public static OrderDetailsTreeColumnFactory getInstance() {
        return OBJ;
    }
}