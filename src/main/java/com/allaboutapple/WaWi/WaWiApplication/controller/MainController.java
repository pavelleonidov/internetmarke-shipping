package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.view.SettingsView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@FXMLController
public class MainController extends AbstractController {
    @FXML
    private MenuItem settingsButton;

    @FXML
    private MenuItem aboutButton;


    @FXML
    void initialize() {
        settingsButton.setOnAction(event -> {

           // WaWiApplication.showView(SettingsView.class);
        
            loadView("/fxml/settings.fxml");
        });
    }

}
