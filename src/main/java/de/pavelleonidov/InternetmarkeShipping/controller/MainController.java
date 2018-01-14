package de.pavelleonidov.InternetmarkeShipping.controller;

import com.jfoenix.controls.*;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.pavelleonidov.InternetmarkeShipping.Main;
import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderDetailsTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.magento.SalesItemTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProduct;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProductList;
import de.pavelleonidov.InternetmarkeShipping.service.InternetmarkeService;
import de.pavelleonidov.InternetmarkeShipping.service.PrinterService;
import de.pavelleonidov.InternetmarkeShipping.service.ProdWSSalesProductService;
import de.pavelleonidov.InternetmarkeShipping.utility.magento.OrderDetailsTreeColumnFactory;
import de.pavelleonidov.InternetmarkeShipping.utility.magento.OrderTreeColumnFactory;
import de.pavelleonidov.InternetmarkeShipping.utility.magento.SalesItemColumnFactory;

import de.pavelleonidov.InternetmarkeShipping.view.SettingsView;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import de.felixroske.jfxsupport.FXMLController;
import io.swagger.client.ApiException;
import io.swagger.client.api.CustomerAddressRepositoryV1Api;
import io.swagger.client.api.SalesOrderManagementV1Api;
import io.swagger.client.api.SalesShipOrderV1Api;
import io.swagger.client.model.Body99;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeItem;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
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
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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
    private Label walletBalance;

    @FXML
    private Label selectedShippingMethod;

    @FXML
    private JFXCheckBox buttonDisablePendingOrders;

    private boolean showNonPaid = true;

    protected AtomicReference<SalesProduct> selectedProduct;

    protected static AtomicReference<io.swagger.client.model.SalesDataOrderInterface> selectedOrder;

    protected TreeItem<OrderTreeObject> selectedOrderObservable;

    protected ObservableList<OrderTreeObject> orderTreeObjects;

    protected ObservableList<OrderDetailsTreeObject> orderDetailsTreeObjects;

    protected ObservableList<SalesItemTreeObject> salesItemTreeObjects;


    protected boolean fullRefresh = false;


    TreeItem<OrderDetailsTreeObject> rootDetailOrder;

    TreeItem<SalesItemTreeObject> rootProduct;

    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread thread = Executors.defaultThreadFactory().newThread(r);
        thread.setDaemon(true);
        return thread;
    });

    private ScheduledFuture scheduledFuture;

    protected OrderThread orderThread;

    @FXML
    void initialize() {

        startThread();

        JFXTreeTableColumn<SalesItemTreeObject, String> productNameColumn = SalesItemColumnFactory.getInstance().createColumn("Name", "name", 200);
        JFXTreeTableColumn<SalesItemTreeObject, String> productPriceColumn = SalesItemColumnFactory.getInstance().createColumn("Preis", "price", 80);
        JFXTreeTableColumn<SalesItemTreeObject, String> productSkuColumn = SalesItemColumnFactory.getInstance().createColumn("SKU", "sku", 100);
        JFXTreeTableColumn<SalesItemTreeObject, String> productQuantityColumn = SalesItemColumnFactory.getInstance().createColumn("Stückzahl", "quantity", 50);

        orderDetailsProducts.getColumns().setAll(productNameColumn, productSkuColumn, productPriceColumn, productQuantityColumn);

        JFXTreeTableColumn<OrderDetailsTreeObject, String> labelColumn = OrderDetailsTreeColumnFactory.getInstance().createColumn("Label", "label");
        JFXTreeTableColumn<OrderDetailsTreeObject, String> valueColumn = OrderDetailsTreeColumnFactory.getInstance().createColumn("Wert", "value", 200);

        orderDetailsShipping.getColumns().setAll(labelColumn, valueColumn);

        walletBalance.setText(InternetmarkeService.getInstance().getFormattedWalletBalance());

        buttonDisablePendingOrders.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                setShowNonPaid(oldValue);
                fullRefreshOrders(null);
            }
        });

    }

    private void startTask() {

        if(orderThread == null) {
            orderThread = new OrderThread();
            orderThread.setDaemon(true);
        }
        scheduledFuture = executor.scheduleAtFixedRate(orderThread, 0, 30, TimeUnit.SECONDS);
    }

     private void startThread() {
        if (scheduledFuture == null) {
            // nothing running currently
            startTask();
        } else {
            scheduledFuture.cancel(true);
            startTask();
        }
    }

    public void triggerPrintLabel(final Event e) {


        String internetmarkeLabelFile = prepareInternetmarkeLabel();

        if(!internetmarkeLabelFile.isEmpty()) {
            try {

                io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();
                String orderId = magentoOrder.getIncrementId();

                PDDocument document = PDDocument.load(new File(internetmarkeLabelFile));

                io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

                boolean isInternational = !address.getCountryId().equals("DE");
                boolean hasCompanyName = address.getCompany() != null;

                PrinterService.getInstance().printDocument(document, isInternational, hasCompanyName);
                walletBalance.setText(InternetmarkeService.getInstance().getFormattedWalletBalance());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void triggerPrintLabelAgain(final Event e) {

        SalesProduct product = selectedProduct.get();
        io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();

        File currentLabelFile = new File(Main.getHomeDirectory() + "marke-" + magentoOrder.getIncrementId() + "-" + product.getId() + ".pdf");
        if(currentLabelFile.exists()) {
            try {

                io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

                boolean isInternational = !address.getCountryId().equals("DE");
                boolean hasCompanyName = address.getCompany() != null;

                PDDocument document = PDDocument.load(currentLabelFile);

                PrinterService.getInstance().printDocument(document, isInternational, hasCompanyName);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
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

            cleanDetailViews();

        } catch (ApiException e1) {
            e1.printStackTrace();
        }


    }

    public void cancelOrder(Event event) {
        io.swagger.client.model.SalesDataOrderInterface currentOrder = getCurrentOrder().get();

        io.swagger.client.api.SalesOrderManagementV1Api salesOrderManagement = new SalesOrderManagementV1Api();
        salesOrderManagement.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        salesOrderManagement.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        salesOrderManagement.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

        try {
            salesOrderManagement.salesOrderManagementV1CancelPost(currentOrder.getEntityId());
            fullRefreshOrders(event);
        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }

    }



    public void fullRefreshOrders(final Event e) {
        fullRefresh = true;
        cleanAllViews();
        startThread();
    }

    public void showToolWindow(Event event) throws IOException {
        Main.showView(SettingsView.class, Modality.NONE);

    }


    public void showCustomerAddressView(Event event) throws IOException {

        //Main.showView(CustomerAddressView.class, Modality.APPLICATION_MODAL);
        Stage customerDetailStage = loadDependentView("customeraddress.fxml");
        customerDetailStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                fullRefreshOrders(event);
            }
        });

    }

    public static AtomicReference<io.swagger.client.model.SalesDataOrderInterface> getCurrentOrder() {
        return selectedOrder;
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

        private io.swagger.client.api.SalesOrderRepositoryV1Api orderApi = new io.swagger.client.api.SalesOrderRepositoryV1Api();

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
            createdAtColumn = OrderTreeColumnFactory.getInstance().createDateColumn("Datum", "createdAt");

            magentoCustomerTable.getColumns().setAll(orderIdColumn, customerNameColumn, channelColumn, paymentMethodColumn, statusColumn, createdAtColumn);

            orderTreeObjects = FXCollections.observableArrayList();
            orderDetailsTreeObjects = FXCollections.observableArrayList();
            salesItemTreeObjects = FXCollections.observableArrayList();

            if(SettingsController.getSettings().getMagento2AccessToken() != null) {
                orderApi.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
                orderApi.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
                orderApi.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

                DateFormat localDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                localDateFormat.setTimeZone(TimeZone.getTimeZone(ZoneId.of("Europe/Berlin")));

                orderApi.getApiClient().setDatetimeFormat(localDateFormat);
                orderApi.getApiClient().setDateFormat(localDateFormat);
            }

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
                          new OrderDetailsTreeObject("Name", responseOrder.getCustomerFirstname() + " " + responseOrder.getCustomerLastname()),
                          new OrderDetailsTreeObject("Straße", (address.getStreet() != null ? address.getStreet().get(0) : "")),
                          new OrderDetailsTreeObject("PLZ", address.getPostcode()),
                          new OrderDetailsTreeObject("Stadt", address.getCity()),
                          new OrderDetailsTreeObject("Land", address.getCountryId())
                        );

                    });

                    selectedShippingMethod.setText(currentOrder.getResponseOrder().getShippingDescription());

                  //  System.out.println(currentOrder.getResponseOrder());

                    selectedOrder.set(newValue.getValue().getResponseOrder());
                    // System.out.println(selectedOrder.get().getIncrementId());

                    rootProduct = new RecursiveTreeItem<SalesItemTreeObject>(salesItemTreeObjects, RecursiveTreeObject::getChildren);
                    orderDetailsProducts.setRoot(rootProduct);
                    orderDetailsProducts.setShowRoot(false);


                    rootDetailOrder = new RecursiveTreeItem<OrderDetailsTreeObject>(orderDetailsTreeObjects, RecursiveTreeObject::getChildren);
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
                                setText(t.getName() + " (" + t.getGrossPriceValue() + " " + t.getGrossPriceCurrency() + ")");
                            }
                        }
                    };
                });
            }

            prodWSProducts.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                selectedProduct.set(newValue);
                //System.out.println(selectedProduct.get().getName());
            });



        }

        @Override
        public void run() {

     //       while (!this.isInterrupted()) {

                // UI updaten
                Platform.runLater(() -> {


                    // http://allabout-apple.com/rest/default/V1/orders?searchCriteria[filter_groups][0][filters][0][condition_type]=eq&searchCriteria[filter_groups][0][filters][0][field]=status&searchCriteria[sortOrders][0][field]=created_at&searchCriteria[sortOrders][0][direction]=desc&searchCriteria[filter_groups][0][filters][0][value]=processing


                    if(SettingsController.getSettings().getMagento2AccessToken() != null) {

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

                            if(fullRefresh) {
                                cleanAllViews();
                                lastExecution = null;
                            }

                            if(lastExecution == null) {
                                orders = orderApi.salesOrderRepositoryV1GetListGet(
                                        "status",
                                        "processing",
                                        "eq",
                                        "created_at",
                                        "asc",
                                        100,
                                        1,
                                        isShowNonPaid() ? "status" : null,
                                        isShowNonPaid() ? "pending" : null,
                                        isShowNonPaid() ? "eq" : null,
                                        "created_at",
                                        "2018-01-08 00:00:00",
                                        "gt"
                                );
                                //System.out.println(orders.getItems());

                            } else {

                                DateFormat sourceFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                sourceFormat.setTimeZone(TimeZone.getDefault());

                                Date dateTime = null;
                                try {
                                    dateTime = sourceFormat.parse(lastExecution);
                                } catch (ParseException e) {
                                    e.printStackTrace();
                                }

                                DateFormat targetFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                targetFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

                                orders = orderApi.salesOrderRepositoryV1GetListGet(
                                        "status",
                                        "processing",
                                        "eq",
                                        "created_at",
                                        "asc",
                                        100,
                                        1,
                                        isShowNonPaid() ? "status" : null,
                                        isShowNonPaid() ? "pending" : null,
                                        isShowNonPaid() ? "eq" : null,
                                        "created_at",
                                        targetFormat.format(dateTime),
                                        "gt"
                                );

                            }


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

                    LocalDateTime currentDateTime = LocalDateTime.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    lastExecution = currentDateTime.format(dtf);
                    fullRefresh = false;
                });


                // Sleep thread
//                try {
//                    sleep(TimeUnit.SECONDS.toMillis(30));
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(OrderThread.class.getName()).log(Level.SEVERE, null, ex);
//                    currentThread().interrupt();
//                }
//            }


        }

    }

    protected String prepareInternetmarkeLabel() {

        SalesProduct product = selectedProduct.get();


        io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();
        io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

        String formattedStreet = address.getStreet().get(0);

        String street = parseStreet(formattedStreet);
        String houseNumber = parseHousenumber(formattedStreet);


        int totalValue = product.getGrossPriceValue().multiply(new BigDecimal(100)).intValueExact();


        String targetProduct = InternetmarkeService.getInstance().getProduct(Integer.parseInt(product.getId()), magentoOrder.getCustomerFirstname(), magentoOrder.getCustomerLastname(),address.getCompany(), address.getPostcode(), address.getCity(), street, houseNumber, iso2CountryCodeToIso3CountryCode(address.getCountryId()), totalValue);

       try {
            URL url = new URL(targetProduct);
            InputStream in = url.openStream();
            Files.copy(in, Paths.get(Main.getHomeDirectory() + "marke-" + magentoOrder.getIncrementId() + "-" + product.getId() + ".pdf"), StandardCopyOption.REPLACE_EXISTING);

            return Main.getHomeDirectory() + "marke-" + magentoOrder.getIncrementId() + "-" + product.getId() + ".pdf";

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            return "";
        } catch (IOException e1) {
            e1.printStackTrace();
            return "";
        }
    }

    protected void cleanLabelFiles() {
        io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();
        String orderId = magentoOrder.getIncrementId();
        SalesProductList productList = ProdWSSalesProductService.getInstance().getProducts();

        if(productList != null) {
            productList.getProducts().forEach((item) -> {
                File currentDownloadedProduct = new File(Main.getHomeDirectory() + "marke-" + orderId + "-" + item.getId() + ".pdf");
                if(currentDownloadedProduct.exists()) {
                    if(currentDownloadedProduct.delete()) {
                        System.out.println(Main.getHomeDirectory() + "marke-" + orderId + "-" + item.getId() + " deleted");
                    }
                }
            });
        }

    }

    protected void cleanAllViews() {
        orderTreeObjects.clear();
        cleanDetailViews();
    }

    protected void cleanDetailViews() {
        salesItemTreeObjects.clear();
        orderDetailsTreeObjects.clear();

        if(orderDetailsProducts.getRoot() != null) orderDetailsProducts.getRoot().getChildren().clear();
        magentoCustomerTable.getSelectionModel().clearSelection();
        if(selectedOrderObservable != null) {
            orderTreeObjects.removeAll(selectedOrderObservable.getValue());
        }

        selectedOrderObservable = null;
    }

    private String parseHousenumber(String str) {


        Matcher match = Pattern.compile("(?!\\w\\W)+[0-9]+[a-zA-Z]?").matcher(str);

        if(match.find()) {
            return match.group(0);
        }
        return "";
    }

    private String parseStreet(String str) {
        // Special case: Mannheim's square city
        Matcher matchSquare = Pattern.compile("^([a-zA-Z])\\d").matcher(str);
        if(matchSquare.find()) {
            return matchSquare.group(0).trim();
        } else {
            // All other street names, including missing whitespaces between street and house number
            Matcher match = Pattern.compile("^([a-zA-ZäöüÄÖÜß.\\-\\s])+(?=[0-9])").matcher(str);

            if (match.find()) {
                return match.group(0).trim();
            }
            return "";
        }
    }

    private String iso2CountryCodeToIso3CountryCode(String iso2CountryCode){
        Locale locale = new Locale("", iso2CountryCode);
        return locale.getISO3Country();
    }

    public boolean isShowNonPaid() {
        return showNonPaid;
    }

    public void setShowNonPaid(boolean showNonPaid) {
        this.showNonPaid = showNonPaid;
    }
}
