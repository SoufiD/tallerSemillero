package com.clearminds.sdi.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.sdi.bdd.ConexionBDD;
import com.clearminds.sdi.excepciones.BDDException;

public class ServicioBase {
	private Connection conexion = null;

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() throws BDDException{
		try {
			conexion.close();
			System.out.println("Conexión cerrada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new BDDException("Error al cerrar la conexion");
		}

	}
}
