package com.clearminds.sdi.servicios;

import java.sql.*;

import com.clearminds.sdi.dtos.Estudiante;
import com.clearminds.sdi.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	public void insertarEstudiante(Estudiante est) throws BDDException {
		Statement stm = null;

		abrirConexion();
		System.out.println("Insertando estudiante: " + est);

		try {
			stm = getConexion().createStatement();
			String sql = "insert into estudiantes(nombre,apellido)values('" + est.getNombre() + "','"
					+ est.getApellido() + "')";
			System.out.println("Script: " + sql);
			stm.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}
}
