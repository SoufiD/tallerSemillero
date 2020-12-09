package com.clearminds.sdi.servicios;


import com.clearminds.sdi.dtos.Estudiante;
import com.clearminds.sdi.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase{
	public void insertarEstudiante(Estudiante est) throws BDDException{
		abrirConexion();
		System.out.println("Insertando estudiante: "+est);
		cerrarConexion();
	}
}
