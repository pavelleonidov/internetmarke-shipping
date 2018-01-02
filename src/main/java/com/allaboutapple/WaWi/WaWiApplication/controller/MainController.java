package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderDetailsTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.SalesItemTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProduct;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.InternetmarkeService;
import com.allaboutapple.WaWi.WaWiApplication.service.PrinterService;
import com.allaboutapple.WaWi.WaWiApplication.service.ProdWSSalesProductService;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.OrderDetailsTreeColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.OrderTreeColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.SalesItemColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.view.SettingsView;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import de.felixroske.jfxsupport.FXMLController;
import io.swagger.client.ApiException;
import io.swagger.client.api.CustomerAddressRepositoryV1Api;
import io.swagger.client.api.SalesShipOrderV1Api;
import io.swagger.client.model.Body99;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

@FXMLController
public class MainController extends AbstractController {

    @FXML
    private JFXTreeTableView<OrderTreeObject> magentoCustomerTable;

    @FXML
    private JFXTreeTableView<SalesItemTreeObject> orderDetailsProducts;

    @FXML
    private JFXTreeTableView<OrderDetailsTreeObject> orderDetailsShipping;

    @FXML
    private JFXListView<SalesProduct> prodWSProducts;

    @FXML
    private Label selectedShippingMethod;

    protected AtomicReference<SalesProduct> selectedProduct;

    protected AtomicReference<io.swagger.client.model.SalesDataOrderInterface> selectedOrder;

    protected TreeItem<OrderTreeObject> selectedOrderObservable;

    protected ObservableList<OrderTreeObject> orderTreeObjects;

    protected ObservableList<OrderDetailsTreeObject> orderDetailsTreeObjects = FXCollections.observableArrayList();

    protected ObservableList<SalesItemTreeObject> salesItemTreeObjects = FXCollections.observableArrayList();

    @FXML
    void initialize() {



        OrderThread orderThread = new OrderThread();
        orderThread.start();

        JFXTreeTableColumn<SalesItemTreeObject, String> productNameColumn = SalesItemColumnFactory.getInstance().createColumn("Name", "name", 200);
        JFXTreeTableColumn<SalesItemTreeObject, String> productPriceColumn = SalesItemColumnFactory.getInstance().createColumn("Preis", "price", 120);
        JFXTreeTableColumn<SalesItemTreeObject, String> productSkuColumn = SalesItemColumnFactory.getInstance().createColumn("SKU", "sku", 100);

        orderDetailsProducts.getColumns().setAll(productNameColumn, productSkuColumn, productPriceColumn);



        JFXTreeTableColumn<OrderDetailsTreeObject, String> labelColumn = OrderDetailsTreeColumnFactory.getInstance().createColumn("Label", "label");
        JFXTreeTableColumn<OrderDetailsTreeObject, String> valueColumn = OrderDetailsTreeColumnFactory.getInstance().createColumn("Wert", "value", 200);

        orderDetailsShipping.getColumns().setAll(labelColumn, valueColumn);
    }

    public void triggerPrintLabel(final Event e) {



        try {
            PDDocument document = PDDocument.load(new File(WaWiApplication.getHomeDirectory() + "marke.pdf"));

            PrinterService.getInstance().printDocument(document);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void triggerShipProduct(final Event e) {

        io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();
        SalesShipOrderV1Api salesShip = new SalesShipOrderV1Api();
        salesShip.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        salesShip.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        salesShip.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

        io.swagger.client.model.Body99 shipBody = new Body99();
        shipBody.setNotify(Boolean.TRUE);


        try {
            salesShip.salesShipOrderV1ExecutePost(
                    magentoOrder.getEntityId(),
                    shipBody
            );

            salesItemTreeObjects.clear();
            orderDetailsTreeObjects.clear();
            magentoCustomerTable.getSelectionModel().clearSelection();
            orderTreeObjects.removeAll(selectedOrderObservable.getValue());
//            selectedOrderObservable.getParent().getChildren().remove(selectedOrderObservable);


        selectedOrderObservable = null;

        } catch (ApiException e1) {
            e1.printStackTrace();
        }


    }

    public void showToolWindow(Event event) throws IOException {
        WaWiApplication.showView(SettingsView.class, Modality.NONE);
    }

    public class OrderThread extends Thread {

        private JFXTreeTableColumn<OrderTreeObject, String>[] tableColumns;


        private JFXTreeTableColumn<OrderTreeObject, String> orderIdColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> customerNameColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> channelColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> paymentMethodColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> statusColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> createdAtColumn;

        private String lastExecution;

        public OrderThread() {

            setDaemon(true);
            setName("Order thread ");
            lastExecution = null;

            selectedProduct = new AtomicReference<>();
            selectedOrder = new AtomicReference<>();

            orderIdColumn = OrderTreeColumnFactory.getInstance().createColumn("Bestellnummer", "orderId");
            customerNameColumn = OrderTreeColumnFactory.getInstance().createColumn("Kunde", "customerName");
            channelColumn = OrderTreeColumnFactory.getInstance().createColumn("Kanal", "channel");
            paymentMethodColumn = OrderTreeColumnFactory.getInstance().createColumn("Bezahlmethode", "paymentMethod");
            statusColumn = OrderTreeColumnFactory.getInstance().createColumn("Status", "status");
            createdAtColumn = OrderTreeColumnFactory.getInstance().createColumn("Datum", "createdAt");

            magentoCustomerTable.getColumns().setAll(orderIdColumn, customerNameColumn, channelColumn, paymentMethodColumn, statusColumn, createdAtColumn);

            orderTreeObjects = FXCollections.observableArrayList();

            //magentoCustomerTable.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent event) -> {
            //   System.out.println("CLICKED");
            // });
            magentoCustomerTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {

                if(newValue != null) {
                    OrderTreeObject currentOrder = newValue.getValue();
                    io.swagger.client.model.SalesDataOrderInterface responseOrder = currentOrder.getResponseOrder();


                    io.swagger.client.model.SalesDataOrderAddressInterface address = responseOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

                    salesItemTreeObjects.clear();
                    orderDetailsTreeObjects.clear();
                    responseOrder.getItems().forEach(item -> {
                        salesItemTreeObjects.add(new SalesItemTreeObject(item));
                        // System.out.println(item);


                        orderDetailsTreeObjects.addAll(
                          new OrderDetailsTreeObject("Straße", address.getStreet().get(0)),
                          new OrderDetailsTreeObject("Stadt", address.getCity()),
                          new OrderDetailsTreeObject("Land", address.getCountryId())
                        );

                    });

                    selectedShippingMethod.setText(currentOrder.getResponseOrder().getShippingDescription());

                  //  System.out.println(currentOrder.getResponseOrder());

                    selectedOrder.set(newValue.getValue().getResponseOrder());
                    // System.out.println(selectedOrder.get().getIncrementId());

                    final TreeItem<SalesItemTreeObject> rootProduct = new RecursiveTreeItem<SalesItemTreeObject>(salesItemTreeObjects, RecursiveTreeObject::getChildren);
                    orderDetailsProducts.setRoot(rootProduct);
                    orderDetailsProducts.setShowRoot(false);


                    final TreeItem<OrderDetailsTreeObject> rootDetailOrder = new RecursiveTreeItem<OrderDetailsTreeObject>(orderDetailsTreeObjects, RecursiveTreeObject::getChildren);
                    orderDetailsShipping.setRoot(rootDetailOrder);
                    orderDetailsShipping.setShowRoot(false);

                    selectedOrderObservable = newValue;

                }

            });


            SalesProductList productList = ProdWSSalesProductService.getInstance().getProducts();

            if(productList != null) {
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
            }

            prodWSProducts.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                selectedProduct.set(newValue);
                System.out.println(selectedProduct.get().getName());
            });



        }

        @Override
        public void run() {

            while (!this.isInterrupted()) {

                // UI updaten
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {



                        io.swagger.client.api.SalesOrderRepositoryV1Api orderApi = new io.swagger.client.api.SalesOrderRepositoryV1Api();
                        // http://allabout-apple.com/rest/default/V1/orders?searchCriteria[filter_groups][0][filters][0][condition_type]=eq&searchCriteria[filter_groups][0][filters][0][field]=status&searchCriteria[sortOrders][0][field]=created_at&searchCriteria[sortOrders][0][direction]=desc&searchCriteria[filter_groups][0][filters][0][value]=processing





                        if(SettingsController.getSettings().getMagento2AccessToken() != null) {
                            orderApi.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
                            orderApi.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
                            orderApi.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);


                            try {
                                //io.swagger.client.model.SalesDataOrderInterface order = orderApi.salesOrderRepositoryV1GetGet(1);





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
                              //  System.out.println(orders.getTotalCount());

                                io.swagger.client.model.SalesDataOrderSearchResultInterface orders = null;
                                if(lastExecution == null) {
                                    orders = orderApi.salesOrderRepositoryV1GetListGet(
                                            "status",
                                            "processing",
                                            "eq",
                                            "created_at",
                                            "asc",
                                            100,
                                            1,
                                            "status",
                                            "pending",
                                            "eq",
                                            "created_at",
                                            "2017-12-12 00:00:00",
                                            "gt"
                                    );
                                } else {


                                    orders = orderApi.salesOrderRepositoryV1GetListGet(
                                            "status",
                                            "processing",
                                            "eq",
                                            "created_at",
                                            "asc",
                                            100,
                                            1,
                                            "status",
                                            "pending",
                                            "eq",
                                            "created_at",
                                            lastExecution,
                                            "gt"
                                    );

                                }

                                   // System.out.println(orders);
                                    orders.getItems().forEach(item -> {
                                    orderTreeObjects.add(new OrderTreeObject(item));

                                });


                                 TreeItem<OrderTreeObject> root = new RecursiveTreeItem<OrderTreeObject>(orderTreeObjects, RecursiveTreeObject::getChildren);


                                magentoCustomerTable.setRoot(root);
                                magentoCustomerTable.setShowRoot(false);

                                if(selectedOrderObservable != null) {
                                    magentoCustomerTable.getSelectionModel().select(selectedOrderObservable);
                                }



                            } catch (io.swagger.client.ApiException e) {
                                e.printStackTrace();

                                System.out.println(e.getResponseBody());
                            }
                        }

                        LocalDateTime currentDateTime = LocalDateTime.now().minusHours(1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        lastExecution = currentDateTime.format(dtf);
                    }
                });

                System.out.println("Run!");

                // Sleep thread
                try {
                    // fuer 3 Sekunden
                    sleep(TimeUnit.SECONDS.toMillis(15));
                } catch (InterruptedException ex) {
                    Logger.getLogger(OrderThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }


        }

    }

    protected String prepareInternetmarkeLabel() {

        SalesProduct product = selectedProduct.get();


        io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();
        io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

        String formattedStreet = address.getStreet().get(0);
        String[] streetNo = formattedStreet.split(" ");

        int totalValue = product.getGrossPriceValue().multiply(new BigDecimal(100)).intValueExact();

        String targetProduct = InternetmarkeService.getInstance().getProduct(Integer.parseInt(product.getId()), magentoOrder.getCustomerFirstname(), magentoOrder.getCustomerLastname(),address.getCompany(), address.getPostcode(), address.getCity(), streetNo[0], streetNo[1], "DEU", totalValue);

        try {
            URL url = new URL(targetProduct);
            InputStream in = url.openStream();
            Files.copy(in, Paths.get(WaWiApplication.getHomeDirectory() + "marke-" + magentoOrder.getIncrementId() + "-" + product.getId() + ".pdf"));

            return WaWiApplication.getHomeDirectory() + "marke-" + magentoOrder.getIncrementId() + "-" + product.getId() + ".pdf";

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            return "";
        } catch (IOException e1) {
            e1.printStackTrace();
            return "";
        }
    }

}
