package com.ipartek.formacion.javalibro.excepciones;

/**
 * Excepcion personalizada para el POJO Persona
 * @author Administrador
 *
 */
public class PersonaException extends Exception {


		private static final long serialVersionUID = 1L;
		
		
		//pasar un metodo para volver a construir
		public final static String MSG_EDAD_MENOR = "Debe ser mayor de 18";
		public final static String MSG_EMAIL_ERROR = "EMAIL NO ES CORRECTO";
		public final static String MSG_DNI_ERROR = "EL DNI NO ES CORRECTO";
		
		//para q le pase al padre mensaje
		public PersonaException(String messageException) {
			super(messageException);
	

	}
}
