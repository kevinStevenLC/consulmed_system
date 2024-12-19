package com.project.da.repositories;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
//import com.project.da.interfaces.EnfermeroRepository;
import com.project.da.models.independiente.Enfermero;

public class EnfermeroRepositoryImpl implements BaseRepository<Enfermero> {

	@Override
	public List<Enfermero> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public Enfermero findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(Enfermero antecedentes) {
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

}
