package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.OrderTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.model.magento.SalesItemTreeObject;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.OrderTreeColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.utility.magento.SalesItemColumnFactory;
import com.allaboutapple.WaWi.WaWiApplication.view.SettingsView;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import de.felixroske.jfxsupport.FXMLController;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;
import javafx.stage.Modality;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@FXMLController
public class MainController extends AbstractController {

    @FXML
    private JFXTreeTableView<OrderTreeObject> magentoCustomerTable;

    @FXML
    private JFXTreeTableView<SalesItemTreeObject> orderDetailsProducts;

    @FXML
    void initialize() {


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

                        final TreeItem<SalesItemTreeObject> rootProduct = new RecursiveTreeItem<SalesItemTreeObject>(salesItemTreeObjects, RecursiveTreeObject::getChildren);
                        orderDetailsProducts.setRoot(rootProduct);
                        orderDetailsProducts.setShowRoot(false);
                    });

                } catch (io.swagger.client.ApiException e) {
                    e.printStackTrace();

                    System.out.println(e.getResponseBody());
                }
            }

    }

    public void showToolWindow(Event event) throws IOException {
        WaWiApplication.showView(SettingsView.class, Modality.NONE);
    }



}
