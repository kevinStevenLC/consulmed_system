package com.project.da.models.principal;

public class Paciente {
	int id;
	String cedula;
	String nombres;
	String apellidos;
	String tipoSangre;
	String telefono;
	String email;
	String genero;

	public Paciente(String cedula, String nombres, String apellidos, String tipoSangre, String telefono, String email,
			String genero) {
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoSangre = tipoSangre;
		this.telefono = telefono;
		this.email = email;
		this.genero = genero;
	}

	public Paciente() {
	}

	public int getId() {
		return this.id;
	}

	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
