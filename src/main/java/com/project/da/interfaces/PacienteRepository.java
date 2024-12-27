package com.project.da.interfaces;

import com.project.da.models.principal.Paciente;

import java.sql.SQLException;
import java.util.List;

public interface PacienteRepository {

	List<Paciente> findAll();

	Paciente findById(int id);

	int save(Paciente fichaMedica) throws SQLException;

	boolean update(Paciente fichaMedica);

	boolean delete(int id);

}
