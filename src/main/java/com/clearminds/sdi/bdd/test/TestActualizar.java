package com.clearminds.sdi.bdd.test;

import com.clearminds.sdi.dtos.Estudiante;
import com.clearminds.sdi.excepciones.BDDException;
import com.clearminds.sdi.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvest = new ServicioEstudiante();
		try {
			srvest.actualizarEstudiante(new Estudiante("Pedro", "Navaja",25,2));;
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
