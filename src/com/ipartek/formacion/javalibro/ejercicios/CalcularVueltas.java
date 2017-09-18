package com.ipartek.formacion.javalibro.ejercicios;

/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra serÃ¡ de un valor de 1.326,24â‚¬ y pagamos con cuatro billetes de 500â‚¬. 
   Debemos calcular las vueltas para que sean mas optimas y dar el menor numero de billetes y monedas.

	------------- RESULTADO ---------------------
	
	Vueltas de 673.76 Euros:
	
	En 13 Billetes de 50
	En 1 Billetes de 20
	En 0 Billetes de 10
	En 0 Billetes de 5
	En 1 Monedas de 2 Euros
	En 1 Monedas de 1 Euro
	En 1 Monedas de 50 Centimos
	En 1 Monedas de 20 Centimos
	En 0 Monedas de 10 Centimos
	En 1 Monedas de 5 Centimos
	En 0 Monedas de 2 Centimos
	En 1 Monedas de 1 Centimos
 
 * */
public class CalcularVueltas {

	public static void main(String[] args) {
		
		////Devolver menor numero de billetes
		final float BILLETES_MONEDAS[] = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		float vCompra = 1326.24f;
		int numBilletesPago = 4;
		int tipoBilletePago = 500;
		float vPago = numBilletesPago*tipoBilletePago;
		int numBilletes[] = new int[BILLETES_MONEDAS.length];
		
		if(vPago > vCompra) {
			float vVueltasTotales = vPago - vCompra;
			float vContVueltas = vVueltasTotales;
			
			System.out.println("Ha pagado " + vPago + " euros con " + numBilletesPago
					+ " billetes de " + tipoBilletePago + " euros para una compra de "
					+ vCompra + " euros totales." + BILLETES_MONEDAS.length);
			
			for(int i=0; i<(BILLETES_MONEDAS.length); i++) {
				numBilletes[i] = 0;
				while(vContVueltas >= BILLETES_MONEDAS[i]) {
					vContVueltas = vContVueltas - BILLETES_MONEDAS[i];
					numBilletes[i] = numBilletes[i] + 1;
				}
									
			}
			System.out.println("\tLa vuelta es de " + vVueltasTotales + 
					" euros con el siguiente numero de billetes de diferente tipo/valor: \t");
			for(int i=0; i<(numBilletes.length); i++) {
				System.out.println(numBilletes[i] + " billetes/monedas de " + BILLETES_MONEDAS[i] + " euros\t");
			}
			
		}else {
			if(vPago < vCompra) 
				System.out.println("No ha pagado suficiente. ¡Faltan billetitos!");
			else {
				if(vPago == vCompra){
					System.out.println("Estamos en paz. No hay vueltas");
				}
			}
			
		}
	
		//array billetes y monedas
		System.out.println("\t------------Contenidos Arrays------------");
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			System.out.println("\tBILLETES_MONEDAS[" + i + "]" + " = " + BILLETES_MONEDAS[i]);
		}

		/* EJERCICIO ANDER
		 float compra = (float)1326.24;
		float pago = 4 * 500;
		float resto = pago - compra;
		final float[] BILLETES_MONEDAS = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		int[] aVueltas = new int[BILLETES_MONEDAS.length];
		String[] literales = { "Billete 50", "Billete 20", "Billete 10", "Billete 5", "Moneda 2", "Moneda 1",
				"Moneda 0,50", "Moneda 0,20", "Moneda 0,10", "Moneda 0,05", "Moneda 0,02", "Moneda 0,01", }; // calcular
																												// las
																												// vueltas
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
			resto = resto - BILLETES_MONEDAS[i] * aVueltas[i];
		}
		
		System.out.println("-------------------------");
		System.out.println("------ TICKET ---------");
		System.out.println("-------------------------");
		System.out.println("PAGO: " + compra + " €");
		System.out.println("RETORNO:" + (pago - compra) + "€");
		System.out.println("-------------------------");
		System.out.println("Las vueltas:");
		System.out.println("-------------------------");
		for (int i = 0; i < aVueltas.length; i++) {
			System.out.println(aVueltas[i] + " " + literales[i]);
		}
		System.out.println("-------------------------");
		System.out.println("-gracias por su visita-");
		System.out.println("-------------------------");
			
		 */
		
	}

}
