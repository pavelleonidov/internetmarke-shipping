package com.allaboutapple.WaWi.WaWiApplication.model.prodws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductList<T> {
    @XmlElement(name = "product")
    protected List<T> products = null;

    public List<T> getProducts() {
        if(products == null) {
            products = new ArrayList<T>();
        }
        return products;
    }

    public void setProducts(List<T> products) {
        this.products = products;
    }

    public void addProduct(T product) {
        this.products.add(product);
    }
}
