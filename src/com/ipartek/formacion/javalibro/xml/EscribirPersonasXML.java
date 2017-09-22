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

public class EscribirPersonasXML {

	
	static final String PATH_TXT_A_LEER = "data\\personas.txt";	//con extension .txt incluida
	static ArrayList<Persona> aPersonas = null;
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		aPersonas = new ArrayList<Persona>();
		Persona p = null;
		
		try {
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.newDocument();

				// crear nodo raiz
				Element rootElement = doc.createElement("personas");
			doc.appendChild(rootElement);

			
			// TODO conseguir ArrayList<Persona> a partir del fichero de texto
			//LEER .TXT Y GUARDAR DATOS EN ARRAY
			try {
				p = new Persona();
				fr = new FileReader(PATH_TXT_A_LEER);
				br = new BufferedReader(fr);
				String linea = "";
				int cont = 0;
			// TODO un bucle para todas las personas
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
					}
					
					
					
					aPersonas.add(cont , p);
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
			
			
			
			
			//TODO VOLVAR LOS DATOS DEL ARRAY DE PERSONAS AL XML
			

			// Añadir Elementos Persona al nodo raiz
			Element ePersona = doc.createElement("persona");
				Element eNombre = doc.createElement("nombre");
				eNombre.setTextContent("Ted");
				// TODO resto de Campos o Elementos
				
				
				ePersona.appendChild(eNombre);
			rootElement.appendChild(ePersona);

			
			
			
				// guardar en fichero
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("data\\personas.xml"));
			transformer.transform(source, result);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
