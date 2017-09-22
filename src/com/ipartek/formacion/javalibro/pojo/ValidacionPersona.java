package com.ipartek.formacion.javalibro.pojo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.ipartek.formacion.javalibro.pojo.Persona;

public class ValidacionPersona {

		static final String PATH_TXT_A_LEER = "data\\personas.txt";	//con extension .txt incluida
		static ArrayList<Persona> aPersonas = null;
		
		public static void main(String[] args) {
			
			FileReader fr = null;
			BufferedReader br = null;
			aPersonas = new ArrayList<Persona>();
			Persona p = null;
			FileWriter fw = null;
			BufferedWriter bw = null;
			FileWriter fw2 = null;
			BufferedWriter bw2 = null;
			
			
			

				
				// TODO conseguir ArrayList<Persona> a partir del fichero de texto
				//LEER .TXT Y GUARDAR DATOS EN ARRAY
				try {
					p = new Persona();
					fr = new FileReader(PATH_TXT_A_LEER);
					br = new BufferedReader(fr);
					String linea = "";
					int cont = 0;
				// TODO un bucle para todas las personas
					
					// crear en fichero	
					
					while((linea = br.readLine() ) != null ) {
						String [] cadenas = linea.split(",");	//(array)p.length
						//p = linea.split(",", 7);	//(array)p.length
						if( cadenas.length == 7) {
							p.setNombre(cadenas[0]);
							p.setApellido1(cadenas[1]);
							p.setApellido2(cadenas[2]);
							p.setEdad(Integer.parseInt(cadenas[3]));
							p.setEmail(cadenas[4]);
							p.setDni(cadenas[5]);
							p.setRol(cadenas[6]);
						
							//else if {
								
							}
							
						
						
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
				
				
				
				
				//TODO VOLVAR LOS DATOS DEL ARRAY DE PERSONAS AL XML
				

				
				
				
				
				
				

			
		}

	}


