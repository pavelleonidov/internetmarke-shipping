package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.SalesItemTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProduct;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.InternetmarkeService;
import com.allaboutapple.WaWi.WaWiApplication.service.PrinterService;
import com.allaboutapple.WaWi.WaWiApplication.service.ProdWSSalesProductService;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.OrderTreeColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.SalesItemColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.view.SettingsView;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import de.felixroske.jfxsupport.FXMLController;
import io.swagger.client.api.CustomerAddressRepositoryV1Api;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.stage.Modality;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@FXMLController
public class MainController extends AbstractController {

    @FXML
    private JFXTreeTableView<OrderTreeObject> magentoCustomerTable;

    @FXML
    private JFXTreeTableView<SalesItemTreeObject> orderDetailsProducts;

    @FXML
    private JFXListView<SalesProduct> prodWSProducts;

    protected AtomicReference<SalesProduct> selectedProduct;

    protected AtomicReference<io.swagger.client.model.SalesDataOrderInterface> selectedOrder;

    @FXML
    void initialize() {

        selectedProduct = new AtomicReference<>();
        selectedOrder = new AtomicReference<>();

        JFXTreeTableColumn<OrderTreeObject, String> orderIdColumn = OrderTreeColumnFactory.getInstance().createColumn("Bestellnummer", "orderId");
        JFXTreeTableColumn<OrderTreeObject, String> customerNameColumn = OrderTreeColumnFactory.getInstance().createColumn("Kunde", "customerName");
        JFXTreeTableColumn<OrderTreeObject, String> channelColumn = OrderTreeColumnFactory.getInstance().createColumn("Kanal", "channel");
        JFXTreeTableColumn<OrderTreeObject, String> paymentMethodColumn = OrderTreeColumnFactory.getInstance().createColumn("Bezahlmethode", "paymentMethod");
        JFXTreeTableColumn<OrderTreeObject, String> statusColumn = OrderTreeColumnFactory.getInstance().createColumn("Status", "status");
        JFXTreeTableColumn<OrderTreeObject, String> createdAtColumn = OrderTreeColumnFactory.getInstance().createColumn("Datum", "createdAt");


        JFXTreeTableColumn<SalesItemTreeObject, String> productNameColumn = SalesItemColumnFactory.getInstance().createColumn("Name", "name", 150);
        JFXTreeTableColumn<SalesItemTreeObject, String> productPriceColumn = SalesItemColumnFactory.getInstance().createColumn("Preis", "price", 120);
        JFXTreeTableColumn<SalesItemTreeObject, String> productSkuColumn = SalesItemColumnFactory.getInstance().createColumn("SKU", "sku", 50);


        io.swagger.client.api.SalesOrderRepositoryV1Api orderApi = new io.swagger.client.api.SalesOrderRepositoryV1Api();
        // http://allabout-apple.com/rest/default/V1/orders?searchCriteria[filter_groups][0][filters][0][condition_type]=eq&searchCriteria[filter_groups][0][filters][0][field]=status&searchCriteria[sortOrders][0][field]=created_at&searchCriteria[sortOrders][0][direction]=desc&searchCriteria[filter_groups][0][filters][0][value]=processing


        SalesProductList productList = ProdWSSalesProductService.getInstance().getProducts();

        ObservableList<SalesProduct> observableList = FXCollections.observableList(productList.getProducts());
        prodWSProducts.setItems(observableList);
        prodWSProducts.setCellFactory((final ListView<SalesProduct> listView) -> {
            return new ListCell<SalesProduct>() {
                @Override
                protected void updateItem(SalesProduct t, boolean bln) {
                    super.updateItem(t, bln);
                    if(t != null) {
                        setText(t.getName());
                    }
                }
            };
        });



        if(SettingsController.getSettings().getMagento2AccessToken() != null) {
                orderApi.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
                orderApi.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
                orderApi.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);


                try {
                    //io.swagger.client.model.SalesDataOrderInterface order = orderApi.salesOrderRepositoryV1GetGet(1);
                    io.swagger.client.model.SalesDataOrderSearchResultInterface orders = orderApi.salesOrderRepositoryV1GetListGet(
                            "status",
                            "processing",
                            "eq",
                            "created_at",
                            "desc",
                            100,
                            1,
                            null,
                            null,
                            null);



			/*FrameworkSearchCriteriaInterface searchCriteria = new FrameworkSearchCriteriaInterface();
			FrameworkSearchFilterGroup searchFilterGroup = new FrameworkSearchFilterGroup();
			FrameworkFilter frameworkFilter = new FrameworkFilter();

			frameworkFilter.setField("status");
			frameworkFilter.setValue("processing");
			frameworkFilter.setConditionType("eq");

			FrameworkSortOrder sortOrder = new FrameworkSortOrder();
			sortOrder.setField("created_at");
			sortOrder.setDirection("desc");


			searchFilterGroup.addFiltersItem(frameworkFilter);
			searchCriteria.addSortOrdersItem(sortOrder);
			searchCriteria.setPageSize(20);
			searchCriteria.setCurrentPage(1);

			orders.setSearchCriteria(searchCriteria);*/

                    //		searchCriteria.addFilterGroupsItem(new FrameworkSearchFilterGroup().)
                    //orders.setSearchCriteria();
                    System.out.println(orders.getTotalCount());

                    ObservableList<OrderTreeObject> orderTreeObjects = FXCollections.observableArrayList();
                    orders.getItems().forEach(item -> {
                        orderTreeObjects.add(new OrderTreeObject(item));
                        System.out.println(item);
                    });


                    final TreeItem<OrderTreeObject> root = new RecursiveTreeItem<OrderTreeObject>(orderTreeObjects, RecursiveTreeObject::getChildren);


                    magentoCustomerTable.setRoot(root);
                    magentoCustomerTable.setShowRoot(false);
                    magentoCustomerTable.getColumns().setAll(orderIdColumn, customerNameColumn, channelColumn, paymentMethodColumn, createdAtColumn, statusColumn);

                    orderDetailsProducts.getColumns().setAll(productNameColumn, productSkuColumn, productPriceColumn);

                    //magentoCustomerTable.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
                    //   System.out.println("CLICKED");
                    // });
                    magentoCustomerTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                        OrderTreeObject currentOrder = newValue.getValue();
                        io.swagger.client.model.SalesDataOrderInterface responseOrder = currentOrder.getResponseOrder();

                        ObservableList<SalesItemTreeObject> salesItemTreeObjects = FXCollections.observableArrayList();
                        responseOrder.getItems().forEach(item -> {
                            salesItemTreeObjects.add(new SalesItemTreeObject(item));
                            System.out.println(item);
                        });

                        selectedOrder.set(newValue.getValue().getResponseOrder());
                        System.out.println(selectedOrder.get().getIncrementId());

                        final TreeItem<SalesItemTreeObject> rootProduct = new RecursiveTreeItem<SalesItemTreeObject>(salesItemTreeObjects, RecursiveTreeObject::getChildren);
                        orderDetailsProducts.setRoot(rootProduct);
                        orderDetailsProducts.setShowRoot(false);
                    });




                    prodWSProducts.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                        selectedProduct.set(newValue);
                        System.out.println(selectedProduct.get().getName());
                    });



                } catch (io.swagger.client.ApiException e) {
                    e.printStackTrace();

                    System.out.println(e.getResponseBody());
                }
            }

    }

    public void triggerPrintAndShipProduct(final Event e) {
        SalesProduct product = selectedProduct.get();


        io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();

        io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getBillingAddress();

        String formattedStreet = address.getStreet().get(0);
        String[] streetNo = formattedStreet.split(" ");


        io.swagger.client.api.SalesOrderAddressRepositoryV1Api addressApi = new io.swagger.client.api.SalesOrderAddressRepositoryV1Api();

        System.out.println(product.getGrossPriceValue());


        int totalValue = product.getGrossPriceValue().multiply(new BigDecimal(100)).intValueExact();

        try {
            PDDocument document = PDDocument.load(new File(WaWiApplication.getHomeDirectory() + "marke.pdf"));

            PrinterService.getInstance().printDocument(document);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        //  String targetProduct = InternetmarkeService.getInstance().getProduct(Integer.parseInt(product.getId()), magentoOrder.getCustomerFirstname(), magentoOrder.getCustomerLastname(),address.getCompany(), address.getPostcode(), address.getCity(), streetNo[0], streetNo[1], "DEU", totalValue);

//        try {
//            URL url = new URL(targetProduct);
//            InputStream in = url.openStream();
//            Files.copy(in, Paths.get(WaWiApplication.getHomeDirectory() + "marke.pdf"));
//        } catch (MalformedURLException e1) {
//            e1.printStackTrace();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }


    }

    public void showToolWindow(Event event) throws IOException {
        WaWiApplication.showView(SettingsView.class, Modality.NONE);
    }



}
