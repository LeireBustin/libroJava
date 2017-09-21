package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Cancion;


/**
 * Ejercicio para aprender a leer o parsear un documento .XML
 * @author ur00
 *
 */
public class LeerCancionesXML {

	static final String CANCIONES_XML = "data\\canciones.xml";
	static ArrayList<Cancion> canciones = null;

	public static void main(String[] args) {

		canciones = new ArrayList<Cancion>();

		System.out.println("Listado canciones");
		System.out.println("----------------------------");
		
		
		// parsear fichero XML
		try {
			File file = new File(CANCIONES_XML);
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
			// System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nCanciones = doc.getElementsByTagName("cancion"); //cogemos todas las canciones con el nombre del TAG (3 en este caso)
			Cancion c = null;										//inicializamos las variables fuera del while
			Element element = null;			
			for (int i = 0; i < nCanciones.getLength(); i++ ) {
				
				element = (Element)nCanciones.item(i);			//castear nodo a un elemento
				
				
				String sId = element.getAttribute("id");		//ATTRIBUTE CON 2 T-s
				
				String nombre = element.getElementsByTagName("nombre")
        														.item(0)
        														.getTextContent();
				String artista = element.getElementsByTagName("artista")
																.item(0)
																.getTextContent();
				String duracion = element.getElementsByTagName("duracion")
																.item(0)
																.getTextContent();
				
						
						//:coge el dato q contenga esa etiqueta
						
				c = new Cancion(nombre, artista, duracion);
				c.setId( Long.parseLong(sId));					//PARSEAR
	        	canciones.add(c);
				
			}
			System.out.println("----------------------------");

		} catch (Exception e) {
			e.printStackTrace();

		}

		
		
		// mostrar cancs x pantalla
		for (Cancion c : canciones) {
			System.out.println("Cancion " + c.getId());
			System.out.println("    Nombre: " + c.getNombre());
			System.out.println("    Artista: " + c.getArtista());
			System.out.println("    Duración: " + c.getDuracion());
			System.out.println("");	

		}

	}

}
