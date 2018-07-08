package de.pavelleonidov.InternetmarkeShipping.service;

import de.pavelleonidov.InternetmarkeShipping.Main;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProduct;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProductList;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.types.ExtendedIdentifierType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.GroupedPropertyType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.PropertyType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.SalesProductType;
import de.pavelleonidov.InternetmarkeShipping.service.prodws.SalesProductType;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.*;

public class ProdWSSalesProductService extends ProdWSProductService<SalesProductList, SalesProductType> {

    private static final ProdWSSalesProductService OBJ = new ProdWSSalesProductService();

    public static ProdWSSalesProductService getInstance() {
        return OBJ;
    }

    public ProdWSSalesProductService() {
        setFileName(Main.getHomeDirectory() + "/prodws_sales_products.xml");
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


            if(product.getDimensionList() != null) {
                salesProduct.setMinLength(product.getDimensionList().getLength().getMinValue() + product.getDimensionList().getLength().getUnit());
                salesProduct.setMaxLength(product.getDimensionList().getLength().getMaxValue() + product.getDimensionList().getLength().getUnit());
                salesProduct.setMinHeight(product.getDimensionList().getHeight().getMinValue() + product.getDimensionList().getLength().getUnit());
                salesProduct.setMaxHeight(product.getDimensionList().getHeight().getMaxValue() + product.getDimensionList().getLength().getUnit());
                salesProduct.setMinWidth(product.getDimensionList().getWidth().getMinValue() + product.getDimensionList().getLength().getUnit());
                salesProduct.setMaxWidth(product.getDimensionList().getWidth().getMaxValue() + product.getDimensionList().getLength().getUnit());

            }

            if(product.getWeight() != null) {
                salesProduct.setMinWeight(product.getWeight().getMinValue().toString() + product.getWeight().getUnit());
                salesProduct.setMaxWeight(product.getWeight().getMaxValue().toString() + product.getWeight().getUnit());

            }

            Boolean trackingPossible = false;

            String allowedForm = "";

            if(product.getPropertyList() != null) {
                List<PropertyType> trackingProperties = product.getPropertyList().getProperty().stream().filter(
                        p -> p.getName().equals("extProp_Sendungsverfolgung")).collect(Collectors.toList());


                List<PropertyType> formProperties = product.getPropertyList().getProperty().stream().filter(
                        p -> p.getName().equals("AllowedForm")).collect(Collectors.toList());

                if(!trackingProperties.isEmpty()) {
                    trackingPossible = trackingProperties.get(0).getPropertyValue().isBooleanValue();

                }

                if(trackingPossible) {
                    System.out.println(product.getExtendedIdentifier().getName());
                }

                if(!formProperties.isEmpty()) {
                    allowedForm = formProperties.get(0).getPropertyValue().getAlphanumericValue().getFixValue();
                }

            }




            salesProduct.setTrackingPossible(trackingPossible);
            salesProduct.setAllowedForm(allowedForm);

            if(product.getExtendedIdentifier().getExternIdentifier().size() > 0) {
                salesProduct.setId(product.getExtendedIdentifier().getExternIdentifier().get(0).getId());
            }
            salesProduct.setGrossPriceValue(product.getPriceDefinition().getPrice().getCalculatedGrossPrice().getValue());
            salesProduct.setGrossPriceCurrency(product.getPriceDefinition().getPrice().getCalculatedGrossPrice().getCurrency());
            salesProduct.setGrossPriceCalculated(product.getPriceDefinition().getPrice().getCalculatedGrossPrice().isCalculated());



            object.addProduct(salesProduct);
        });

        Collections.sort(object.getProducts(), new Comparator<SalesProduct>() {
            @Override
            public int compare(SalesProduct o1, SalesProduct o2) {
                return Integer.valueOf(o1.getId()).compareTo(Integer.valueOf(o2.getId()));
            }
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
