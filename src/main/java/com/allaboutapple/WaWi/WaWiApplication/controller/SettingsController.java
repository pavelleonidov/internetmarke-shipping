package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.model.PrinterMap;

//import com.allaboutapple.WaWi.WaWiApplication.service.prodws.*;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProduct;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.service.PrinterService;
import com.allaboutapple.WaWi.WaWiApplication.service.ProdWSSalesProductService;
import com.allaboutapple.WaWi.WaWiApplication.service.SettingsXmlService;


import com.jfoenix.controls.*;
import de.felixroske.jfxsupport.FXMLController;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.print.Printer;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.util.Callback;
import javafx.util.StringConverter;
import org.controlsfx.control.ListSelectionView;


import javax.swing.event.ChangeListener;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@FXMLController
public class SettingsController {


    @FXML
    private JFXTextField magentoApiUrlLabel;

    @FXML
    private JFXTextField magentoAccessTokenLabel;

    @FXML
    private JFXTextField magentoAccessTokenSecretLabel;

    @FXML
    private JFXButton testMagentoApiButton;

    @FXML
    private JFXButton saveButton;

    @FXML
    private JFXTextField prodWSUsername;

    @FXML
    private JFXPasswordField prodWSPassword;

    @FXML
    private JFXTextField prodWSMandantId;

    @FXML
    private JFXButton prodWSFetchProductData;

    @FXML
    private JFXTextField pcfOneClickUsername;

    @FXML
    private JFXPasswordField pcfOneClickPassword;

    @FXML
    private ListSelectionView<SalesProduct> salesProductListView;

    @FXML
    private JFXComboBox<PrinterMap> printerSelect;


    @FXML
    private JFXButton testPrinter;


   // @FXML
   // private ListSelectionView<SalesProduct> salesProductListViewNew;

    private static Settings settings;


    @FXML
    void initialize() {

        List<Printer> printers = PrinterService.getInstance().getAllPrinters();
        AtomicInteger index = new AtomicInteger();
        printers.forEach(item -> {
            PrinterMap printerMap = new PrinterMap(index.getAndIncrement(), item.getName());
            printerSelect.getItems().add(printerMap);
        });


        magentoApiUrlLabel.setText(getSettings().getMagento2ApiUrl());
        magentoAccessTokenLabel.setText(getSettings().getMagento2AccessToken());
        magentoAccessTokenSecretLabel.setText(getSettings().getMagento2AccessTokenSecret());
        prodWSMandantId.setText(getSettings().getProdWSMandantId());
        prodWSPassword.setText(getSettings().getProdWSPassword());
        prodWSUsername.setText(getSettings().getProdWSUsername());
        pcfOneClickPassword.setText(getSettings().getProdWSPassword());
        pcfOneClickUsername.setText(getSettings().getProdWSUsername());
        printerSelect.getSelectionModel().select(getSettings().getCurrentPrinter());

        SalesProductList productList = ProdWSSalesProductService.getInstance().getProducts();

        ObservableList<SalesProduct> observableList = FXCollections.observableList(productList.getProducts());
       // salesProductListView.setItems(observableList);

     /*   salesProductListView.setCellFactory(new Callback<ListView<SalesProduct>, ListCell<SalesProduct>>() {
            @Override
            public ListCell<SalesProduct> call(ListView<SalesProduct> salesProductListView) {
                ListCell<SalesProduct> cell = new ListCell<SalesProduct>() {
                    @Override
                    protected void updateItem(SalesProduct t, boolean bln) {
                        super.updateItem(t, bln);
                        if(t != null) {
                            setText(t.getName());
                        }
                    }
                };

                return cell;
            }
        }); */

        salesProductListView.setSourceItems(observableList);
        salesProductListView.setCellFactory(new Callback<ListView<SalesProduct>, ListCell<SalesProduct>>() {
            @Override
            public ListCell<SalesProduct> call(ListView<SalesProduct> salesProductListView) {
                ListCell<SalesProduct> cell = new ListCell<SalesProduct>() {
                    @Override
                    protected void updateItem(SalesProduct t, boolean bln) {
                        super.updateItem(t, bln);
                        if(t != null) {
                            setText(t.getName());
                        }
                    }
                };

                return cell;
            }
        });



        printerSelect.setCellFactory((final ListView<PrinterMap> listView) -> {
            return new ComboBoxListCell<PrinterMap>() {
                @Override
                public void updateItem(PrinterMap t, boolean bln) {
                    super.updateItem(t, bln);
                    if(t != null) {
                        setText(t.getName());
                    } else {
                        setText(null);
                    }
                }
            };
        });

        printerSelect.setConverter(new StringConverter<PrinterMap>() {
            @Override
            public String toString(PrinterMap printerMap) {
                if(printerMap == null) {
                    return "";
                } else {
                    return printerMap.getName();
                }
            }

            @Override
            public PrinterMap fromString(String s) {
                return null;
            }
        });

        // curl -X GET "http://allabout-apple.com/rest/default/schema" -H "Authorization: Bearer d1v6g4lakw92hneb1f8aymmmaycq9h0j"
        // curl -X GET "http://allabout-apple.dev/rest/default/V1/orders?searchCriteria[filter_groups][0][filters][0][condition_type]=eq&searchCriteria[filter_groups][0][filters][0][field]=status&searchCriteria[sortOrders][0][field]=created_at&searchCriteria[sortOrders][0][direction]=desc&searchCriteria[filter_groups][0][filters][0][value]=processing" -H "Authorization: Bearer d1v6g4lakw92hneb1f8aymmmaycq9h0j"
        // curl -X POST "http://allabout-apple.dev/rest/default/V1/order/4162/ship?notify=true" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://allabout-apple.dev/rest/default/V1/order/4162/invoice?notify=true" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://www.allabout-apple.com/rest/default/V1/order/4314/ship?notify=true" -H "Authorization: Bearer d1v6g4lakw92hneb1f8aymmmaycq9h0j"
        testMagentoApiButton.setOnAction(event -> {
            fillSettingsModel();

        });

        testPrinter.setOnAction(event -> {
            fillSettingsModel();
            Label testText = new Label();
            testText.setText(printerSelect.getSelectionModel().getSelectedItem().getName());
            PrinterService.getInstance().print(testText);
        });

        saveButton.setOnAction(event -> {
            fillSettingsModel();
            try {
                SettingsXmlService.getInstance().write(settings);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

    public void triggerSaveProducts(final Event e) {
        fillSettingsModel();
        ProdWSSalesProductService.getInstance().saveProducts();
    }

    private void fillSettingsModel() {
        settings.setMagento2AccessToken(magentoAccessTokenLabel.getText());
        settings.setMagento2ApiUrl(magentoApiUrlLabel.getText());
        settings.setMagento2AccessTokenSecret(magentoAccessTokenSecretLabel.getText());
        settings.setPcfOneClickUsername(pcfOneClickUsername.getText());
        settings.setPcfOneClickPassword(pcfOneClickPassword.getText());
        settings.setProdWSMandantId(prodWSMandantId.getText());
        settings.setProdWSPassword(prodWSPassword.getText());
        settings.setProdWSUsername(prodWSUsername.getText());
        settings.setCurrentPrinter(printerSelect.getSelectionModel().getSelectedItem().getIdentifier());
    }

    public static Settings getSettings() {

        if (settings == null) {
            initSettings();
        }
        return settings;
    }

    private static void initSettings() {
        File settingsFile = new File(WaWiApplication.getHomeDirectory() + "settings.xml");

        if (settingsFile.exists()) {
            System.out.println("File exists");
            try {
                settings = SettingsXmlService.getInstance().read();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            settings = new Settings();
            System.out.println("Settings model is empty!");
        }
    }




}
