package com.ipartek.formacion.javalibro.excepciones;

import java.util.ArrayList;

import junit.framework.TestCase;

public class ArrayListTest extends TestCase {

	
	static final String FRANCIA = "Francia";
	static final String JAPON = "Francia";
	static final String ITALIA = "Italia";
	static final String NORUEGA = "Noruega";
	
		public void testPaises() {
			//DECLARAR
			ArrayList paises = new ArrayList();
			assertEquals(0 , paises.size() );
			
			//AGREGAR
			paises.add(FRANCIA);
			assertEquals(1 , paises.size() );
			paises.add(JAPON);
			//assertEquals(2 , paises.size() );
			paises.add(ITALIA);
			//assertEquals(3 , paises.size() );
			paises.add(NORUEGA);
			//assertEquals(4 , paises.size() );
			
			//BORRAR
			paises.remove(0);
			assertEquals(3 , paises.size() );
			assertEquals( JAPON , paises.get(0) );
			
			
			
			
			
			
			
			
		}
		
}
