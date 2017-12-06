package com.allaboutapple.WaWi.WaWiApplication.model.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "salesproducts")
@XmlAccessorType (XmlAccessType.FIELD)
public class SalesProductList extends ProductList<SalesProduct> {

    @XmlElement(name = "product")
    protected List<SalesProduct> products = null;

    public SalesProductList() {
        products = getProducts();
    }

}
