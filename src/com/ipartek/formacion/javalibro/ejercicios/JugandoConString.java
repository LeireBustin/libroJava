package com.ipartek.formacion.javalibro.ejercicios;

public class JugandoConString {

	public static void main(String[] args) {

		String manolo = "Manolo Kabezabolo";

		// Convertir a minus
		System.out.println(manolo.toLowerCase());

		/// Convertir a MAYUS
		System.out.println(manolo.toUpperCase());

		// Mostrar num caracteres
		System.out.println("Tiene " + manolo.length() + " caracteres.");

		// Mostrar posicion de la letra "K"
		System.out.println("Posicion K" + manolo.indexOf('K'));

		// Separar en dos variables el nombre y apellido con substring
		String nombre = manolo.substring(0, 6); // Manolo
		String apellido = manolo.substring(7); // Kabezabolo
		System.out.println("Nombre= " + nombre);
		System.out.println("Apellido= " + apellido);

		/* Comparando */

		String c1 = "casa";
		String c2 = "Casa";
		// Comparar con equals y equalIgnoreCase

		System.out.println("casa != Casa con equals " + c1.equals(c2));
		System.out.println("casa == Casa con equalsIgnoreCase " + c1.equalsIgnoreCase(c2));

		/* Limpiando entradas de datos */

		String c3 = "perro";
		String c4 = "     perro    ";
		// comprobar q las 2 variables sean iguales => trim
		System.out.println("Los dos perros son iguales " + c3.equals(c4.trim()));

		String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam bibendum sed felis in consequat. Quisque pharetra magna mauris, vitae fermentum turpis dignissim eu. Nulla vitae nisi massa. Nullam enim sem, cursus nec sagittis id, fringilla ut nunc. Vivamus vitae dui nunc. Curabitur at ex justo. Nulla consequat blandit purus, sit amet facilisis lacus sodales non. Nullam consectetur tortor ut arcu placerat consectetur. Cras nunc purus, convallis et porta id, tincidunt vel erat. Donec interdum leo et diam vulputate, eleifend dapibus erat euismod. In malesuada risus nec enim semper, ac posuere ante scelerisque. Aenean non tristique nunc. Nam eu sodales orci, sit amet maximus libero. Maecenas lorem nisl, efficitur pharetra enim ac, maximus tincidunt mi.";
		// mostrar longuitud
		// contar palabras
		// contar todas las vocales
		// indicar el numero de veces que aparece 'at'

		System.out.println("------- Lorem ------------");
		System.out.println("Longitud " + lorem.length() + " chars");
		System.out.println("Palabras " + lorem.split(" ").length + " palabras");

		int contadorVocales = 0;
		char[] aVocales = lorem.toLowerCase().toCharArray();
		char vocal = 'a';
		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < aVocales.length; i++) {

			vocal = aVocales[i];

			for (int j = 0; j < vocales.length; j++) {
				if (vocales[j] == vocal) {
					contadorVocales++;
					break;
				}

			}

		}
		System.out.println("Vocales= " + contadorVocales);

		/*
		char[] aAt = lorem.toLowerCase().toCharArray();
		String at = "at";
		int numAt = 0;

		for (int i = 0; i < aAt.length; i++) {
			// if( aAt.IndexOf(at))
			// numAt ++;

		}

		// String frase = "Vemos el atardecer "

		*/

	}

}
