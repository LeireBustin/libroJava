package com.ipartek.formacion.javalibro.ejercicios;

import java.text.NumberFormat;

/* Ejers variables
 * 
 */
public class Variables {

	//obtener un simbolo especial check o cross
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
		
				
		System.out.println("Enteros:");
		//TODO Terminar de poner el resto
		System.out.println("short");
		System.out.println("int" + Integer.BYTES + " bytes entero "+ Integer.MIN_VALUE);
		
		
		System.out.println("Reales:");
		//CAMBIAR PUNTO X COMA
		float sueldoMesLander =  (float)2400.25;
		float sueldoMesGerman =  1200.25f;
		//forma 1
		System.out.println("German cobra :" + NumberFormat.getInstance().format(sueldoMesGerman) + " Euros");
		//forma 2
		String sSueldoMesGerman =  String.valueOf(sueldoMesGerman);
		sSueldoMesGerman = sSueldoMesGerman.replace('.', ',');
		System.out.println("German cobra :" + sSueldoMesGerman + " Euros");
		
		//TODO Terminar de poner el resto
		System.out.println("float" + Float.BYTES + " bytes entero "+ Integer.MIN_VALUE);
	
		
		
		System.out.println("char:");
		System.out.println("boolean:");
		
		
		//TODO declarar una variable de cada tipo y usar su Wrapper:
		
		//Si es digito numero mayus o minus
		char [] chars = {'a','F','3','j'};
		
		
		System.out.println(" Character \t-\t Digito \t-\t Letra \t-\t Mayus \t-\t Minus\t ");
		for (int i=0; i< chars.length; i++) {
			
			System.out.println("\t\t" + chars [i] + " \t" + Character.isDigit(chars[i]) + " \t\t-\t " + Character.isLetter(chars[i]) + " \t-\t " + Character.isUpperCase(chars[i]) + " \t-\t " + Character.isLowerCase(chars[i]) + " \t ");
			
			
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
		

	}

}
