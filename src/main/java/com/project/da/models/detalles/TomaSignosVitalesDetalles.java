package com.project.da.models.detalles;

import com.project.da.models.independiente.SignoVital;
import com.project.da.models.principal.TomaSignosVitales;

public class TomaSignosVitalesDetalles {

	int id;
	TomaSignosVitales tomasSignosVitales;
	SignoVital signoVital;
	Double valor;
	String observaciones;

	// |id |id_signosVitales| idSignoVital|

	public TomaSignosVitalesDetalles(int id, TomaSignosVitales tomasSignosVitales, SignoVital signoVital, Double valor,
			String observaciones) {
		this.id = id;
		this.tomasSignosVitales = tomasSignosVitales;
		this.signoVital = signoVital;
		this.valor = valor;
		this.observaciones = observaciones;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TomaSignosVitales getTomasSignosVitales() {
		return this.tomasSignosVitales;
	}

	public void setTomasSignosVitales(TomaSignosVitales tomasSignosVitales) {
		this.tomasSignosVitales = tomasSignosVitales;
	}

	public SignoVital getSignoVital() {
		return this.signoVital;
	}

	public void setSignoVital(SignoVital signoVital) {
		this.signoVital = signoVital;
	}

	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
