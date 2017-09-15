package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Leer linea a linea el fichero "data/personas.txt" y mostrar por pantalla.<br>
 * Contar el total de personas leidas.
 * 
 * 
 * @author ur00
 *
 */
public class ListarPersonas {

	public static void main(String[] args) {
		
		int cont = 0;
		FileReader fr = null;		//Lector de ficheros de caracteres
		BufferedReader br = null;	//buffer para mejorar lectura del fichero
		final String PATH_FICHERO = "C:\\Desarrollo\\workspace\\libroJava\\data\\personas.txt";
		
		try {
			fr = new FileReader(PATH_FICHERO);
			br = new BufferedReader(fr);
			String linea = "";
			while((linea = br.readLine() ) != null ) {
				System.out.println(linea);
				cont++;
			}
			System.out.println("---------------------------------");
			System.out.println( cont + "lineas leidas");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
