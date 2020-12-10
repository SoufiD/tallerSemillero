package com.clearminds.sdi.bdd.test;

import com.clearminds.sdi.dtos.Estudiante;
import com.clearminds.sdi.excepciones.BDDException;
import com.clearminds.sdi.servicios.DateUtil;
import com.clearminds.sdi.servicios.ServicioEstudiante;

public class TestServicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicioEstudiante srvest = new ServicioEstudiante();
		try {
			srvest.insertarEstudiante(new Estudiante("Sofía", "Díaz"));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
