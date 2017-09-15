package com.ipartek.formacion.javalibro.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Descomprime el fichero "data/buscatesoro.rar" donde quieras y recorre forma
 * recursiva los ficheros, hasta encontrar dentro de un .txt la palabra
 * "osobuko".<br>
 * Muestra por pantalla la ruta del fichero que contiene la palabra a buscar.
 * 
 * @author ur00
 *
 */
public class BuscarPalabra {
	// buscatesoro
	public static void main(String[] args) {
		File f = new File("C:\\Desarrollo\\");
		buscarPalabra(f, "osobuko");

	}

	public static void buscarPalabra(File f, String busqueda) {

		//
		FileReader fr = null;
		BufferedReader br = null;
		File[] ficheros = f.listFiles();
		
		for (File fichero : ficheros) {
			
				if (fichero.isDirectory()) {	// es directorio?	
					buscarPalabra(fichero, busqueda);
			} else {
				
				//buscar palabra
				try {
					
					fr = new FileReader(fichero);
					br = new BufferedReader(fr);
					String linea = "";
					//leer linea a linea todo el fichero de texto
					while ( (linea = br.readLine() ) != null ) {
						if ( linea.indexOf(busqueda) != -1 ){
							System.out.println(""+ busqueda);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
					
				} finally {	//
					try {
						fr.close();
						br.close();
						
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}
				
		}
	}

}
