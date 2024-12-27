package com.project.da.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.interfaces.PacienteRepository;
import com.project.da.models.principal.Paciente;
import com.project.da.services.PacienteService;

public class PacienteRepositoryImpl implements PacienteRepository {

	@Override
	public List<Paciente> findAll() {
		List<Paciente> pacienteList = new ArrayList<>();
		String query = "SELECT id, cedula, nombres, apellidos, tipoSangre, telefono, email, genero FROM paciente;";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			ResultSet rs = preparedStatement.executeQuery(query);

			while (rs.next()) {
				int id = rs.getInt("id");
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombres");
				String apellidos = rs.getString("apellidos");
				String tipoSangre = rs.getString("tipoSangre");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");
				String genero = rs.getString("genero");

				Paciente paciente = new Paciente(cedula, nombre, apellidos, tipoSangre, telefono, email, genero);
				paciente.setId(id);
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
		String query = "SELECT id, cedula, nombres, apellidos, tipoSangre, telefono, email, genero FROM paciente WHERE id= ?";
		try (Connection conn = DbConexion.getConection_db();
				PreparedStatement preparedStatement = conn.prepareStatement(query)) {
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				int pacienteId = rs.getInt("id");
				String cedula = rs.getString("cedula");
				String nombres = rs.getString("nombres");
				String apellidos = rs.getString("apellidos");
				String tipoSangre = rs.getString("tipoSangre");
				String telefono = rs.getString("telefono");
				String email = rs.getString("email");
				String genero = rs.getString("genero");
				paciente = new Paciente(cedula, nombres, apellidos, tipoSangre, telefono, email, genero);
				paciente.setId(pacienteId);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return paciente;
	}

	@Override
	public int save(Paciente entidad) {
		String query = "INSERT INTO paciente (cedula, nombres, apellidos, tipoSangre, telefono, email, genero) VALUES (?,?,?,?,?,?,?)";
		try (PreparedStatement preparedStatement = DbConexion.getConection_db().prepareStatement(query,
				Statement.RETURN_GENERATED_KEYS)) {
			preparedStatement.setString(1, entidad.getCedula());
			preparedStatement.setString(2, entidad.getNombres());
			preparedStatement.setString(3, entidad.getApellidos());
			preparedStatement.setString(4, entidad.getTipoSangre());
			preparedStatement.setString(5, entidad.getTelefono());
			preparedStatement.setString(6, entidad.getEmail());
			preparedStatement.setString(7, entidad.getGenero());

			preparedStatement.executeUpdate();
			try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					return generatedKeys.getInt(1);
				} else {
					throw new SQLException("No se pudo obtener el ID generado");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

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

		/*
		 * for (Paciente paciente : pacienteService.obtenerTodosPaciente()) {
		 * System.out.println("email: " + paciente.getEmail() + " ID: "
		 * + paciente.getId());
		 * }
		 */

		Paciente p = new Paciente("1234567891", "kevin nada", "steven nada", "c++", "923239293", "keee@gamil.com",
				"Masculino");
		try {
			pacienteService.guardarPaciente(p);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
