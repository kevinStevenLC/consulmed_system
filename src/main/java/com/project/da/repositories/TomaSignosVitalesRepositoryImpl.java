package com.project.da.repositories;

import java.sql.PreparedStatement;
import java.util.List;

import com.project.da.dao.DbConexion;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.TomaSignosVitales;

public class TomaSignosVitalesRepositoryImpl implements BaseRepository<TomaSignosVitales> {

	@Override
	public List<TomaSignosVitales> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public TomaSignosVitales findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(TomaSignosVitales entidad) {
		String query = "INSERT INTO tomasignosvitales (direccion, idEnfermero, idPaciente) VALUES (?, ?, ?)";
		try {
			PreparedStatement preparedStatement = DbConexion.getConection_db().prepareStatement(query);
			preparedStatement.setString(1, entidad.getDireccionLugar());
			preparedStatement.setInt(2, entidad.getEnfermeroEncargado().getId());
			preparedStatement.setInt(3, entidad.getPaciente().getId());

			int rowInserted = preparedStatement.executeUpdate();
			if (rowInserted > 0) {
				System.out.println("signos vitales registrada.");
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

	@Override
	public boolean update(TomaSignosVitales entidad) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

}
