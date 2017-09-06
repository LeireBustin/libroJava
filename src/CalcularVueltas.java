/*
 * 
  
   Ejercicio para calcular las vueltas de una compra, 
   la compra será de un valor de 1.326,24€ y pagamos con cuatro billetes de 500€. 
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
		final float BILLETES_MONEDAS[] = {50f,20f,10f,5f,2f,1f,0.5f,0.2f,0.1f,0.05f,0.02f,0.01f};
		float vCompra = 1326.24f;
		int numBilletesPago = 4;
		float tipoBilletePago = 500f;
		float vPago = numBilletesPago*tipoBilletePago;
		int numBilletes[] = new int[BILLETES_MONEDAS.length];
		
		if(vPago > vCompra) {
			float vVueltasTotales = vPago - vCompra;
			float vContVueltas = vVueltasTotales;
			
			System.out.println("Ha pagado " + vPago + " euros con " + numBilletesPago
					+ " billetes de " + tipoBilletePago + " euros para una compra de "
					+ vCompra + " euros totales." + BILLETES_MONEDAS.length);
			
			for(int i=0; i<(BILLETES_MONEDAS.length-1); i++) {
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

	}

}
