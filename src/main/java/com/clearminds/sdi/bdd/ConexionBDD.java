package com.clearminds.sdi.bdd;

import java.io.*;
import java.util.*;
import java.sql.*;

public class ConexionBDD {
	
	
	
	public static String leerPropiedad(String propiedad){
		Properties p = new Properties();
		String s=null;
		try {
			p.load(new FileReader("conexion.properties"));
			s = p.getProperty(propiedad);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return s;
	}
}
