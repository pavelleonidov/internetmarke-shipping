package de.pavelleonidov.InternetmarkeShipping.controller;

import com.jfoenix.controls.*;
import de.felixroske.jfxsupport.AbstractFxmlView;
import de.pavelleonidov.InternetmarkeShipping.Main;
import de.pavelleonidov.InternetmarkeShipping.model.internetmarke.OrderedProduct;
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
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;



import io.swagger.client.api.CustomerAddressRepositoryV1Api;
import io.swagger.client.api.SalesOrderManagementV1Api;
import io.swagger.client.api.SalesRefundOrderV1Api;
import io.swagger.client.api.SalesShipOrderV1Api;
import io.swagger.client.model.SalesDataCreditmemoItemCreationInterface;
import io.swagger.client.model.SalesShipOrderV1ExecutePostBody;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javafx.util.Callback;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
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
import java.util.function.Predicate;
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

    @FXML
    private JFXButton resetButton;

    @FXML
    private Label labelCount;

    @FXML
    private JFXTextField filterField;

    private boolean showNonPaid = true;

    protected AtomicReference<SalesProduct> selectedProduct;

    protected static SalesProduct infoSelectedProduct;

    protected static AtomicReference<io.swagger.client.model.SalesDataOrderInterface> selectedOrder;

    protected TreeItem<OrderTreeObject> selectedOrderObservable;

    protected ObservableList<OrderTreeObject> orderTreeObjects;

    protected SortedList<OrderTreeObject> sortedOrders;

    protected ObservableList<TreeItem<OrderTreeObject>> selectedOrdersObservable;

    protected ObservableList<OrderDetailsTreeObject> orderDetailsTreeObjects;

    protected ObservableList<SalesItemTreeObject> salesItemTreeObjects;

    protected Predicate<TreeItem<OrderTreeObject>> predicate;


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

    protected static io.swagger.client.api.CustomerCustomerRepositoryV1Api customerCustomerRepositoryV1Api = new io.swagger.client.api.CustomerCustomerRepositoryV1Api();

    protected static SalesShipOrderV1Api salesShip = new SalesShipOrderV1Api();

    protected static io.swagger.client.api.PavelLeonidovWebApiOrderInvoiceOrderInvoiceV1Api invoiceApi = new io.swagger.client.api.PavelLeonidovWebApiOrderInvoiceOrderInvoiceV1Api();

    protected static io.swagger.client.api.PavelLeonidovWebApiRestPdfPdfInvoiceRepositoryV1Api invoicePdfApi = new io.swagger.client.api.PavelLeonidovWebApiRestPdfPdfInvoiceRepositoryV1Api();

    @FXML
    void initialize() {

        customerCustomerRepositoryV1Api.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        customerCustomerRepositoryV1Api.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        customerCustomerRepositoryV1Api.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

        salesShip.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        salesShip.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        salesShip.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

        invoiceApi.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        invoiceApi.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        invoiceApi.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

        invoicePdfApi.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
        invoicePdfApi.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
        invoicePdfApi.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);

      //  invoicePdfApi = new io.swagger.client.api.PavelLeonidovWebApiRestPdfPdfInvoiceRepositoryV1Api(invoiceClient);


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

        buttonDisablePendingOrders.selectedProperty().addListener((observable, oldValue, newValue) -> {
            setShowNonPaid(oldValue);
            fullRefreshOrders(null);
        });

        initPredicate();

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

        selectedOrdersObservable = magentoCustomerTable.getSelectionModel().getSelectedItems();

        if(!selectedOrdersObservable.isEmpty()) {
            selectedOrdersObservable.forEach(item -> {

                io.swagger.client.model.SalesDataOrderInterface magentoOrder = item.getValue().getResponseOrder();

                OrderedProduct internetmarkeProduct = prepareInternetmarkeLabel(magentoOrder);
                String internetmarkeLabelFile = internetmarkeProduct.getTargetFileName();

                if(!internetmarkeLabelFile.isEmpty()) {
                    try {

                        String orderId = magentoOrder.getIncrementId();

                        PDDocument document = PDDocument.load(new File(internetmarkeLabelFile));

                        io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

                        boolean isInternational = !address.getCountryId().equals("DE");
                        boolean hasCompanyName = address.getCompany() != null;

                        PrinterService.getInstance().printDocument(document, isInternational, hasCompanyName, "Printing Internetmarke for order " + orderId);
                        walletBalance.setText(InternetmarkeService.getInstance().getFormattedWalletBalance());

                        // System.out.println("Main TrackId: " + internetmarkeProduct.getTrackId());
                        if(StringUtils.isNotBlank(internetmarkeProduct.getTrackId())) {
                            // System.out.println(internetmarkeProduct.getTrackId());

                            // Track id / Voucher ID of given ProdWS product
                            item.getValue().setTrackId(internetmarkeProduct.getTrackId());
                        }

                        // needed to separate voucher id's from non-trackable ProdWS products
                        item.getValue().setTrackingPossible(internetmarkeProduct.isTrackingPossible());

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            });
        }
    }

    public void resetFilter(final Event e) {

        filterField.textProperty().setValue("");

    }

    public void triggerPrintLabelAgain(final Event e) {

        selectedOrdersObservable = magentoCustomerTable.getSelectionModel().getSelectedItems();
        SalesProduct product = selectedProduct.get();

        if(!selectedOrdersObservable.isEmpty()) {
            selectedOrdersObservable.forEach(item -> {

                io.swagger.client.model.SalesDataOrderInterface magentoOrder = item.getValue().getResponseOrder();

                io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

                String internetmarkeFolder = SettingsController.getSettings().getInternetmarkeDestination();

                if(internetmarkeFolder.isEmpty()) {
                    internetmarkeFolder = Main.getHomeDirectory();
                }

                File currentLabelFile = new File(internetmarkeFolder + "/marke-" + magentoOrder.getIncrementId() + "-" + address.getFirstname().trim().replaceAll("[^a-zA-Z]", "") + "-" + address.getLastname().trim().replaceAll("[^a-zA-Z]", "") + "-" +  product.getId() + ".pdf");
                if(currentLabelFile.exists()) {
                    try {


                        boolean isInternational = !address.getCountryId().equals("DE");
                        boolean hasCompanyName = address.getCompany() != null;

                        PDDocument document = PDDocument.load(currentLabelFile);

                        PrinterService.getInstance().printDocument(document, isInternational, hasCompanyName, "Reprint Internetmarke for order " + magentoOrder.getIncrementId());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            });
        }



    }

    public void triggerShipProduct(final Event e) {

        //io.swagger.client.model.SalesDataOrderInterface magentoOrder = selectedOrder.get();

        selectedOrdersObservable = magentoCustomerTable.getSelectionModel().getSelectedItems();
        if(!selectedOrdersObservable.isEmpty()) {


            selectedOrdersObservable.forEach(item -> {
                io.swagger.client.model.SalesDataOrderInterface magentoOrder = item.getValue().getResponseOrder();
                io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

                io.swagger.client.model.SalesShipOrderV1ExecutePostBody shipBody = new SalesShipOrderV1ExecutePostBody();
                shipBody.setNotify(Boolean.TRUE);


                if(item.getValue().getTrackId() != null) {
                    if(StringUtils.isNotBlank(item.getValue().getTrackId().getValue()) && item.getValue().isTrackingPossible().getValue().equals("Yes")) {
                        io.swagger.client.model.SalesDataShipmentTrackCreationInterface trackItem = new io.swagger.client.model.SalesDataShipmentTrackCreationInterface();

                        trackItem.setCarrierCode("deutschepost");
                        trackItem.setTitle("Deutsche Post");
                        trackItem.setTrackNumber(item.getValue().getTrackId().getValue());

                        shipBody.addTracksItem(trackItem);
                    }
                }

                try {

                    salesShip.salesShipOrderV1ExecutePost(
                            magentoOrder.getEntityId(),
                            shipBody
                    );
                } catch (ApiException e1) {
                    e1.printStackTrace();
                }

                try {
                    // @see https://github.com/pavelleonidov/magento2-webapi-orderinvoice
                    Integer invoiceId = invoiceApi.pavelLeonidovWebApiOrderInvoiceOrderInvoiceV1ExecuteGet(magentoOrder.getEntityId()).getEntityId();

                    if(invoiceId != null) {
                        String invoiceResponse = null;
                        try {
                            // @see https://github.com/pavelleonidov/magento2-webapi-pdfinvoice
                            invoiceResponse = invoicePdfApi.pavelLeonidovWebApiRestPdfPdfInvoiceRepositoryV1GetInvoiceForExportInPdfFormatGet(invoiceId);
                            try {
                                // Decode stream and save to PDF
                                if (!invoiceResponse.isEmpty()) {

                                    String invoicePath = SettingsController.getSettings().getInvoiceDestination();

                                    if(invoicePath.isEmpty()) {
                                        invoicePath = Main.getHomeDirectory() + "Invoices";
                                    }

                                    File invoiceDirectory = new File(invoicePath);
                                    if (!invoiceDirectory.exists()) {
                                        try {
                                            invoiceDirectory.mkdirs();
                                        } catch (Exception e3) {
                                            e3.printStackTrace();
                                        }

                                    }
                                    String fileName = "Invoice-" + magentoOrder.getIncrementId() + "-" + address.getFirstname().trim().replaceAll("[^a-zA-Z]", "") + '-' + address.getLastname().trim().replaceAll("[^a-zA-Z]", "") + ".pdf";

                                    File invoiceFile = new File(invoiceDirectory.getPath() + '/' + fileName);
                                    byte[] stream = Base64.getDecoder().decode(invoiceResponse);
                                    FileOutputStream fos = new FileOutputStream(invoiceFile);
                                    fos.write(stream);
                                    fos.close();
                                }


                            } catch (IOException e1) {
                                e1.printStackTrace();
                            }
                        } catch (ApiException e1) {
                            e1.printStackTrace();
                        }



                    }

                } catch (ApiException e1) {
                    e1.printStackTrace();
                    System.out.println(e1.getResponseBody());
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            });


            fullRefreshOrders(null);


        }

    }

    public void cancelOrder(Event event) {
        io.swagger.client.model.SalesDataOrderInterface currentOrder = getCurrentOrder().get();

        if(currentOrder.getStatus().equals("pending")) {
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
        } else {
            io.swagger.client.api.SalesRefundOrderV1Api salesRefundOrder = new SalesRefundOrderV1Api();
            salesRefundOrder.getApiClient().setAccessToken(SettingsController.getSettings().getMagento2AccessToken());
            salesRefundOrder.getApiClient().setBasePath(SettingsController.getSettings().getMagento2ApiUrl());
            salesRefundOrder.getApiClient().getHttpClient().setReadTimeout(30, TimeUnit.SECONDS);
            
            io.swagger.client.model.SalesRefundOrderV1ExecutePostBody refundBody = new io.swagger.client.model.SalesRefundOrderV1ExecutePostBody();

            currentOrder.getItems().forEach(item -> {
                io.swagger.client.model.SalesDataCreditmemoItemCreationInterface memoItem = new SalesDataCreditmemoItemCreationInterface();
                memoItem.setOrderItemId(item.getItemId());
                memoItem.setQty(item.getQtyOrdered());
                refundBody.addItemsItem(memoItem);
            });

            refundBody.setNotify(false);

            try {
                salesRefundOrder.salesRefundOrderV1ExecutePost(currentOrder.getEntityId(), refundBody);
                fullRefreshOrders(event);
            } catch (ApiException e) {
                e.printStackTrace();
                System.out.println(e.getResponseBody());
            }
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
        customerDetailStage.setOnCloseRequest(windowEvent -> fullRefreshOrders(event));

    }

    public static AtomicReference<io.swagger.client.model.SalesDataOrderInterface> getCurrentOrder() {
        return selectedOrder;
    }

    public static SalesProduct getInfoSelectedProduct() {
        return infoSelectedProduct;
    }

    public static io.swagger.client.api.CustomerCustomerRepositoryV1Api getCustomerRepositoryApi() {
        return customerCustomerRepositoryV1Api;
    }



    public class OrderThread extends Thread {

        private JFXTreeTableColumn<OrderTreeObject, String>[] tableColumns;


        private JFXTreeTableColumn<OrderTreeObject, String> orderIdColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> customerNameColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> channelColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> channelAccountColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> paymentMethodColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> statusColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> createdAtColumn;
        private JFXTreeTableColumn<OrderTreeObject, String> firstItemColumn;

        private String lastExecution;

        private io.swagger.client.api.SalesOrderRepositoryV1Api orderApi = new io.swagger.client.api.SalesOrderRepositoryV1Api();

        public OrderThread() {

            setDaemon(true);
            setName("Order thread ");
            lastExecution = null;

            selectedProduct = new AtomicReference<>();
            selectedOrder = new AtomicReference<>();

            orderIdColumn = OrderTreeColumnFactory.getInstance().createColumn("Bestellnummer", "orderId");
            firstItemColumn = OrderTreeColumnFactory.getInstance().createColumn("Produkt", "firstItem");
            customerNameColumn = OrderTreeColumnFactory.getInstance().createColumn("Kunde", "customerName");
            channelColumn = OrderTreeColumnFactory.getInstance().createColumn("Kanal", "channel");
            channelAccountColumn = OrderTreeColumnFactory.getInstance().createColumn("Kanal-Account", "channelAccountName");
            paymentMethodColumn = OrderTreeColumnFactory.getInstance().createColumn("Bezahlmethode", "paymentMethod");
            statusColumn = OrderTreeColumnFactory.getInstance().createColumn("Status", "status");
            createdAtColumn = OrderTreeColumnFactory.getInstance().createDateColumn("Datum", "createdAt");

            firstItemColumn.setSortType(TreeTableColumn.SortType.ASCENDING);

            magentoCustomerTable.getColumns().setAll(orderIdColumn, firstItemColumn, customerNameColumn, channelAccountColumn, channelColumn, paymentMethodColumn, statusColumn, createdAtColumn);


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

            magentoCustomerTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


            magentoCustomerTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {


                if(newValue != null) {
                    OrderTreeObject currentOrder = newValue.getValue();
                    io.swagger.client.model.SalesDataOrderInterface responseOrder = currentOrder.getResponseOrder();


                    io.swagger.client.model.SalesDataOrderAddressInterface address = responseOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();


                    Integer customerId = responseOrder.getCustomerId();




                    salesItemTreeObjects.clear();
                    orderDetailsTreeObjects.clear();
                    responseOrder.getItems().forEach(item -> {
                        salesItemTreeObjects.add(new SalesItemTreeObject(item));
                        // System.out.println(item);


                        orderDetailsTreeObjects.addAll(
                          new OrderDetailsTreeObject("Name", address.getFirstname() + " " + address.getLastname()),
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
                    return new ProductCell();
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
                                        250,
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


                            TreeTableColumn sortColumn = null;
                            TreeTableColumn.SortType sortType = null;

                            if(magentoCustomerTable.getSortOrder().size() > 0) {
                                sortColumn = magentoCustomerTable.getSortOrder().get(0);
                                sortType = sortColumn.getSortType();
                            }

                            selectedOrdersObservable = FXCollections.observableArrayList(magentoCustomerTable.getSelectionModel().getSelectedItems());



                            TreeItem<OrderTreeObject> root = new RecursiveTreeItem<OrderTreeObject>(orderTreeObjects, RecursiveTreeObject::getChildren);

                            if(magentoCustomerTable.getRoot() == null) {
                                magentoCustomerTable.setRoot(root);
                                magentoCustomerTable.setShowRoot(false);
                            } else {
                                magentoCustomerTable.getRoot().setValue(root.getValue());
                            }



                            // Keep sortings
                            if(sortColumn != null) {
                                magentoCustomerTable.getSortOrder().add(sortColumn);
                                sortColumn.setSortType(sortType);
                                sortColumn.setSortable(true);
                            }

                            // Keep selections
                            if(selectedOrdersObservable != null) {
                                magentoCustomerTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
                                magentoCustomerTable.getSelectionModel().clearSelection();

                                selectedOrdersObservable.forEach(item -> {
                                    magentoCustomerTable.getSelectionModel().select(item);
                                });
                            }

                            initCounts();
                            //magentoCustomerTable.setPredicate(new OrderFilter(filterField.textProperty().getValue()));



                        } catch (io.swagger.client.ApiException e) {
                            e.printStackTrace();


                            System.out.println(e.getResponseBody());
                            System.out.println("TEST");
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

    protected OrderedProduct prepareInternetmarkeLabel(io.swagger.client.model.SalesDataOrderInterface magentoOrder) {

        SalesProduct product = selectedProduct.get();


        io.swagger.client.model.SalesDataOrderAddressInterface address = magentoOrder.getExtensionAttributes().getShippingAssignments().get(0).getShipping().getAddress();

        String formattedStreet = address.getStreet().get(0);

        String street = parseStreet(formattedStreet);
        String houseNumber = parseHousenumber(formattedStreet);

        int totalValue = product.getGrossPriceValue().multiply(new BigDecimal(100)).intValueExact();


        OrderedProduct targetProduct = InternetmarkeService.getInstance().getProduct(Integer.parseInt(product.getId()), address.getFirstname(), address.getLastname(), address.getCompany(), address.getPostcode(), address.getCity(), street, houseNumber, iso2CountryCodeToIso3CountryCode(address.getCountryId()), totalValue);

       try {

            URL url = new URL(targetProduct.getLink());
            InputStream in = url.openStream();

            String internetmarkeFolder = SettingsController.getSettings().getInternetmarkeDestination();

            if(internetmarkeFolder.isEmpty()) {
                internetmarkeFolder = Main.getHomeDirectory();
            }

            String targetFileName = internetmarkeFolder + "/marke-" + magentoOrder.getIncrementId() + "-" + address.getFirstname().trim().replaceAll("[^a-zA-Z]", "") + "-" + address.getLastname().trim().replaceAll("[^a-zA-Z]", "") + "-" + product.getId() + ".pdf";

            Files.copy(in, Paths.get(targetFileName), StandardCopyOption.REPLACE_EXISTING);

            targetProduct.setTargetFileName(targetFileName);
            targetProduct.setTrackingPossible(product.isTrackingPossible());

            return targetProduct;

        } catch (MalformedURLException e1) {
            e1.printStackTrace();
            return null;
        } catch (IOException e1) {
            e1.printStackTrace();
            return null;
        }
    }

    protected OrderedProduct prepareInternetmarkeLabel() {
        return prepareInternetmarkeLabel(selectedOrder.get());
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

        if(selectedOrdersObservable != null) {
            orderTreeObjects.removeAll(selectedOrdersObservable);
        }

        selectedOrderObservable = null;
        selectedOrdersObservable = null;
    }

    private String parseHousenumber(String str) {
        // Special case: Mannheim's square city
        Matcher matchSquare = Pattern.compile("^([a-zA-Z])\\d").matcher(str);
        if(matchSquare.find()) {
            Matcher match = Pattern.compile("(?!\\w\\W[0-9])\\s?[0-9].*").matcher(str);
            if (match.find()) {
                return match.group(0).trim();
            }
            return "";
        } else {
            // All other street names, including missing whitespaces between street and house number
            Matcher match = Pattern.compile("(?!\\w\\W)?\\s?[0-9].*").matcher(str);

            if (match.find()) {
                return match.group(0).trim();
            }
            return "";
        }

    }

    private String parseStreet(String str) {
        // Special case: Mannheim's square city

        str = str.replaceAll("[,_!]", "");
        str = str.replaceAll("�", "ß");
        Matcher matchSquare = Pattern.compile("^([a-zA-Z])\\d").matcher(str);
        if(matchSquare.find()) {
            return matchSquare.group(0).trim();
        } else {


            // All other street names, including missing whitespaces between street and house number
            Matcher match = Pattern.compile("^([a-zA-ZäöüÄÖÜß.�\\-\\s])+(?=[0-9])").matcher(str);

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

    protected void initPredicate() {
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {

            magentoCustomerTable.setPredicate(new OrderFilter(newValue));

        });
    }

    protected class OrderFilter implements Predicate<TreeItem<OrderTreeObject>> {
        private final String filterText;

        OrderFilter(String filterText) {
            this.filterText = filterText.trim();
        }

        public boolean test(TreeItem<OrderTreeObject> orderTreeObjectTreeItem) {

            Boolean filter = orderTreeObjectTreeItem.getValue().getCustomerName().getValue().contains(filterText) || orderTreeObjectTreeItem.getValue().getChannelAccountName().getValue().contains(filterText) || orderTreeObjectTreeItem.getValue().getFirstItem().getValue().contains(filterText);
            magentoCustomerTable.getSelectionModel().clearSelection();

            return filter;
        }
    }

    protected void initCounts() {
        labelCount.setText(String.valueOf(magentoCustomerTable.getRoot().getChildren().size()));
    }

    public  class ProductCell extends ListCell<SalesProduct> {
        HBox hbox = new HBox();
        Label label = new Label();
        Pane pane = new Pane();
        Button button = new Button("Details");
        SalesProduct salesProduct;



        public ProductCell() {
            super();
            hbox.getChildren().addAll(label, pane, button);
            HBox.setHgrow(pane, Priority.ALWAYS);
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    infoSelectedProduct = salesProduct;

                    loadDependentView("prodwsdetails.fxml");
                }
            });
        }

        @Override
        protected void updateItem(SalesProduct item, boolean empty) {
            super.updateItem(item, empty);
            setText(null);  // No text in label of super class
            if (empty) {
                salesProduct = null;
                setGraphic(null);
            } else {
                salesProduct = item;
                label.setMaxWidth(200);
                label.setWrapText(true);
                label.setText(item!=null ? salesProduct.getName() + " (" + salesProduct.getGrossPriceValue() + " " + salesProduct.getGrossPriceCurrency() + ")" : "<null>");
                setGraphic(hbox);
            }
        }
    }
}
