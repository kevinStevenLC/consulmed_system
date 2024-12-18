package com.project.da.repositories;

import java.util.List;

import com.project.da.interfaces.FichaMedicaRepository;
import com.project.da.models.FichaMedica;

public class FichaMedicaRepositoryImpl implements FichaMedicaRepository {

	// Logica de metodos en database

	@Override
	public List<FichaMedica> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public FichaMedica findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(FichaMedica fichaMedica) {
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

	@Override
	public boolean update(FichaMedica fichaMedica) {
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

}
