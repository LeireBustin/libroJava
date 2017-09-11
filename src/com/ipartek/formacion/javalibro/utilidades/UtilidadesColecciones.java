package com.ipartek.formacion.javalibro.utilidades;

public class UtilidadesColecciones {

	/**
	 * Ordena un Array con el metodo bubble-sort
	 * 
	 * @see https://www.youtube.com/watch?v=lyZQPjUT5B4
	 * @param aDesordenado
	 *            Array desordenado
	 * @param orden
	 *            true de mayor a menor, false de menor a mayor
	 * @return array ordenado segun parametro <code>orden</code>
	 */
	static int[] ordenarArray(int[] aDesordenado, boolean orden) {

		int[] resul = aDesordenado;

		// int a[] = new int [10];
		// int a[] = { 0, 3, 1, 8, 7, 2, 5, 4, 6, 9 };
		int a[] = { 0, 2, 1 };
		int cambios = 0;
		boolean ordenado = false;

		// try catch??

		// for???
		do {

			for (int i = 0; i < a.length; i++) {

				if (a[i] <= a[i + 1]) {

					System.out.println("No hay cambio:" + a.toString());
					boolean[] aOrdenados = new boolean[a.length];
					for (int k = 0; k < aOrdenados.length; k++) {
						aOrdenados[k] = true;
						i++;
					}

				} else {
					// seguro q hay una funcion de intercambio
					cambios++;
					int sust = a[i];
					a[i] = a[i + 1];
					a[i + 1] = sust;
					System.out.println(a.toString());

				}
			}

		} while (!ordenado);

		System.out.println("FIN ordenado: " + a.toString());

		return resul;
	}

}