package com.allaboutapple.WaWi.WaWiApplication.model.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "basicproducts")
@XmlAccessorType (XmlAccessType.FIELD)
public class BasicProductList extends ProductList<BasicProduct> {
    @XmlElement(name = "product")
    protected List<BasicProduct> products = null;
    public BasicProductList() {
        products = getProducts();
    }
}
