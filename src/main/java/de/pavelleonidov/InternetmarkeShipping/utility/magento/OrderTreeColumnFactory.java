package de.pavelleonidov.InternetmarkeShipping.utility.magento;

import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderTreeObject;
import de.pavelleonidov.InternetmarkeShipping.utility.ColumnFactory;
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
