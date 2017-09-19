package com.ipartek.formacion.javalibro.utilidades;

import junit.framework.TestCase;

public class ValidacionesTest extends TestCase {

	public void testEmail() {

		assertFalse(Validaciones.email(null));
		assertFalse(Validaciones.email(""));
		assertFalse(Validaciones.email("auraga.ipartek.com"));
		assertFalse(Validaciones.email("auraga.ipartek."));
		assertFalse(Validaciones.email("auraga@"));
		assertFalse(Validaciones.email("auraga@ipartekcom"));
		assertFalse(Validaciones.email("auraga@ipartekcom.e"));

		assertTrue(Validaciones.email("auraga@ipartek.com"));

	}
	/*
	public void testEmail() {
		
		assertFalse(Validaciones.email(null));
		assertFalse (Validaciones.email(""));
		assertFalse (Validaciones.email("leire"));
		//assertFalse (Validaciones.email("leire@gm..com"));
		assertFalse (Validaciones.email("leire@gmail"));
		assertFalse (Validaciones.email("leire@gmail."));
		assertFalse (Validaciones.email("@leire"));
		assertFalse (Validaciones.email("??"));
		assertFalse (Validaciones.email("@.com"));
		assertFalse (Validaciones.email(".es"));
		
		assertTrue (Validaciones.email("13leire@gmail.com"));
		assertTrue (Validaciones.email("leire6@hotmail.es"));
		assertTrue (Validaciones.email("leire88@yahoo.es"));
			
	}
	*/
	
	
	public void testDNI() {
		
		assertFalse(Validaciones.dni(null));
		assertFalse(Validaciones.dni(""));
		assertFalse(Validaciones.dni("2eee"));
		assertFalse(Validaciones.dni("1111111"));
		assertFalse(Validaciones.dni("1111111Y"));
		
		assertTrue (Validaciones.dni("77111118H"));
		assertTrue (Validaciones.dni("11111118h"));
		assertTrue (Validaciones.dni("66778999d"));
		assertTrue (Validaciones.dni("88888888G"));
		assertTrue (Validaciones.dni("66778999F"));
		assertTrue (Validaciones.dni("66778999A"));
		assertTrue (Validaciones.dni("66778999h"));
		
	}
	
	
	/*
	public void testDNI() {
		
		assertFalse(Validaciones.dni(null));
		assertFalse (Validaciones.dni(""));
		assertFalse (Validaciones.dni("34322#133"));
		assertFalse (Validaciones.dni("K66778999"));
		assertFalse (Validaciones.dni("D66778999"));
		assertFalse (Validaciones.dni("D667L8990"));
		assertFalse (Validaciones.dni("76677899."));
		assertFalse (Validaciones.dni("D667 8999"));
		
		//assertTrue (Validaciones.dni("66778999D"));
		assertTrue (Validaciones.dni("66778999d"));
		assertTrue (Validaciones.dni("88888888G"));
		assertTrue (Validaciones.dni("66778999-F"));
		assertTrue (Validaciones.dni("66778999 A"));
		assertTrue (Validaciones.dni("66778999-h"));

	}
	*/

}
