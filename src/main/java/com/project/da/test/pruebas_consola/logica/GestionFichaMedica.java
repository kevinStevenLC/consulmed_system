package com.project.da.test.pruebas_consola.logica;

import java.sql.SQLException;

import com.project.da.models.principal.FichaMedica;
import com.project.da.repositories.FichaMedicaRepositoryImpl;
import com.project.da.services.FichaMedicaService;

public class GestionFichaMedica {

	FichaMedicaService fichaMedicaService;

	public GestionFichaMedica() {
		this.fichaMedicaService = new FichaMedicaService(new FichaMedicaRepositoryImpl());
	}

	public void crearFichaMedica(FichaMedica fichaMedica) {
		try {
			this.fichaMedicaService.guardarFichaMedica(fichaMedica);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void actualizarFichaMedica(FichaMedica fichaMedica) {
		this.fichaMedicaService.actualizarFichaMedica(fichaMedica);
	}

}
