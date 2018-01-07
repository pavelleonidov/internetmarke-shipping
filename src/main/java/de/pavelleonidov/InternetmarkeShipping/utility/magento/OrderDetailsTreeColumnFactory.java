package de.pavelleonidov.InternetmarkeShipping.utility.magento;

import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderDetailsTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderTreeObject;
import de.pavelleonidov.InternetmarkeShipping.utility.ColumnFactory;
import de.pavelleonidov.InternetmarkeShipping.utility.ColumnFactory;

public class OrderDetailsTreeColumnFactory extends ColumnFactory<OrderDetailsTreeObject> {

    private static final OrderDetailsTreeColumnFactory OBJ = new OrderDetailsTreeColumnFactory();

    public static OrderDetailsTreeColumnFactory getInstance() {
        return OBJ;
    }
}
