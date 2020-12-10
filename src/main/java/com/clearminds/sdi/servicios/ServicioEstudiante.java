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
			String sql = "insert into estudiantes(nombre,apellido,edad,fecha_modificacion)values('" + est.getNombre() + "','"
					+ est.getApellido() + "'," + est.getEdad() + ",'" +DateUtil.fecha() +"')";
			System.out.println("Script: " + sql);
			stm.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}

	public void actualizarEstudiante(Estudiante est) throws BDDException {
		Statement stm = null;

		abrirConexion();
		System.out.println("Actualizando estudiante: " + est);

		try {
			stm = getConexion().createStatement();
			String sql = "update estudiantes set nombre='" + est.getNombre() + "', apellido='" + est.getApellido()
					+ "', edad=" + est.getEdad() +", fecha_modificacion='"+DateUtil.fecha()+"' where id=" + est.getId();
			System.out.println("Script: " + sql);
			stm.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}
