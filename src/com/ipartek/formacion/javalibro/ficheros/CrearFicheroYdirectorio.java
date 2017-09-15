package com.ipartek.formacion.javalibro.ficheros;

import java.io.File;
import java.util.Scanner;

/**
 * Pide por pantalla: 
 *    <ol>
 *        <li>Nombre de un directorio</li>
 *        <li>Nombre fichero.txt</li>
 *        <li>Palabras a guardar dentro del fichero.txt</li>
 *    </ol>    
 *    
 * Crea la carpeta en C:   
 *    
 * @author ur00
 *
 */
public class CrearFicheroYdirectorio {
	
	
	public static void main(String[] args) {      
	      
		//donde
		String PATH = "C:\\Desarrollo";
		File f = null;
		boolean boolDir = false;
		String nomDir = "";
		String nomFichero;
		String contenido;
	    Scanner sc = null;
	    File[] ficheros = null; //null pointerException con File[] ficheros = f.listFiles();
	    
	    try {
	    	
	    	sc = new Scanner(System.in);
	    	
	    	System.out.println("¿En que directorio quiere crear la carpeta? (Como ejemplo.: " + PATH +
	    			  " )");
	    	PATH = sc.nextLine();
	    	
	    	  // returns pathnames for files and directory
	    	  f = new File(PATH); //directorio supong
	    	  ficheros = f.listFiles();
	    	do {
	    	
		    	for ( File fichero : ficheros ) {
		  			System.out.println( fichero.getName());   
		  		}
	  		
		    	System.out.println("Indique el nombre de la carpeta que desea crear en " + PATH);
	    	  
		    	nomDir = sc.nextLine();
	    	//f exist();
	    	} while( nomDir.equals("")	/*nomDir.exist() = true*/); 
	    	
	    	
	         // create
	         boolDir = f.mkdirs();
	         
	         // print
	         System.out.print("Directory created?: "+ boolDir + ", en " + f.getAbsolutePath());
	         
	         
	         //crear archivo y escribir en él (x medio del user)
	         
	         
	      } catch(Exception e) {
	    	  e.printStackTrace();
	      } finally {
	    	  sc.close();
	    	  /*
	    	  fw.close();
	    	  bw.close();
	    	  fr.close();
	    	  br.clos();
	    	  */
	      }
	      
	      
	   }
	//nombre carpeta
	//nombre fichero
	//incluir texto
	
	

}
