package com.ipartek.formacion.javalibro.utilidades;

import java.util.Arrays;

import junit.framework.TestCase;

public class UtilidadesColeccionesTest extends TestCase {

	
	public void testOrdenacionArray() {
		
		int[] aDesordenado = {0,3,1,8,7,2,5,4,6,9};
		
		int[] ordenadorMenorMayor = UtilidadesColecciones.ordenarArray(aDesordenado, false);
		
		int[] ordenadorMayorMenor = UtilidadesColecciones.ordenarArray(aDesordenado, true);
		
		
		for (int i = 0; i < ordenadorMenorMayor.length; i++) {
			assertEquals(i, ordenadorMenorMayor[i]);
			//assertEquals(0, a[0]);
		}
		
		
		//comprobar orden inverso
		for (int i = ordenadorMayorMenor.length-1; i <= 0; i--) {
			assertEquals(ordenadorMayorMenor[i], i);
			
		}
		
	}
	
	public void testOrdenacionJava() {
		
		int[] aDesordenado = {0,3,1,8,7,2,5,4,6,9};
		
		Arrays.sort(aDesordenado);
		
		for(int i = 0; i < aDesordenado.length; i++) {
			
			assertEquals(i, aDesordenado[i]);
			
		}
		
		
		
		
	}
	
}