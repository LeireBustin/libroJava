package com.ipartek.formacion.javalibro.ejercicios;

import java.text.NumberFormat;

/* Ejercicio para probar las variables de Java
 * 
 */
public class Variables {

	/**
	 * obetner un simbolo especial ASCII de 'check' '\u2714' o 'cross' '\u2716'
	 * @param valor boolean
	 * @return si valor true check, si false cross
	 */
	public static char dameSimbolo (boolean valor) {
		char resul = '\u2716';
		if(valor) {
			resul = '\u2714';
		}
		return resul;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejercicio con variables");
		
		System.out.println("1. Enteros");
		System.out.println("2. Reales");
		System.out.println("3. Boleanas");
		System.out.println("1. Caracteres");
				
		System.out.println("Enteros:");
		
		//TODO Terminar de poner el resto
		
		System.out.println("int" + Integer.BYTES + " bytes entero "+ Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
		
		
		System.out.println("Reales:");
		
		//CAMBIAR PUNTO X COMA
		float sueldoMesLander =  (float)2400.25;
		float sueldoMesGerman =  1200.25f;
		//forma 1
		System.out.println("German cobra :" + NumberFormat.getInstance().format(sueldoMesGerman) + " Euros al mes");
		//forma 2
		String sSueldoGerman =  String.valueOf(sueldoMesGerman);
		sSueldoGerman = sSueldoGerman.replace('.', ',');
		System.out.println("German cobra :" + sSueldoGerman + " Euros al mes");
		
				
		//System.out.println("char:");
		//System.out.println("boolean:");
		
		
		
		//TODO declarar una variable de cada tipo y usar su Wrapper:
		
		//Si es digito numero mayus o minus
		char [] chars = {'a','F','3','j'};
		System.out.println("---------------------------------------------");
		//CLASE: System.out.println("    digito      letra    Mayus.   Minus.");
		System.out.println(" Character \t-\t Digito \t-\t Letra \t-\t Mayus \t-\t Minus\t ");
		for (int i=0; i< chars.length; i++) {
			
			System.out.println("\t\t" + chars [i] + " \t" + Character.isDigit(chars[i]) + " \t\t-\t " + Character.isLetter(chars[i]) + " \t-\t " + Character.isUpperCase(chars[i]) + " \t-\t " + Character.isLowerCase(chars[i]) + " \t ");
			/*CLASE: System.out.println(    chars[i] + "     " + 
								  dameSimbolo(Character.isDigit(chars[i])) + "    " + 
								  dameSimbolo(Character.isLetter(chars[i]))	+ "    " + 
								  dameSimbolo(Character.isUpperCase(chars[i])) + "    " + 
								  dameSimbolo(Character.isLowerCase(chars[i])) + "    "
					           );
			*/
			
		} //end for
		
	}

}
		
/*
		if (Character.isDigit(l1)) {
			boolean digital = true;
		    System.out.println("El caracter " + l1 + " es un d�gito");
		}else{
			boolean digital = false;
		    System.out.println("El caracter " + l1 + " NO es un d�gito");//X
		}
		
		
		if (Character.isLetter(l1)){
			boolean letra = true;
		    System.out.println("El caracter " + l1 + " es una letra");
		}else{
			boolean letra = false;
		    System.out.println("El caracter " + l1 + " NO es una letra");//X
		}
		
		if (Character.isUpperCase(l1)){
			boolean mayus = true;
		    System.out.println("El caracter " + l1 + " es una may�scula");
		}else{
			boolean mayus = false;
		    System.out.println("El caracter " + l1 + " NO es una may�scula");//X
		}
		if (Character.isLowerCase(l1)){
			boolean minus = true;
		    System.out.println("El caracter " + l1 + " es una minuscula");
		}else{
			boolean minus = false;
		    System.out.println("El caracter " + l1 + " NO es una minuscula");//X
		}
*/	
		

	
