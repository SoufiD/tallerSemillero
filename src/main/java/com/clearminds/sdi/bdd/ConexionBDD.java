package com.clearminds.sdi.bdd;

import java.io.*;
import java.util.*;

import com.clearminds.sdi.excepciones.BDDException;

import java.sql.*;

public class ConexionBDD {

	public static Connection obtenerConexion() throws BDDException {
		String user = leerPropiedad("usuario");
		String pass = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");
		Connection con = null;
		try {
			con = DriverManager.getConnection(url + ";user=" + user + ";password=" + pass + ";");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new BDDException("No se pudo conectar a la base de datos");
		}
		if(con!=null){
			return con;
		}else{
			throw new BDDException("No se pudo conectar a la base de datos");
		}
	}

	public static String leerPropiedad(String propiedad) {
		Properties p = new Properties();
		String s = null;
		File f=new File("conexion.properties");
		System.out.println("ruta:"+f.getAbsoluteFile());

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
