package com.ipartek.formacion.javalibro.ejercicios;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * Nos conectaremos una pagina web http://www.example.com/ para descargar el codigo fuente
 * 
 * */
public class ConectarPaginaWeb {

	public static void main(String[] args) {

		final String PAGINA_WEB = "http://www.example.com/";
		URLConnection con = null; // Lector de ficheros de caracteres
		BufferedReader br = null;
		String PAGINA_WEB2 = "";

		try {

			// creamos URL
			URL url = new URL(PAGINA_WEB);

			// abrimos conexion
			con = url.openConnection();

			// crear inputStream y Buffer asociado
			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			br = new BufferedReader(isr);

			// leemos el codigo fuente linea a linea
			String linea = "";
			while ((linea = br.readLine()) != null) {

				// conseguir h1
				if (linea.indexOf("<h1>") != -1) {
					System.out.println(linea);
				}

				
				// conseguir navegar x More info... y sacar el codigo fuente de dicha pagina:
				if (linea.indexOf("<a href=") != -1) {
					System.out.println(linea);
					String[] cadenasURL = linea.split("\"");
					PAGINA_WEB2 = cadenasURL[1];
					System.out.println(PAGINA_WEB2);
				}
				
				}
			} catch (MalformedURLException e) {
					System.out.println("URL mal escrita " + PAGINA_WEB);
					e.printStackTrace();

				} catch (IOException e) {
					System.out.println("No podemos establecer conexion");
					e.printStackTrace();

				} finally {
					try {

						br.close();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
					
					
				try {
					

						// creamos URL22222
						URL url2 = new URL(PAGINA_WEB2);

						// abrimos conexion22222
						URLConnection con2 = url2.openConnection();

						// crear inputStream y Buffer asociado222222
						InputStreamReader isr2 = new InputStreamReader(con2.getInputStream());
						BufferedReader br2 = new BufferedReader(isr2);

						// leemos el codigo fuente linea a linea222222
						String linea2 = "";
						while ((linea2 = br2.readLine()) != null) {
							System.out.println(linea2);

						}

					
				} catch (MalformedURLException e) {
					System.out.println("URL mal escrita " + PAGINA_WEB2);
					e.printStackTrace();

				} catch (IOException e) {
					System.out.println("No podemos establecer conexion");
					e.printStackTrace();
				} finally {
					try {

						br.close();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		

	}
