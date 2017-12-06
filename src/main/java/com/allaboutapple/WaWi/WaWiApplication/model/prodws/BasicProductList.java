package com.allaboutapple.WaWi.WaWiApplication.model.prodws;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement(name = "basicproducts")
@XmlAccessorType (XmlAccessType.FIELD)
@XmlSeeAlso({ProductList.class})
public class BasicProductList extends ProductList<BasicProduct> {
    public BasicProductList() {
        products = getProducts();
    }
}
