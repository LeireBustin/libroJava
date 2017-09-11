package com.ipartek.formacion.javalibro.excepciones;


public class PopagarExcepciones {

	public static void main(String[] args) {


		comoMarron();

	}
	
	private static void lanzoExcepcion() throws Exception {
		
		System.out.println("lanzoExcepcion ENTRO");
		//
		System.out.println("lanzoExcepcion SALGO");
		throw new Exception();
	}
	
	private static void pasoMarron() throws Exception {
		
		System.out.println("pasoMarron ENTRO");
		lanzoExcepcion();
		System.out.println("pasoMarron SALGO");
	}

	private static void comoMarron() {
		
		System.out.println("comoMarron ENTRO");
		try {
			pasoMarron();
		} catch (Exception e) {
			System.out.println("Ya me encargo yo");
		}
		
		System.out.println("comoMarron SALGO");
	}
}
