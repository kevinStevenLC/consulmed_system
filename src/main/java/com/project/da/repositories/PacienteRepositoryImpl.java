package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.Paciente;
import com.project.da.services.PacienteService;

public class PacienteRepositoryImpl implements BaseRepository<Paciente> {

	@Override
	public List<Paciente> findAll() {
		List<Paciente> pacienteList = new ArrayList<>();
		String query = "SELECT id, nombres, apellidos, tipoSangre, telefono, email, genero FROM paciente;";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			ResultSet rs = preparedStatement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombres");
				String apellidos = rs.getString("apellidos");
				String tipoSangre = rs.getString("tipoSangre");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");
				String genero = rs.getString("genero");

				Paciente paciente = new Paciente(id, nombre, apellidos, tipoSangre, telefono, email, genero);
				pacienteList.add(paciente);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pacienteList;
	}

	@Override
	public Paciente findById(int id) {

		Paciente paciente = null;
		String query = "SELECT id, nombres, apellidos, tipoSangre, telefono, email, genero FROM paciente WHERE id= ?";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				int pacienteId = rs.getInt("id");
				String nombres = rs.getString("nombres");
				String apellidos = rs.getString("apellidos");
				String tipoSangre = rs.getString("tipoSangre");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");
				String genero = rs.getString("genero");
				paciente = new Paciente(pacienteId, nombres, apellidos, tipoSangre, telefono, email, genero);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return paciente;
	}

	@Override
	public boolean save(Paciente entidad) {

		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

	@Override
	public boolean update(Paciente entidad) {
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

	public static void main(String[] args) {
		PacienteRepositoryImpl pacienteRepositoryImpl = new PacienteRepositoryImpl();
		PacienteService pacienteService = new PacienteService(pacienteRepositoryImpl);

		for (Paciente paciente : pacienteService.obtenerTodosPaciente()) {
			System.out.println("email: " + paciente.getEmail() + " ID: "
					+ paciente.getId());
		}
	}

}
