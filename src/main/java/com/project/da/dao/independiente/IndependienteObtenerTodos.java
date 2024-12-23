package com.project.da.dao.independiente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.da.dao.DbConexion;
import com.project.da.models.independiente.Antecedentes;
import com.project.da.models.independiente.Enfermero;
import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;
import com.project.da.models.independiente.SignoVital;

public class IndependienteObtenerTodos {

	// get Enfermeros
	public List<Enfermero> obtenerTodosEnfermeros() throws SQLException {
		List<Enfermero> enfermeroList = new ArrayList<>();
		String query = "SELECT id, nombresCompletos FROM enfermero;";
		try {
			Statement statement = DbConexion.getConection_db().createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombresCompletos = rs.getString("nombresCompletos");

				Enfermero enfermero = new Enfermero(id, nombresCompletos);
				enfermeroList.add(enfermero);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		DbConexion.getConection_db().close();
		return enfermeroList;
	}

	public List<Antecedentes> obtnerTodosAntecedentes() throws SQLException {
		List<Antecedentes> antecedentesList = new ArrayList<>();
		String query = "SELECT id, tipo, descripcion FROM antecedentes;";
		try {
			Statement statement = DbConexion.getConection_db().createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String tipo = rs.getString("tipo");
				String descripcion = rs.getString("descripcion");

				Antecedentes antecedentes = new Antecedentes(id, tipo, descripcion);
				antecedentesList.add(antecedentes);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		DbConexion.getConection_db().close();
		return antecedentesList;
	}

	public List<ExamenFisico> obtnerTodosExamenesFisicos() throws SQLException {
		List<ExamenFisico> examenFisicoList = new ArrayList<>();
		String query = "SELECT id, grupo, padecimiento, descripcion FROM examenFisico;";
		try {
			Statement statement = DbConexion.getConection_db().createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String grupo = rs.getString("grupo");
				String padecimiento = rs.getString("padecimiento");
				String descripcion = rs.getString("descripcion");

				ExamenFisico eF = new ExamenFisico(id, grupo, padecimiento, descripcion);
				examenFisicoList.add(eF);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		DbConexion.getConection_db().close();
		return examenFisicoList;
	}

	public List<ExamenAdicional> obtnerTodosExamenesAdicionales() throws SQLException {
		List<ExamenAdicional> examenAdicionalList = new ArrayList<>();
		String query = "SELECT id, grupo, descripcion FROM examenAdicional;";
		try {
			Statement statement = DbConexion.getConection_db().createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String grupo = rs.getString("grupo");
				String descripcion = rs.getString("descripcion");

				ExamenAdicional eA = new ExamenAdicional(id, grupo, descripcion);
				examenAdicionalList.add(eA);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		DbConexion.getConection_db().close();
		return examenAdicionalList;
	}

	public List<SignoVital> obtenerTodosSignosVitales() throws SQLException {
		List<SignoVital> signoVitalesList = new ArrayList<>();
		String query = "SELECT id, descripcion FROM signovital;";
		try {
			Statement statement = DbConexion.getConection_db().createStatement();
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String descripcion = rs.getString("descripcion");

				SignoVital sgv = new SignoVital(id, descripcion);
				signoVitalesList.add(sgv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		DbConexion.getConection_db().close();

		return signoVitalesList;
	}

	public static void main(String[] args) throws SQLException {
		// IndependienteObtenerTodos idt = new IndependienteObtenerTodos();
		/*
		 * for (Antecedentes a : idt.obtnerTodosAntecedentes()) {
		 * System.out.printf("Tipo: %s - Descripcion: %s%n", a.getTipo(),
		 * a.getDescripcion());
		 * }
		 */
		/*
		 * for (ExamenFisico ef : idt.obtnerTodosExamenesFisicos()) {
		 * System.out.printf("grupo: %s - padecimiento: %s - descripcion: %s%n",
		 * ef.getGrupo(), ef.getPadecimiento(),
		 * ef.getDescripcion());
		 * }
		 */

		/*
		 * for (ExamenAdicional ea : idt.obtnerTodosExamenesAdicionales()) {
		 * System.out.printf("grupo: %s - Descripcion: %s%n", ea.getGrupo(),
		 * ea.getDescripcion());
		 * }
		 */

		/*
		 * for (SignoVital sgv : idt.obtenerTodosSignosVitales()) {
		 * System.out.printf("Descripcion: %s%n", sgv.getDescripcion());
		 * }
		 */
	}

}
