package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.model.Settings;
import com.allaboutapple.WaWi.WaWiApplication.service.SettingsXmlService;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

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

    private Settings settings;



    @FXML
    void initialize() {

        File settingsFile = new File(WaWiApplication.getHomeDirectory() + "settings.xml");
        if(settingsFile.exists()) {
            try {
                settings = SettingsXmlService.getInstance().read(WaWiApplication.getHomeDirectory() + "settings.xml");
                magentoApiUrlLabel.setText(settings.getMagento2ApiUrl());
                magentoAccessTokenLabel.setText(settings.getMagento2AccessToken());
                magentoAccessTokenSecretLabel.setText(settings.getMagento2AccessTokenSecret());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // curl -X GET "http://allabout-apple.dev/rest/default/V1/orders?searchCriteria%5Bfilter_groups%5D%5B0%5D%5Bfilters%5D%5B0%5D%5Bcondition_type%5D=eq&searchCriteria%5Bfilter_groups%5D%5B0%5D%5Bfilters%5D%5B0%5D%5Bfield%5D=status&searchCriteria%5BsortOrders%5D%5B0%5D%5Bfield%5D=created_at&searchCriteria%5BsortOrders%5D%5B0%5D%5Bdirection%5D=desc&searchCriteria%5Bfilter_groups%5D%5B0%5D%5Bfilters%5D%5B0%5D%5Bvalue%5D=processing" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://allabout-apple.dev/rest/default/V1/order/4162/ship?notify=true" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://allabout-apple.dev/rest/default/V1/order/4162/invoice?notify=true" -H "Authorization: Bearer et7rnl0tu234ma3aw2idu9vg725wuhm9"
        // curl -X POST "http://www.allabout-apple.com/rest/default/V1/order/4314/ship?notify=true" -H "Authorization: Bearer d1v6g4lakw92hneb1f8aymmmaycq9h0j"
        settings = new Settings();
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

    private void fillSettingsModel() {
        settings.setMagento2AccessToken(magentoAccessTokenLabel.getText());
        settings.setMagento2ApiUrl(magentoApiUrlLabel.getText());
        settings.setMagento2AccessTokenSecret(magentoAccessTokenSecretLabel.getText());
    }
}
