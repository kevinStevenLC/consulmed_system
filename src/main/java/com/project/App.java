package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.project.ui.controllers.PanelController;

/**
 * JavaFX App
 */
@SuppressWarnings("exports")
public class App extends Application {

    // ?Para cargar la ventana Principal
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/project/UI/views/fxml/panelController.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle("Panel de control");
        // Panel de control
        PanelController controller = loader.getController();
        // Enviando panel de control.
        controller.recivePanel(stage);
        // seguir enviando escenarios
        stage.show();
    }

    // ? Usalo para cargar escenarios(stage) cosa que cuando se lo envies a los
    // ?controladores de otros .fxml se pueda mostrar con .show() y listo
    public Stage GenerateFxml(String file, String title) throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/project/UI/views/fxml/" + file + ".fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.setTitle(title);

        return stage;
    }

    public static void main(String[] args) {
        launch();
    }

}