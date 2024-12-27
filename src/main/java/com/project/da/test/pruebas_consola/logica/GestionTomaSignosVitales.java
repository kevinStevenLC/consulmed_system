package com.project.da.test.pruebas_consola.logica;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.da.models.detalles.TomaSignosVitalesDetalles;
import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.TomaSignosVitales;
import com.project.da.repositories.TomaSignosVitalesDetallesRepositoryImpl;
import com.project.da.repositories.TomaSignosVitalesRepositoryImpl;
import com.project.da.services.TomaSignosVitalesDetallesService;
import com.project.da.services.TomaSignosVitalesService;
import com.project.da.utils.independiente.IndependienteObtenerTodos;

public class GestionTomaSignosVitales {

	TomaSignosVitalesService tomaSignosVitalesService;
	IndependienteObtenerTodos ipot;
	TomaSignosVitalesDetallesService tomaSignosVitalesDetallesService;

	public GestionTomaSignosVitales() {
		this.tomaSignosVitalesService = new TomaSignosVitalesService(new TomaSignosVitalesRepositoryImpl());
		ipot = new IndependienteObtenerTodos();
		this.tomaSignosVitalesDetallesService = new TomaSignosVitalesDetallesService(
				new TomaSignosVitalesDetallesRepositoryImpl());
	}

	public int guardarTomaSignosVitales(TomaSignosVitales tomaSignosVitales) {
		int idTomaSIgnosVitales = 0;
		try {
			// se guarda y obtiene el Id
			idTomaSIgnosVitales = this.tomaSignosVitalesService.guardarTomaSignosVitales(tomaSignosVitales);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return idTomaSIgnosVitales;
	}

	public List<SignoVital> obtenerTodosSignoVital() {
		List<SignoVital> ls = new ArrayList<>();
		try {
			ls = this.ipot.obtenerTodosSignosVitales();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ls;
	}

	public TomaSignosVitales obtenenerTomaSignosVitalesPorID(int id) throws SQLException {
		return tomaSignosVitalesService.obtennerTomaSignosVitalesPorID(id);
	}

	public void guardarSignosVitalesDetalles(TomaSignosVitalesDetalles tm) {
		try {

			this.tomaSignosVitalesDetallesService.guardarTomaSignosVitalesD(tm);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
