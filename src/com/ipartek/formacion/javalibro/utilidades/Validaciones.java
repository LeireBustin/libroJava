package com.ipartek.formacion.javalibro.utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * Metodo para validar si un email es correcto
	 * @param email a validar
	 * @return true si es valido, false en caso contrario
	 */
	static boolean email(String email) {
		boolean resul = false;
		if ( email != null ) {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
	        resul = matcher.find();
		}
		return resul;
	}
	
	
	
	static boolean dni(String dni) {
		//https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
		boolean resul = false;
		//final Pattern VALID_DNI = Pattern.compile("^[0-9]{8}+\\[A-Z]{1,2}", Pattern.CASE_INSENSITIVE);
		final Pattern VALID_DNI = Pattern.compile("[0-9]{8}+[A-Z]{1,2}", Pattern.CASE_INSENSITIVE);
		if ( dni != null ) {
			Matcher matcher = VALID_DNI.matcher(dni);
	        resul = matcher.find();
		}
		
		return resul;	//return false;	
	}

}