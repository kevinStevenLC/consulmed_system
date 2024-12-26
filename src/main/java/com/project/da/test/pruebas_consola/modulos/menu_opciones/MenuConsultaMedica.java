package com.project.da.test.pruebas_consola.modulos.menu_opciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

@SuppressWarnings("unused")
public class MenuConsultaMedica {

	MenuExamenesMedicos menuExamenesMedicos;

	public MenuConsultaMedica() {
		this.menuExamenesMedicos = new MenuExamenesMedicos();
	}

	public Scanner scanner = new Scanner(System.in);

	public void consultaMedica() {
		while (true) {
			System.out.println("--Consulta Medica--");
			System.out.println("1. Toma signos Vitales");
			System.out.println("2. Volver al menú principal");
			System.out.print("Escriba una opción: ");
			String opcion = scanner.nextLine();

			switch (opcion) {
				case "1":
					evaluacionPaciente();
					break;
				case "2":
					return;
				default:
					System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

	public void evaluacionPaciente() {
		while (true) {
			System.out.println("--Consulta Medica--");
			System.out.print("Ingrese la Identificacion del Paciente: ");
			String cedula = scanner.nextLine();
			System.out.print("Presione Enter para continuar...");
			scanner.nextLine();
			tomaSignosVitales();
		}
	}

	public void mostrarFichaMedica() {

	}

	public void tomaSignosVitales() {
		ArrayList<String> signosVitalesSeleccionados = new ArrayList<>();
		// Aquí podrías mostrar los datos reales de la ficha médica
		mostrarFichaMedica();

		System.out.println("--Toma signos Vitales--");
		System.out.println("Seleccione 5 de las siguientes opciones (ejemplo):");
		HashSet<Integer> seleccionados = new HashSet<>(); // Para evitar duplicados

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". Signo Vital " + i);
		}

		while (signosVitalesSeleccionados.size() < 5) {
			System.out.print("Seleccione un signo vital (1-10): ");
			int seleccion = Integer.parseInt(scanner.nextLine());

			if (seleccion >= 1 && seleccion <= 10) {
				if (!seleccionados.contains(seleccion)) {
					seleccionados.add(seleccion);
					signosVitalesSeleccionados.add("Signo Vital " + seleccion);
				} else {
					System.out.println("Ya ha seleccionado este signo vital. Por favor, elija otro.");
				}
			} else {
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
		// Aquí iría la lógica para seleccionar los signos vitales
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();

		// Opciones de exámenes
		System.out.println("--Examenes--");
		System.out.println("1. Examenes fisicos");
		System.out.println("2. Examenes adicionales");
		System.out.print("Opción: ");
		String opcion = scanner.nextLine();

		switch (opcion) {
			case "1":
				menuExamenesMedicos.examenesFisicos();
				break;
			case "2":
				menuExamenesMedicos.examenesAdicionales();
				break;
			default:
				System.out.println("Opción no válida. Regresando al menú de consulta médica...");
				consultaMedica();
		}
	}

}
