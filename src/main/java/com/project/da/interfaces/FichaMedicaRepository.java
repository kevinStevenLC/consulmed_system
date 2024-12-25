package com.project.da.interfaces;

import java.sql.SQLException;
import java.util.List;

import com.project.da.models.principal.FichaMedica;

public interface FichaMedicaRepository {

	List<FichaMedica> findAll();

	FichaMedica findById(int id);

	boolean save(FichaMedica fichaMedica) throws SQLException;

	boolean update(FichaMedica fichaMedica);

	boolean delete(int id);

}
