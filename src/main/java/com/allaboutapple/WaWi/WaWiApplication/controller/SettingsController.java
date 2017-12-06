package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.BasicProduct;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.BasicProductList;
//import com.allaboutapple.WaWi.WaWiApplication.service.prodws.*;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProduct;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.SalesProductList;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.ExtendedIdentifierType;
import com.allaboutapple.WaWi.WaWiApplication.model.prodws.types.UnitPriceType;
import com.allaboutapple.WaWi.WaWiApplication.service.ProdWSSalesProductService;
import com.allaboutapple.WaWi.WaWiApplication.service.SettingsXmlService;


import com.allaboutapple.WaWi.WaWiApplication.service.prodws.*;


import com.allaboutapple.WaWi.WaWiApplication.utility.handler.soap.WSSecurityHeaderSOAPHandler;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.felixroske.jfxsupport.FXMLController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import org.springframework.beans.factory.annotation.Autowired;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Binding;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import javax.xml.ws.BindingProvider;
import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    private JFXListView<SalesProduct> salesProductListView;

    private static Settings settings;


    @FXML
    void initialize() {


        magentoApiUrlLabel.setText(getSettings().getMagento2ApiUrl());
        magentoAccessTokenLabel.setText(getSettings().getMagento2AccessToken());
        magentoAccessTokenSecretLabel.setText(getSettings().getMagento2AccessTokenSecret());
        prodWSMandantId.setText(getSettings().getProdWSMandantId());
        prodWSPassword.setText(getSettings().getProdWSPassword());
        prodWSUsername.setText(getSettings().getProdWSUsername());
        pcfOneClickPassword.setText(getSettings().getProdWSPassword());
        pcfOneClickUsername.setText(getSettings().getProdWSUsername());

        SalesProductList productList = ProdWSSalesProductService.getInstance().getProducts();

        ObservableList<SalesProduct> observableList = FXCollections.observableList(productList.getProducts());
        salesProductListView.setItems(observableList);

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


        // curl -X GET "http://allabout-apple.dev/rest/default/V1/orders?searchCriteria%5Bfilter_groups%5D%5B0%5D%5Bfilters%5D%5B0%5D%5Bcondition_type%5D=eq&searchCriteria%5Bfilter_groups%5D%5B0%5D%5Bfilters%5D%5B0%5D%5Bfield%5D=status&searchCriteria%5BsortOrders%5D%5B0%5D%5Bfield%5D=created_at&searchCriteria%5BsortOrders%5D%5B0%5D%5Bdirection%5D=desc&searchCriteria%5Bfilter_groups%5D%5B0%5D%5Bfilters%5D%5B0%5D%5Bvalue%5D=processing" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://allabout-apple.dev/rest/default/V1/order/4162/ship?notify=true" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://allabout-apple.dev/rest/default/V1/order/4162/invoice?notify=true" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://www.allabout-apple.com/rest/default/V1/order/4314/ship?notify=true" -H "Authorization: Bearer d1v6g4lakw92hneb1f8aymmmaycq9h0j"
        testMagentoApiButton.setOnAction(event -> {
            fillSettingsModel();

        });

        saveButton.setOnAction(event -> {
            fillSettingsModel();
            try {
                SettingsXmlService.getInstance().write(settings, WaWiApplication.getHomeDirectory() + "settings.xml");
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
            try {
                settings = SettingsXmlService.getInstance().read(WaWiApplication.getHomeDirectory() + "settings.xml");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            settings = new Settings();
            System.out.println("Settings model is empty!");
        }
    }




}
