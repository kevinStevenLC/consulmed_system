package com.project.da.utils.independiente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.models.independiente.Antecedentes;
import com.project.da.models.independiente.Enfermero;
import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;
import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.Paciente;

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
		} catch (SQLException e) {
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
		} catch (SQLException e) {
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

	public List<Antecedentes> obtenerPocosAntecedentes() {
		List<Antecedentes> antecedentesList = new ArrayList<>();
		String query = "(SELECT id, tipo, descripcion FROM antecedentes WHERe tipo ='Antecedentes Personales' LIMIT 2)" +
				"UNION ALL" + "(SELECT id, tipo, descripcion FROM antecedentes WHERe tipo ='Antecedentes Patológicos' LIMIT 2)"
				+
				"UNION ALL"
				+ "(SELECT id, tipo, descripcion FROM antecedentes WHERe tipo ='Antecedentes Gineco-Obstétricos' LIMIT 2)";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String tipo = rs.getString("tipo");
				String descripcion = rs.getString("descripcion");
				Antecedentes a = new Antecedentes(id, tipo, descripcion);
				antecedentesList.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return antecedentesList;

	}

	public Antecedentes obtenerAntecedentesPorId(int id) {
		Antecedentes antecedente = null;
		String query = "SELECT id, tipo, descripcion FROM antecedentes WHERE id= ?";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				int antecedentesId = rs.getInt("id");
				String tipo = rs.getString("tipo");
				String descripcion = rs.getString("descripcion");
				antecedente = new Antecedentes(antecedentesId, tipo, descripcion);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return antecedente;
	}

	public static void main(String[] args) throws SQLException {
		IndependienteObtenerTodos idt = new IndependienteObtenerTodos();
		for (Antecedentes a : idt.obtenerPocosAntecedentes()) {
			System.out.println("ID: " + a.getId() + " Tipo: " + a.getTipo() + " Descripcion: " + a.getDescripcion());
		}
	}

}
