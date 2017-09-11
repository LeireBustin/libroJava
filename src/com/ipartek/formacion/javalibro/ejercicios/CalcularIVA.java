package com.ipartek.formacion.javalibro.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularIVA {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean seguir = false;
		float importe = 0;
		// FLAG<<<<<:
		boolean importeCorrecto = false;
		System.out.println("Calculadora IVA ");

		do {
			System.out.println("Por favor dame el importe en €");

			do {
				try {
					
					//Hacer lo q quieras para q pase x todas las excepciones
					/*
					 * sc.null;
					 * sc.next();
					 */
					/*
					 * importe = 9/0;
					 */
					
					
					sc = new Scanner(System.in);
					importe = sc.nextFloat();
					importeCorrecto = true;
					
				}catch(NullPointerException e) {
					System.out.println("Ya me diras cimo hsd metido un null: -1");
				}catch (InputMismatchException e) {
					System.out.println("Valor incorrecto, introduce un numero, por ejemplo: 123.33 ");				
				} catch (Exception e) {
					System.out.println("¿Que has hecho para que falle?");
				}

			} while (!importeCorrecto);

			// Calculo del IVA
			System.out.println("IVA repercutido: " + importe * 0.21);

			// Repetir la operacion
			System.out.println("¿Quiere meter algun otro importe?: ");
			seguir = "s".equalsIgnoreCase(sc.next());

		}while(seguir);

	sc.close();

	System.out.println("Muchas gracias. Agur.");

}

}
