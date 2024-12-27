package com.project.da.test.pruebas_consola.modulos.menu_opciones;

import java.io.IOException;
import java.sql.Date;
import java.util.Scanner;

import com.project.da.models.independiente.Antecedentes;
import com.project.da.models.principal.FichaMedica;
import com.project.da.models.principal.Paciente;
import com.project.da.test.pruebas_consola.logica.GestionFichaMedica;
import com.project.da.test.pruebas_consola.logica.GestionPaciente;
import com.project.da.utils.independiente.IndependienteObtenerTodos;

@SuppressWarnings("unused")
public class MenuGestionFichaMedica {

	public Scanner scanner = new Scanner(System.in);

	public void gestionFichaMedica() {
		while (true) {
			System.out.println("--Gestion de ficha medica--");
			System.out.println("1. Buscar");
			System.out.println("2. Crear");
			System.out.println("3. Actualizar");
			System.out.println("4. Eliminar");
			System.out.println("5. Volver al menú principal");
			System.out.print("Escriba una opción: ");
			String opcion = scanner.nextLine();

			switch (opcion) {
				case "1":
					buscarFichaMedica();
					break;
				case "2":
					limpiarPantalla();
					crearFichaMedica();
					break;
				case "3":
					actualizarFichaMedica();
					break;
				case "4":
					eliminarFichaMedica();
					break;
				case "5":
					limpiarPantalla();
					return;
				default:
					System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

	public void buscarFichaMedica() {
		System.out.println("--Buscar---");
		System.out.print("Ingrese el número de cédula: ");
		String cedula = scanner.nextLine();
		// Aquí iría la lógica para buscar la ficha médica
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();
	}

	public void crearFichaMedica() {
		System.out.println("--Crear---");

		System.out.print("Ingrese el número de cédula: ");
		String cedula = scanner.nextLine();

		System.out.print("Ingrese los nombres: ");
		String nombres = scanner.nextLine();

		System.out.print("Ingrese los apellidos: ");
		String apellidos = scanner.nextLine();

		System.out.print("Ingrese el grupo sanguíneo: ");
		String tiposangre = scanner.nextLine();

		System.out.print("Ingrese el teléfono: ");
		String telefono = scanner.nextLine();

		System.out.print("Ingrese el email: ");
		String email = scanner.nextLine();

		System.out.print("Ingrese el género: ");
		String genero = scanner.nextLine();

		// !Antecedentes
		cargarAntecedentes();
		System.out.print("Ingrese antecedente (ID): ");
		int id = scanner.nextInt();

		GestionFichaMedica gfm = new GestionFichaMedica();
		GestionPaciente gp = new GestionPaciente();

		IndependienteObtenerTodos idto = new IndependienteObtenerTodos();
		Paciente paciente = new Paciente(cedula, nombres, apellidos, tiposangre, telefono, email, genero);
		FichaMedica fichaMedica = new FichaMedica(null, new Date(System.currentTimeMillis()),
				idto.obtenerAntecedentesPorId(id));

		// creando paciente primero y despues ficha medica en la base de datos
		int idGenerado = gp.guardarPaciente(paciente);
		Paciente pacienteGenerado = gp.obtenerPacientePorId(idGenerado);
		fichaMedica.setPaciente(pacienteGenerado);
		gfm.crearFichaMedica(fichaMedica);
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();
	}

	public void cargarAntecedentes() {
		System.out.println("--Antecedentes--");
		IndependienteObtenerTodos idp = new IndependienteObtenerTodos();
		for (Antecedentes a : idp.obtenerPocosAntecedentes()) {
			System.out.println("Id: " + a.getId() + " Tipo: " + a.getDescripcion() + " Descripcion: " + a.getDescripcion());
		}
	}

	public void actualizarFichaMedica() {
		System.out.println("--Actualizar---");
		System.out.print("Ingrese el número de cédula: ");
		String cedula = scanner.nextLine();
		// Aquí iría la lógica para actualizar la ficha médica
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();
	}

	public void eliminarFichaMedica() {
		System.out.println("--Eliminar---");
		System.out.print("Ingrese el número de cédula: ");
		String cedula = scanner.nextLine();
		// Aquí iría la lógica para eliminar la ficha médica
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();
	}

	public static void limpiarPantalla() {
		String os = System.getProperty("os.name").toLowerCase();
		try {
			if (os.contains("win")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch (IOException | InterruptedException ex) {
			System.err.println("Error al limpiar la pantalla: " + ex.getMessage());
		}
	}

}
