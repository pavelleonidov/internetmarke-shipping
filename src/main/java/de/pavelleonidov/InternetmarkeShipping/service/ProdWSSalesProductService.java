package de.pavelleonidov.InternetmarkeShipping.service;

import de.pavelleonidov.InternetmarkeShipping.Main;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProduct;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProductList;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.ExtendedIdentifierType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.SalesProductType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.SalesProductType;

import javax.xml.bind.JAXBException;

public class ProdWSSalesProductService extends ProdWSProductService<SalesProductList, SalesProductType> {

    private static final ProdWSSalesProductService OBJ = new ProdWSSalesProductService();

    public static ProdWSSalesProductService getInstance() {
        return OBJ;
    }

    public ProdWSSalesProductService() {
        setFileName(Main.getHomeDirectory() + "prodws_sales_products.xml");
    }

    public SalesProductList getProducts() {



        return getObject();
    }

    public void saveProducts() {

        object = new SalesProductList();

        responseProducts = getProductListResponse().getResponse().getSalesProductList().getSalesProduct();
        responseProducts.forEach((product) -> {
            SalesProduct salesProduct = new SalesProduct();
            ExtendedIdentifierType identifierType = new ExtendedIdentifierType();

            salesProduct.setProdWSId(product.getExtendedIdentifier().getProdWSID());
            salesProduct.setDestination(product.getExtendedIdentifier().getDestination());
            salesProduct.setName(product.getExtendedIdentifier().getName());
            salesProduct.setDescription(product.getExtendedIdentifier().getDescription());
            salesProduct.setAnnotation(product.getExtendedIdentifier().getAnnotation());
            salesProduct.setBranche(product.getExtendedIdentifier().getBranche());
            salesProduct.setDestination(product.getExtendedIdentifier().getDestination());
            salesProduct.setTransport(product.getExtendedIdentifier().getTransport());
            salesProduct.setType(product.getExtendedIdentifier().getType());
            salesProduct.setState(product.getExtendedIdentifier().getState());

            if(product.getExtendedIdentifier().getExternIdentifier().size() > 0) {
                salesProduct.setId(product.getExtendedIdentifier().getExternIdentifier().get(0).getId());
            }
            salesProduct.setGrossPriceValue(product.getPriceDefinition().getPrice().getCalculatedGrossPrice().getValue());
            salesProduct.setGrossPriceCurrency(product.getPriceDefinition().getPrice().getCalculatedGrossPrice().getCurrency());
            salesProduct.setGrossPriceCalculated(product.getPriceDefinition().getPrice().getCalculatedGrossPrice().isCalculated());

            object.addProduct(salesProduct);
        });

        try {
            marshal();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    protected Class getObjectClass() {
        return SalesProductList.class;
    }
}
