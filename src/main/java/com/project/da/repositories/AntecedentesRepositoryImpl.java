package com.project.da.repositories;

import java.util.List;

//import com.project.da.interfaces.AntecedentesRepository;
import com.project.da.interfaces.BaseRepository;
import com.project.da.models.independiente.Antecedentes;

public class AntecedentesRepositoryImpl implements BaseRepository<Antecedentes> {

	@Override
	public List<Antecedentes> findAll() {
		throw new UnsupportedOperationException("Unimplemented method 'findAll'");
	}

	@Override
	public Antecedentes findById(int id) {
		throw new UnsupportedOperationException("Unimplemented method 'findById'");
	}

	@Override
	public boolean save(Antecedentes antecedentes) {
		throw new UnsupportedOperationException("Unimplemented method 'save'");
	}

}
