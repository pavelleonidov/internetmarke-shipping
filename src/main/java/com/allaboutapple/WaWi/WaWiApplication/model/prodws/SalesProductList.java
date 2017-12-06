package com.allaboutapple.WaWi.WaWiApplication.model.prodws;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "salesproducts")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlSeeAlso({ProductList.class})
public class SalesProductList extends ProductList<SalesProduct> {
    public SalesProductList() {
        products = getProducts();
    }
}
