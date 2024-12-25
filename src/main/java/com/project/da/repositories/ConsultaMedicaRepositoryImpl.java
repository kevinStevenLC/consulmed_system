package com.project.da.repositories;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
//import com.project.da.interfaces.ConsultaMedicaRepository;
import com.project.da.models.principal.ConsultaMedica;

public class ConsultaMedicaRepositoryImpl implements BaseRepository<ConsultaMedica> {

	@Override
	public List<ConsultaMedica> findAll() {

		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public ConsultaMedica findById(int id) {

		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(ConsultaMedica antecedentes) {

		return false;
	}

	@Override
	public boolean delete(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'delete'");
	}

}
