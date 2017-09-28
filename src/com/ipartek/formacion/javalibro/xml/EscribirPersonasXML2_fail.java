package com.ipartek.formacion.javalibro.xml;
/**
 * Ejercicio para convertir un data/personas.txt a data/personas.xml<br>
 * TXT a XML
 * 
 * estructura del TXT:<br>
 * 
 * Ted,Upton,Sant Andreu De La Barca,8,tedfupton@mailinator.com,12277015Y,TRABAJADOR
 *   
 * estructura del xml:<br>
 * 
 * <personas>
 * 		<persona>
 * 				<nombre>Ted</nombre>
 *              <apellido1>Upton</apellido1>
 *              <apellido2>Sant Andreu De La Barca</apellido2>
 *              <edad>8</edad>
 *              <email>tedfupton@mailinator.com</email>
 *              <dni>12277015Y</dni>
 *              <rol>TRABAJADOR</rol>
 * 		</persona>
 * 		<persona>
 * 			...
 *      </persona>
 * </personas>
 * 
 * 
 * @author Administrador
 *@see https://www.tutorialspoint.com/java_xml/java_dom_create_document.htm
 */

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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class EscribirPersonasXML2_fail {

	static final String PATH_TXT_A_LEER = "data\\personasPrueba100.txt";
	// static final String PATH_TXT_A_LEER = "data\\personas.txt"; //con extension .txt incluida
	static ArrayList<Persona> aPersonas = null;
	static ArrayList<String[]> aPersonasTodas = null;		//para incluir los elementos erroneos que no puedan cumplir las condiciones de un objeto de Clase Persona (edad>18, email@. y dni completos)

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;
		aPersonas = new ArrayList<Persona>();
		aPersonasTodas = new ArrayList<String[]>();
		// Persona p = null;

		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.newDocument();

			// crear nodo raiz
			Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);

			// TODO conseguir ArrayList<Persona> a partir del fichero de texto
			// LEER .TXT Y GUARDAR DATOS EN ARRAY
			try {
				// p = new Persona();
				fr = new FileReader(PATH_TXT_A_LEER);
				br = new BufferedReader(fr);
				String linea = "";
				int cont = 0;
				
				// TODO un bucle para todas las personas
				while ((linea = br.readLine()) != null) {
					String[] cadenas = linea.split(","); // (array)p.length
					// p = linea.split(",", 7); //(array)p.length
					boolean entradaErronea = false;
					if (cadenas.length == 7) {
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
						if(entradaErronea == true) {
							aPersonasTodas.add(cont, cadenas);
							//aPersonasErroneas.add(cadenas);
						}else if(entradaErronea == false) {
							aPersonas.add(cont, p);
							aPersonasTodas.add(cont, cadenas);
						}
						

					} else {
						System.out.println(
								"Num. campos de la persona: " + cadenas.length + "!=7. Falta campo en cont: " + cont);
						System.out.println(linea);
					}
					System.out.println("Num. elementos array: " + aPersonas.size());
					cont++;
				}
				System.out.println("---------------------------------");
				System.out.println(cont + "lineas leidas");

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fr.close();
					br.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			// TODO VOLVAR LOS DATOS DEL ARRAY DE PERSONAS AL XML

			/*
			 * Element ePersona = doc.createElement("persona"); Element eNombre =
			 * doc.createElement("nombre"); eNombre.setTextContent("Ted"); //TODO resto de
			 * Campos o Elementos
			 * 
			 * ePersona.appendChild(eNombre); rootElement.appendChild(ePersona);
			 */

			// TODO un bucle para todas las personas
			for (int i = 0; i < aPersonas.size(); i++) {
				// Añadir Elemento Persona al nodo raiz Personas
				Element ePersona = doc.createElement("persona");

				Element eNombre = doc.createElement("nombre");
				eNombre.setTextContent(aPersonas.get(i).getNombre());
				ePersona.appendChild(eNombre);

				Element eApellido1 = doc.createElement("apellido1");
				eApellido1.setTextContent(aPersonas.get(i).getApellido1());
				ePersona.appendChild(eApellido1);

				Element eApellido2 = doc.createElement("apellido2");
				eApellido2.setTextContent(aPersonas.get(i).getApellido2());
				ePersona.appendChild(eApellido2);

				String str = "" + aPersonas.get(i).getEdad();
				Element eEdad = doc.createElement("edad");
				eEdad.setTextContent(str);
				ePersona.appendChild(eEdad);

				Element eEmail = doc.createElement("email");
				eEmail.setTextContent(aPersonas.get(i).getEmail());
				ePersona.appendChild(eEmail);

				Element eDni = doc.createElement("dni");
				eDni.setTextContent(aPersonas.get(i).getDni());
				ePersona.appendChild(eDni);

				Element eRol = doc.createElement("email");
				eRol.setTextContent(aPersonas.get(i).getRol());
				ePersona.appendChild(eRol);

				// Añadir cierre de elemento Persona al nodo raiz
				rootElement.appendChild(ePersona);
			}

			// guardar en fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("data\\personas.xml"));
			transformer.transform(source, result);

			// Output to console for testing
			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
