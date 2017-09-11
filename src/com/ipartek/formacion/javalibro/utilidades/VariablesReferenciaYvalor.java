package com.ipartek.formacion.javalibro.utilidades;

import com.ipartek.formacion.javalibro.pojo.Participante;

/**
 * las variables primitivas se pasan por valor: copia del valor, no cambia
 * Las variables de Clase se pasan por referencia
 * @author Administrador
 *
 */


public class VariablesReferenciaYvalor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primitiva = 1;
		System.out.println("primitiva: " + primitiva);
		int primitiva2 = sumar(primitiva);
		System.out.println("primitiva2: " + primitiva2);
		System.out.println("primitiva: " + primitiva);

		//Las variables de Clase se pasan por referencia
		String referencia = "1";
		String referencia2 = sumar(referencia);
		System.out.println("Referencia: " + referencia);
		System.out.println("Referencia2: " + referencia2);
		
			
	}
	static int sumar( int i ){
	return ++i;
	}
	
	static String sumar(String s) {
		s = "2";
		return s;
	}
}
