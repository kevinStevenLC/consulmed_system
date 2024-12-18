package com.project.da.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConexion {

	public Connection EstablecerConexion(String db, String user, String pass, String proveedor) {
		String url = null;

		switch (proveedor.toLowerCase()) {
			case "mysql":
				url = "jdbc:mysql://localhost:3306/" + db;
				break;
			case "postgresql":
				url = "jdbc:postgresql://localhost:5432/" + db;
				break;
			default:
				System.out.println("Ingresa un proveedor correcto.");
				return null;
		}

		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexion Establecida.");
			return conn;
		} catch (SQLException sqlE) {
			System.err.println("Error de conexion: " + sqlE.getMessage());
			Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, sqlE);
			return null;
		}
	}

	// prueba
	public static void main(String[] args) {
		DbConexion db_conexion = new DbConexion();
		db_conexion.EstablecerConexion("cualquiera_aa", "root", "123456", "mysql");
	}

}