package com.allaboutapple.WaWi.WaWiApplication.controller;

import com.allaboutapple.WaWi.WaWiApplication.WaWiApplication;
import com.allaboutapple.WaWi.WaWiApplication.view.SettingsView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;

import java.io.IOException;

@FXMLController
public class MainController extends AbstractController {

    public void showToolWindow(Event event) throws IOException {
        WaWiApplication.showView(SettingsView.class, Modality.NONE);
    }

}
