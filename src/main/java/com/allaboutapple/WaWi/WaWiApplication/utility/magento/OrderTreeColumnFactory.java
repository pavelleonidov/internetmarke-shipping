package com.allaboutapple.WaWi.WaWiApplication.utility.magento;

import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.utility.ColumnFactory;
import com.jfoenix.controls.JFXTreeTableColumn;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TreeTableColumn;
import javafx.util.Callback;

public class OrderTreeColumnFactory extends ColumnFactory<OrderTreeObject> {

    private static final OrderTreeColumnFactory OBJ = new OrderTreeColumnFactory();

    public static OrderTreeColumnFactory getInstance() {
        return OBJ;
    }
}