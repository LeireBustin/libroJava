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

import com.ipartek.formacion.javalibro.pojo.Persona;

public class ValidacionPersona2_fail {

		static final String PATH_TXT_A_LEER = "data\\personas.txt";	//con extension .txt incluida
		static final String PATH_TXT_A_ESCRIBIR = "data\\personasOK.txt";
		static final String PATH_TXT_A_ESCRIBIR2 = "data\\personasERROR.txt";
		static ArrayList<Persona> aPersonas = null;
		static ArrayList<String> aPersonasErroneas = null;
		
		public static void main(String[] args) {
			
			FileReader fr = null;
			BufferedReader br = null;
			aPersonas = new ArrayList<Persona>();			//PERSONAS DATOS CORRECTOS
			aPersonasErroneas = new ArrayList<String>();	//PERSONAS DATOS INCORRECTOS
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
					String linea = "";
					int cont = 0;
				
					
					// crear en fichero	
					
					while((linea = br.readLine() ) != null ) {
						String [] cadenas = linea.split(",");	//(array)p.length
						//p = linea.split(",", 7);	//(array)p.length
						boolean entradaErronea = false;		//(eliminar return boolean de metodosPersona y hacerlos void)
						if( cadenas.length == 7) {
							Persona p = new Persona();
							/*
							p.setNombre(cadenas[0]);
							p.setApellido1(cadenas[1]);
							p.setApellido2(cadenas[2]);
							p.setEdad(Integer.parseInt(cadenas[3]));
							p.setEmail(cadenas[4]);
							p.setDni(cadenas[5]);
							p.setRol(cadenas[6]);
							//if else
							*/
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
								aPersonas.add(p);
							}
							cont++;
						
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
		
				
					
				
				
				//TODO PASAR LOS DATOS DE LOS ARRAY PERSONAS (correctos e incorrectos) AL TXTs:
				

				try {
					fw = new FileWriter(PATH_TXT_A_ESCRIBIR);
					bw = new BufferedWriter(fw);
					
					bw.write(aPersonas.toString());
					bw.flush();
					
					
				} catch (IOException e) {
					System.out.println("No se puede escribir en el fichero1");
					e.printStackTrace();
				}finally {
					
					try {
						bw.close();
						fw.close();
					} catch (IOException e) {
						System.out.println("No se puede cerrar el Buffer y Writer1");
						e.printStackTrace();
					}
					
				}
				
				try {
					fw2 = new FileWriter(PATH_TXT_A_ESCRIBIR2);
					bw2 = new BufferedWriter(fw2);
					
					bw2.write(aPersonasErroneas.toString());
					bw2.flush();
					
					
				} catch (IOException e) {
					System.out.println("No se puede escribir en el fichero2");
					e.printStackTrace();
				}finally {
					
					try {
						bw2.close();
						fw.close();
					} catch (IOException e) {
						System.out.println("No se puede cerrar el Buffer y Writer2");
						e.printStackTrace();
					}
					
				}
				
				
				
				

			
		
		}

	}


