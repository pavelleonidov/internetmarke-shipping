package de.pavelleonidov.InternetmarkeShipping.utility.prodws;

import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderDetailsTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.ProdWSDetailsTreeObject;
import de.pavelleonidov.InternetmarkeShipping.utility.ColumnFactory;

public class ProdWSDetailsColumnFactory extends ColumnFactory<ProdWSDetailsTreeObject> {

    private static final ProdWSDetailsColumnFactory OBJ = new ProdWSDetailsColumnFactory();

    public static ProdWSDetailsColumnFactory getInstance() {
        return OBJ;
    }
}
