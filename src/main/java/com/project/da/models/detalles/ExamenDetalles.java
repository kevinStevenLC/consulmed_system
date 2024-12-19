package com.project.da.models.detalles;

import com.project.da.models.independiente.ExamenAdicional;
import com.project.da.models.independiente.ExamenFisico;

public class ExamenDetalles {

	int id;
	ExamenAdicional examenAdicional;
	ExamenFisico examenFisico;

	public ExamenDetalles(int id, ExamenAdicional examenAdicional, ExamenFisico examenFisico) {
		this.id = id;
		this.examenAdicional = examenAdicional;
		this.examenFisico = examenFisico;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ExamenAdicional getExamenAdicional() {
		return this.examenAdicional;
	}

	public void setExamenAdicional(ExamenAdicional examenAdicional) {
		this.examenAdicional = examenAdicional;
	}

	public ExamenFisico getExamenFisico() {
		return this.examenFisico;
	}

	public void setExamenFisico(ExamenFisico examenFisico) {
		this.examenFisico = examenFisico;
	}

}
