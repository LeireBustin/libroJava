package com.ipartek.formacion.javalibro.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ipartek.formacion.javalibro.pojo.Pelicula;

public class LeerPeliculasXML {

	public static void main(String[] args) {
		
		final String PELICULAS_XML = "data\\peliculas.xml";
		ArrayList<Pelicula> peliculas = null;

		//public static void main(String[] args) {

			peliculas = new ArrayList<Pelicula>();

			System.out.println("Listado peliculas");
			System.out.println("----------------------------");
			
			
			// parsear fichero XML
			try {
				File file = new File(PELICULAS_XML);
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = factory.newDocumentBuilder();
				Document doc = dBuilder.parse(file);
				doc.getDocumentElement().normalize();
				// System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
				
				NodeList nPeliculas = doc.getElementsByTagName("pelicula"); //cogemos todas las peliculas con el nombre del TAG (3 en este caso)
				Pelicula p = null;										//inicializamos las variables fuera del while
				Element element = null;			
				for (int i = 0; i < nPeliculas.getLength(); i++ ) {
					
					element = (Element)nPeliculas.item(i);			//castear nodo a un elemento
					
					
					String Tipo = element.getAttribute("tipo");
					String pAño = element.getAttribute("año");
					
					String titulo = element.getElementsByTagName("titulo")
	        				.item(0)
	        				.getTextContent();
					String guionista = element.getElementsByTagName("guionista")
							.item(0)
							.getTextContent();
					String productor = element.getElementsByTagName("productor")
							.item(0)
							.getTextContent();
					String director = element.getElementsByTagName("director")
							.item(0)
							.getTextContent();
					String actor = element.getElementsByTagName("actor")
							.item(0)
							.getTextContent();
					String comentarios = element.getElementsByTagName("comentarios")
							.item(0)
							.getTextContent();
					
											//:coge el dato q contenga esa etiqueta
							
				p = new Pelicula(titulo, guionista, productor, director, actor, comentarios);
				p.setTipo(Tipo);	//tipo pelicula
				p.setAño( Integer.parseInt(pAño));	
		        peliculas.add(p);
					
				}
				System.out.println("----------------------------");

			} catch (Exception e) {
				e.printStackTrace();

			}

			
			
			// mostrar cancs x pantalla
			for (Pelicula p : peliculas) {
				System.out.println("Pelicula ");
				System.out.println("genero " + p.getTipo());
				System.out.println("año " + p.getAño());
				System.out.println("    Titulo: " + p.getTitulo());
				System.out.println("    Productor: " + p.getProductor());
				System.out.println("    Director: " + p.getDirector());
				System.out.println("    Guionista: " + p.getGuionista());
				System.out.println("    Actor: " + p.getActor());
				
				System.out.println("");	

			}
			
			
			

		}

	}


