package com.ipartek.formacion.javalibro.excepciones;


/**
 *Excepcion personalizada para el POJO de Participante
 *@see https://es.wikipedia.org/wiki/Plain_Old_Java_Object
 */

 public class ParticipanteException extends Exception {
	 
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1608331766248931635L;
	
	public final static String EXCEPTION_MENOR_CERO = "La edad no puede ser menor de cero";
	public final static String EXCEPTION_MAYOR_CIEN = "Eres demasiado viejo, no puedes tener mas de 100años";
	 
	 public ParticipanteException(String messageException) {
		 super(messageException);
		
	}
	 
}
