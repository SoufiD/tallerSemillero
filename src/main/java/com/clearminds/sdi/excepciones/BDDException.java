package com.clearminds.sdi.excepciones;

import java.sql.SQLException;

public class BDDException extends Exception {

	public BDDException(String mensaje) {
		super(mensaje);
	}
}
