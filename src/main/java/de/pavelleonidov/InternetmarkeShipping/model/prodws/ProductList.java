package de.pavelleonidov.InternetmarkeShipping.model.prodws;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlTransient
@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
abstract public class ProductList<T> {
    @XmlElements({
        @XmlElement(name = "salesproduct", type = SalesProduct.class),
        @XmlElement(name = "basicproduct", type = BasicProduct.class)
    })
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
