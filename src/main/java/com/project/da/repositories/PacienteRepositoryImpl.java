package com.project.da.repositories;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.principal.Paciente;

public class PacienteRepositoryImpl implements BaseRepository<Paciente> {

	@Override
	public List<Paciente> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public Paciente findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
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
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'update'");
	}

}
