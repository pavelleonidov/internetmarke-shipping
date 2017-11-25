package com.allaboutapple.WaWi.WaWiApplication.controller;


import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.stage.Stage;

@FXMLController
public class AbstractController {

    protected void loadView(String fxmlPath) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/settings.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        } {
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}
