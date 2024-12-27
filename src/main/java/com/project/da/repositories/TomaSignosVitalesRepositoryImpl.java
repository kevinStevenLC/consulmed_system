package com.project.da.repositories;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.project.da.database.DbConexion;
import com.project.da.interfaces.TomaSignosVitalesRepository;
import com.project.da.models.independiente.Enfermero;
import com.project.da.models.principal.Paciente;
import com.project.da.models.principal.TomaSignosVitales;

public class TomaSignosVitalesRepositoryImpl implements TomaSignosVitalesRepository {

	@Override
	public List<TomaSignosVitales> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public TomaSignosVitales findById(int id) {
		TomaSignosVitales tomaSignosVitales = null;
		String query = "SELECT id, direccion, idEnfermero, idPaciente FROM tomasignosvitales WHERE id = ?";

		try {
			PreparedStatement preparedStatement = DbConexion.getConection_db().prepareStatement(query);
			preparedStatement.setInt(1, id);

			ResultSet rs = preparedStatement.executeQuery();

			if (rs.next()) {
				int tomaId = rs.getInt("id");
				String direccion = rs.getString("direccion");
				int idEnfermero = rs.getInt("idEnfermero");
				int idPaciente = rs.getInt("idPaciente");

				tomaSignosVitales = new TomaSignosVitales(new Enfermero(), direccion, new Paciente());
				tomaSignosVitales.getEnfermeroEncargado().setId(idEnfermero);
				tomaSignosVitales.getPaciente().setId(idPaciente);
				tomaSignosVitales.setId(tomaId);
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Manejo de excepción
		} finally {
			try {
				DbConexion.getConection_db().close(); // Cierre de conexión
			} catch (SQLException e) {
				e.printStackTrace(); // Problema al cerrar conexión
			}
		}

		return tomaSignosVitales;
	}

	@Override
	public int save(TomaSignosVitales entidad) {
		String query = "INSERT INTO tomasignosvitales (direccion, idEnfermero, idPaciente) VALUES (?, ?, ?)";
		try {
			PreparedStatement preparedStatement = DbConexion.getConection_db().prepareStatement(query,
					Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, entidad.getDireccionLugar());
			preparedStatement.setInt(2, entidad.getEnfermeroEncargado().getId());
			preparedStatement.setInt(3, entidad.getPaciente().getId());

			preparedStatement.executeUpdate();
			try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
				if (generatedKeys.next()) {
					return generatedKeys.getInt(1);
				} else {
					throw new SQLException("No se pudo obtener el ID generado(Toma de signos vitales)");
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
	public boolean update(TomaSignosVitales entidad) {
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

}
