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
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

        prodWSFetchProductData.setOnAction(event -> {
            fillSettingsModel();

            ProdWSSalesProductService.getInstance().saveProducts();

        });

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

    public class SOAPMessageWriterHandler implements SOAPHandler<SOAPMessageContext> {

        public boolean handleMessage(SOAPMessageContext smc) {

            Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

            SOAPMessage message = smc.getMessage();

            try {
                if (!outboundProperty.booleanValue()) {
                    System.out.println("SOAP Response : ");
                    message.writeTo(System.out);
                } else {
                    System.out.println("SOAP Request : ");
                    message.writeTo(System.out);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return outboundProperty;
        }

        public Set getHeaders() {
            return null;
        }

        public boolean handleFault(SOAPMessageContext context) {
            return true;
        }

        public void close(MessageContext context) {
        }


    }


}
