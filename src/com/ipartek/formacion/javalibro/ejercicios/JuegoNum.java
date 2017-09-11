package com.ipartek.formacion.javalibro.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numUser = 0;
		int RANGO_NUMS = 10;
		int num = (int) (Math.random() * (RANGO_NUMS + 1));
		int vidas = 3;
		boolean acierto = false;
		// FLAG<<<<<:
		boolean numCorrecto = false;

		System.out.println(num);

		System.out.println("-----Acierta el número del 1 al " + RANGO_NUMS + "-----");

		do {
			// Pedimos numero al user y comprobamos q sea numero y este dentro del rango de
			// valores posibles RANGO_NUMS
			System.out.println("Por favor dame un numero del 1 al " + RANGO_NUMS + " por favor.");

			do {
				try {

					sc = new Scanner(System.in);
					numUser = (int) sc.nextFloat();
					System.out.println(numUser);
					numCorrecto = true;
								

				} catch (NullPointerException e) {
					System.out.println("Nulo - null: -1");
				} catch (InputMismatchException e) {
					System.out.println("Valor incorrecto, introduce un numero de 1 a " + RANGO_NUMS);
				} catch (Exception e) {
					System.out.println("¿Que has hecho para que falle?");
				}

			} while (!numCorrecto);

			if (numUser == num) {
				acierto = true;
				vidas = 0;
				System.out.println("¡¡¡HAS ACERTADO!!! El número era " + num);
			} else {
				vidas = -1;
				if(vidas == 0){
			}
				System.out.println("NO HAS GANADO. INTENTALO OTRO DIA MAJ@.");
			}
			

			
		} while (vidas != 0 && acierto != true);

		System.out.println("NO HAS GANADO. INTENTALO OTRO DIA MAJ@.");

		/*
		 * 
		 * System.out.println("-----Acierta el número del 1 al 10-----");
		 * 
		 * do { System.out.println("Por favor dame el importe en €");
		 * 
		 * ... // Calculo del IVA System.out.println("IVA repercutido: " + importe *
		 * 0.21);
		 * 
		 * // Repetir la operacion
		 * System.out.println("¿Quiere meter algun otro importe?: "); seguir =
		 * "s".equalsIgnoreCase(sc.next());
		 * 
		 * }while(seguir);
		 * 
		 * sc.close();
		 * 
		 * System.out.println("");
		 * 
		 * 
		 */
	}

}
