package com.project.da.services;

import java.util.List;

import com.project.da.interfaces.BaseRepository;
import com.project.da.models.independiente.SignoVital;

public class SignoVitalService {

	private final BaseRepository<SignoVital> signoVitalRepository;

	public SignoVitalService(BaseRepository<SignoVital> signoVitalRepository) {
		this.signoVitalRepository = signoVitalRepository;
	}

	public List<SignoVital> obtenerTodosSignoVital() {
		return this.signoVitalRepository.findAll();
	}

	public SignoVital obtenerSignoVitalById(int id) {
		return this.signoVitalRepository.findById(id);
	}

	public boolean guardarSignoVital(SignoVital signoVital) {
		return this.signoVitalRepository.save(signoVital);
	}

}
