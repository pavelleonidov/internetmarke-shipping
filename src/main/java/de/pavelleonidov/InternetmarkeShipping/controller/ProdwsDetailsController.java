package de.pavelleonidov.InternetmarkeShipping.controller;

import com.jfoenix.controls.*;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import de.felixroske.jfxsupport.FXMLController;
import de.pavelleonidov.InternetmarkeShipping.model.magento.OrderDetailsTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.ProdWSDetailsTreeObject;
import de.pavelleonidov.InternetmarkeShipping.model.prodws.SalesProduct;
import de.pavelleonidov.InternetmarkeShipping.utility.magento.OrderDetailsTreeColumnFactory;
import de.pavelleonidov.InternetmarkeShipping.utility.prodws.ProdWSDetailsColumnFactory;
import io.swagger.client.ApiException;
import io.swagger.client.api.SalesOrderAddressRepositoryV1Api;
import io.swagger.client.model.SalesDataOrderAddressInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TreeItem;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

@FXMLController
public class ProdwsDetailsController {

    @FXML
    private JFXTreeTableView<ProdWSDetailsTreeObject> prodwsDetailTableView;


    @FXML
    public void initialize() {

        JFXTreeTableColumn<ProdWSDetailsTreeObject, String> labelColumn = ProdWSDetailsColumnFactory.getInstance().createColumn("Label", "label");
        JFXTreeTableColumn<ProdWSDetailsTreeObject, String> valueColumn = ProdWSDetailsColumnFactory.getInstance().createColumn("Wert", "value", 200);

        prodwsDetailTableView.getColumns().setAll(labelColumn, valueColumn);

        ObservableList<ProdWSDetailsTreeObject> observableList = FXCollections.observableArrayList();

        SalesProduct product = MainController.getInfoSelectedProduct();

        observableList.addAll(
                new ProdWSDetailsTreeObject("Name", product.getName()),
                new ProdWSDetailsTreeObject("Annotation", product.getAnnotation()),
                new ProdWSDetailsTreeObject("Description", product.getDescription()),
                new ProdWSDetailsTreeObject("Minimale Länge", product.getMinLength()),
                new ProdWSDetailsTreeObject("Maximale Länge", product.getMaxLength()),
                new ProdWSDetailsTreeObject("Minimale Breite", product.getMinWidth()),
                new ProdWSDetailsTreeObject("Maximale Breite", product.getMaxWidth()),
                new ProdWSDetailsTreeObject("Minimale Höhe", product.getMinHeight()),
                new ProdWSDetailsTreeObject("Maximale Höhe", product.getMaxHeight()),
                new ProdWSDetailsTreeObject("Minimales Gewicht", product.getMinWeight()),
                new ProdWSDetailsTreeObject("Maximales Gewicht", product.getMaxWeight()),
                new ProdWSDetailsTreeObject("Tracking möglich", product.isTrackingPossible() ? "Ja" : "Nein"),
                new ProdWSDetailsTreeObject("Erlaubte Form", product.getAllowedForm()),
                new ProdWSDetailsTreeObject("Ziel", product.getDestination())
        );

        TreeItem<ProdWSDetailsTreeObject> rootProdWSDetails = new RecursiveTreeItem<ProdWSDetailsTreeObject>(observableList, RecursiveTreeObject::getChildren);
        prodwsDetailTableView.setRoot(rootProdWSDetails);
        prodwsDetailTableView.setShowRoot(false);
    }

}
