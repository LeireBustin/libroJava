package com.ipartek.formacion.javalibro.pojo;
/**
 * Genera dos txt (uno con el listado de las personas con los datos correctos;
 *  el otro con las de las personas con datos incorrectos) 
 *  a partir de la lectura de un txt personas.txt
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.pojo.Persona;

public class ValidacionPersona {

		static final String PATH_TXT_A_LEER = "data\\personas.txt";	//con extension .txt incluida
		static final String PATH_TXT_A_ESCRIBIR = "data\\personasOK.txt";
		static final String PATH_TXT_A_ESCRIBIR2 = "data\\personasERROR.txt";
		static ArrayList<Persona> aPersonasOK = null;
		static ArrayList<String> aPersonasErroneas = null;
		
		public static void main(String[] args) {
			
			FileReader fr = null;
			BufferedReader br = null;
			aPersonasOK = new ArrayList<Persona>();			//ARRAY de objetos PERSONA CON DATOS CORRECTOS
			aPersonasErroneas = new ArrayList<String>();	//ARRAY de Strings: PERSONAS CON DATOS INCORRECTOS
			//Persona p = null;
			FileWriter fw = null;
			BufferedWriter bw = null;
			FileWriter fw2 = null;
			BufferedWriter bw2 = null;
			
			
				// TODO conseguir ArrayList<Persona> a partir del fichero de texto
				//LEER .TXT Y GUARDAR DATOS EN ARRAY
				try {
					//p = new Persona();
					fr = new FileReader(PATH_TXT_A_LEER);
					br = new BufferedReader(fr);
					fw = new FileWriter(PATH_TXT_A_ESCRIBIR);
					bw = new BufferedWriter(fw);
					fw2 = new FileWriter(PATH_TXT_A_ESCRIBIR2);
					bw2 = new BufferedWriter(fw2);
					String linea = "";
					int cont = 0;
				
					
					// Leer y escribir las lineas de las personas correctas o incorrectas en los ficheros
					/*PASAR LOS DATOS DE LOS ARRAY PERSONAS (correctos e incorrectos) AL TXTs:*/
					
					while((linea = br.readLine() ) != null ) {
						String [] cadenas = linea.split(",");	//(array)p.length
						//p = linea.split(",", 7);	//(array)p.length
						/* boolean entradaErronea = false;		//(eliminar return boolean de metodosPersona y hacerlos void) */
						
						try {
							//if else
							if( cadenas.length == 7) {
								
								Persona p = null;
								//el constructor de la clase Persona tiene este orden:
								p = new Persona(cadenas[0], cadenas[1], cadenas[2], cadenas[4], cadenas[5], cadenas[6], Integer.parseInt(cadenas[3]));
								aPersonasOK.add(p);
								bw.write(linea);
								bw.flush();
								bw.newLine();
		
								/*
								Persona p = new Persona();
								p.setNombre(cadenas[0]);
								p.setApellido1(cadenas[1]);
								p.setApellido2(cadenas[2]);
								try {
									// entradaErronea = p.setEdad(Integer.parseInt(cadenas[3]));
								} catch (Exception e) {
									continue;
								}
								try {
									// entradaErronea = p.setEmail(cadenas[4]);
									
								} catch (Exception e) {
								}
								try {
									// entradaErronea = p.setDni(cadenas[5]);
									
								} catch (Exception e) {
									
								}
								p.setRol(cadenas[6]);
								// entradaErronea = false;
								if( p.getEdad() == 0 || p.getEmail().equals("")|| p.getEmail().equals(null)|| p.getEmail() == null || p.getDni().equals("")|| p.getDni().equals(null)|| p.getDni() == null) {
									// entradaErronea = true;
								}
								
								if(entradaErronea == true) {
									aPersonasErroneas.add(linea);
								}else if(entradaErronea == false) {
									aPersonasOK.add(p);
								}
								*/
								
							} 
							
						}catch(PersonaException e) {
							aPersonasErroneas.add(linea);
							//bw2.write(aPersonasErroneas.toString());
							bw2.write(linea);
							bw2.flush();
							bw2.newLine();
							
							e.printStackTrace();
							e.getMessage();
							
						}finally {
							cont++;
						}
						
					}
						System.out.println("---------------------------------");
						System.out.println( cont + "lineas leidas, " + aPersonasOK.size() + " personas OK y " + aPersonasErroneas.size() + " personas con alg�n ERROR.");
					
						
						
				}catch (IOException e) {
					System.out.println("No se puede escribir en el fichero");
					e.printStackTrace();
				} finally {
					try {
						fr.close();
						br.close();
						bw.close();
						fw.close();
						bw2.close();
						fw2.close();
					} catch (IOException e) {
						System.out.println("No se puede cerrar el Buffer y Writer");
						e.printStackTrace();
					}
					
				}
		
				
					
				
				
				

			
		
		}

	}


