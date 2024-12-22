package com.project.da.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConexion {

	// Constantes de la base de datos
	private static final String BD = "consulmed_db";
	private static final String URL = "jdbc:mysql://localhost:6603";
	private static final String USER = "root";
	private static final String PASS = "123456";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	// Conexión única
	private static Connection conn;

	// Constructor privado para evitar instanciación
	private DbConexion() {
	}

	public static Connection getcCnexion_db() throws SQLException {
		if (conn == null || conn.isClosed()) {
			try {
				// Cargar controlador JDBC
				Class.forName(DRIVER);
				// Establecer conexión
				conn = DriverManager.getConnection(URL + "/" + BD, USER, PASS);
				System.out.println("Conexion Establecida.");
			} catch (ClassNotFoundException | SQLException sqlE) {
				System.err.println("Error de conexion: " + sqlE.getMessage());
				Logger.getLogger(DbConexion.class.getName()).log(Level.SEVERE, null, sqlE);
				return null;
			}
		}
		return conn;
	}

	public static void main(String[] args) throws SQLException, InterruptedException {
		// Probar la conexión a la base de datos
		Connection db_conexion = DbConexion.getcCnexion_db();
		Thread.sleep(3000);
		db_conexion.close();
	}

}