package com.project.da.test.pruebas_consola.modulos.menu_opciones;

import java.util.Scanner;

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
					crearFichaMedica();
					break;
				case "3":
					actualizarFichaMedica();
					break;
				case "4":
					eliminarFichaMedica();
					break;
				case "5":
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
		// Aquí iría la lógica para crear la ficha médica
		System.out.println("Ingrese los datos del paciente (10 datos):");
		for (int i = 1; i <= 10; i++) {
			System.out.print("Dato " + i + ": ");
			String dato = scanner.nextLine();
			// Aquí podrías almacenar los datos
		}
		System.out.print("Ingrese antecedentes (solo 1): ");
		String antecedentes = scanner.nextLine();
		// Aquí podrías almacenar los antecedentes
		System.out.print("Presione Enter para continuar...");
		scanner.nextLine();
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

}
