package de.pavelleonidov.InternetmarkeShipping.utility.magento;

import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.magento.SalesItemTreeObject;
import de.pavelleonidov.InternetmarkeShipping.utility.ColumnFactory;

public class SalesItemColumnFactory extends ColumnFactory<SalesItemTreeObject> {

    private static final SalesItemColumnFactory OBJ = new SalesItemColumnFactory();

    public static SalesItemColumnFactory getInstance() {
        return OBJ;
    }
}
