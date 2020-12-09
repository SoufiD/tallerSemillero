package com.clearminds.sdi.bdd.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.sdi.bdd.ConexionBDD;
import com.clearminds.sdi.excepciones.BDDException;

public class TestConexion {
	public static void main(String[] args) {
		try{
			Connection conexion=ConexionBDD.obtenerConexion();
			if(conexion!=null){
				System.out.println("Conexión exitosa");
			}
		}catch(BDDException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
	}
}
