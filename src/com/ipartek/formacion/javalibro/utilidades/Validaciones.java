package com.ipartek.formacion.javalibro.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	/**
	 * Metodo para validar si un email es correcto
	 * @param email a validar
	 * @return true si es valido, false en caso contrario
	 */
	public static boolean email(String email) {
		boolean resul = false;
		if (email != null) {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
			resul = matcher.find();
		}
		return resul;
	}
	// xq public aqui? y no en metodo o funcion DNI(q es static)?

	
	/**
	 * Metodo para validar un DNI
	 * @see https://medium.com/@manuelmato/c%C3%B3mo-validar-un-dni-en-java-6d7ce7d764aa
	 * @param dni String Documento Identidad Nacional con 8 digitos y letra ( sin espacios, ni guiones)
	 * @return true si es valido, false en caso contrario
	 */
	public static boolean dni(String dni) {

		boolean resul = false;

		if (dni != null) {

			String letraMayuscula = ""; // Guardaremos la letra introducida en formato may�scula

			// Aqu� excluimos cadenas distintas a 9 caracteres que debe tener un dni y
			// tambi�n si el �ltimo caracter no es una letra
			if (dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false) {
				return false;
			}

			// Al superar la primera restricci�n, la letra la pasamos a may�scula
			letraMayuscula = (dni.substring(8)).toUpperCase();

			// Por �ltimo validamos que s�lo tengo 8 d�gitos entre los 8 primeros caracteres
			// y que la letra introducida es igual a la de la ecuaci�n
			// Llamamos a los m�todos privados de la clase soloNumeros() y letraDNI()
			if (soloNumeros(dni) == true && letraDNI(dni).equals(letraMayuscula)) {
				resul = true;
			}
		}

		return resul;
	}

	private static boolean soloNumeros(String dni) {

		int i, j = 0;
		String numero = ""; // Es el n�mero que se comprueba uno a uno por si hay alguna letra entre los 8
							// primeros d�gitos
		String miDNI = ""; // Guardamos en una cadena los n�meros para despu�s calcular la letra
		String[] unoNueve = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (i = 0; i < dni.length() - 1; i++) {
			numero = dni.substring(i, i + 1);

			for (j = 0; j < unoNueve.length; j++) {
				if (numero.equals(unoNueve[j])) {
					miDNI += unoNueve[j];
				}
			}
		}

		if (miDNI.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

	private static String letraDNI(String dni) {
		// El m�todo es privado porque lo voy a usar internamente en esta clase, no se
		// necesita fuera de ella

		// pasar miNumero a integer
		int miDNI = Integer.parseInt(dni.substring(0, 8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = { "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S",
				"Q", "V", "H", "L", "C", "K", "E" };

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];

		return miLetra;
	}

	/*
	 * static boolean dni(String dni) {
	 * 
	 * // @see
	 * https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
	 * 
	 * boolean resul = false; // final Pattern VALID_DNI =
	 * Pattern.compile("^[0-9]{8}+\\[A-Z]{1}", // Pattern.CASE_INSENSITIVE); final
	 * Pattern VALID_DNI = Pattern.compile("[0-9]{8}+[A-Z]{1,2}",
	 * Pattern.CASE_INSENSITIVE); if (dni != null) { Matcher matcher =
	 * VALID_DNI.matcher(dni); resul = matcher.find(); } return resul; // return
	 * false; }
	 */

	
	/**
	 * Metodo para validar la edad
	 * @param edad
	 * @return si la edad es correcta devuelve true, si no false
	 */
	public static boolean edad(int edad) {
		
		boolean resul = false;
		if (edad > 0 && edad < 150) {
			resul = true;
		}
		return resul; // return false;
	}

	public static boolean rol(String rol) {
		return false;
	}

}