package com.project.da.interfaces;

import java.util.List;

import com.project.da.models.FichaMedica;

public interface FichaMedicaRepository {

	List<FichaMedica> findAll();

	FichaMedica findById(int id);

	boolean save(FichaMedica fichaMedica);

	boolean update(FichaMedica fichaMedica);

	boolean delete(int id);

}
