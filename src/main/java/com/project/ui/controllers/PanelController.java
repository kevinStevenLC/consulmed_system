package com.project.ui.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

//? Controlador del panelController.fxml
public class PanelController implements Initializable {
	Stage stagePanel;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	// aqui recibe cualquier stage(ventana) referencia a un dato de tipo Stage.
	public void recivePanel(@SuppressWarnings("exports") Stage stage) {
		this.stagePanel = stage;
	}

	// despues puedes mostrar aqui lo que enviaste desde App.java
	@FXML
	void frame() {
		// stagePanel.show()
	}

}