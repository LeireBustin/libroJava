package com.ipartek.formacion.javalibro.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.formacion.javalibro.pojo.Cancion;

public class MenuCanciones {

	static ArrayList<Cancion> canciones;

	static final int OP_LISTAR = 1;
	static final int OP_ELIMINAR = 2;
	static final int OP_CREAR = 3;
	static final int OP_DETALLE = 4;
	static final int OP_SALIR = 5;

	static Scanner sc;
	
	static int opcionSeleccionada;

	public static void main(String[] args) {

		inicializarCanciones();
		mostrarMenu();

		do {
			pedirOpcion();
			switch (opcionSeleccionada) {
			case OP_LISTAR:
				listar();
				mostrarMenu();
				break;

			case OP_ELIMINAR:
				eliminar();
				listar();
				mostrarMenu();
				break;

			case OP_CREAR:
				// Pedir y crear
				crear();// add
				mostrarMenu();
				listar();

			case OP_DETALLE:
				detalle();//
				mostrarMenu();
				break;

			//case OP_SALIR:

				// TODO hacer el resto de opciones
				
			
			default:
				break;
			}
		} while (OP_SALIR != opcionSeleccionada);
		
		System.out.println("Agur y gracias por escucharnos");

	}

	private static void crear() {
		// incluir canciones en Array.
		sc = new Scanner(System.in);
		System.out.println("Introduce el titulo de la cancion: ");
		String titulo = sc.next();

		System.out.println("Introduce el artista de la cancion: ");
		String artista = sc.next();

		System.out.println("Introduce la duracion de la cancion en numero de minutos: ");
		String duracion = sc.next();

		Cancion c = new Cancion(titulo, artista, duracion);
		canciones.add(c);
		//ASI SE PUEDE??	canciones.add(setTitulo(titulo), setArtista(artista), setDuracion(duracion));

		//sc.close();

	}

	private static void eliminar() {
		// TODO Auto-generated method stub
		// Eliminar cancion
		System.out.println("Dime el numero de cancion a eliminar");
		sc = new Scanner(System.in);
		int cancionPosicionEliminar = sc.nextInt();
		cancionPosicionEliminar--;
		
		//comprobar que exista la cancion
		if ( cancionPosicionEliminar >= 0 &&  cancionPosicionEliminar <= canciones.size() ) {
			
			canciones.remove(cancionPosicionEliminar);
			
		}else {
			System.out.println("Lo siento pero no existe esa cancion");
		}

	}

	private static void listar() {
		// TODO Auto-generated method stub
		// Listar Array
		for (int i = 0; i < canciones.size(); i++) {
			System.out.println((i+1) + canciones.get(i).getNombre());
			
		}

	}

	private static void pedirOpcion() {
		// TODO Scanner y gestion de Excepcion
				
		sc = new Scanner(System.in);
		boolean opcionCorrecta = false;
		
		do {
			try {
			System.out.println("Selecciona una opcion del 1 al 5");
			opcionSeleccionada = sc.nextInt();
			if (opcionSeleccionada >= 1 && opcionSeleccionada <= 5 ) {
				opcionCorrecta = true;
				//sc.close();
			} else {
				System.out.println("Por favor aprende a leer y dime una opcion entre 1 y 5");
			}
				
		}catch (Exception e) {
			
			System.out.println("Por favor selecciona una opcion valida");
				
		}
			
		} while (!opcionCorrecta);
			
			System.out.println("Agur. Gracias por su visita.");
		
		}
		

	
	
	private static void detalle() {
	//NO SERVIRIA? canciones.toString();
		
		System.out.println("Dime el numero de cancion para ver su detalle");
		sc = new Scanner(System.in);
		int cancionPosicion = sc.nextInt();
		cancionPosicion--;
		if ( cancionPosicion >= 0 &&  cancionPosicion <= canciones.size() ) {
			Cancion c = canciones.get(cancionPosicion);
			System.out.println( "Nombre: " + c.getNombre());
			System.out.println( "Artista: " + c.getArtista());
			System.out.println( "Duracion" + c.getDuracion());
			System.out.println(" ");
			
		}else {
			System.out.println("Lo siento pero no existe esa cancion");
		}
	}

	private static void mostrarMenu() {

		System.out.println("Gestor Canciones");
		System.out.println("---------------------------");
		System.out.println(" 1. Listar ");
		System.out.println(" 2. Eliminar ");
		System.out.println(" 3. Crear ");
		System.out.println(" 4. Detalle ");
		System.out.println(" 5. Salir ");
		System.out.println("---------------------------");

	}

	private static void inicializarCanciones() {

		final String cancion1 = "Can1";
		final String artista1 = "Art1";
		final String duracion1 = "3:3";
		final String cancion2 = "Can2";
		final String cancion3 = "Can3";
		final String cancion4 = "Can4";
		final String cancion5 = "Can5";
		final String cancion6 = "Can6";
		final String cancion7 = "Can7";
		final String cancion8 = "Can8";
		final String cancion9 = "Can9";
		final String cancion10 = "Can10";

		// Crear array
		// ASI MAL: ArrayList cancion = new ArrayList();

		canciones = new ArrayList<Cancion>();
		for (int i = 0; i < 10; i++) {
			canciones.add(new Cancion("Fiesta Pagana" + i, "Mafo de Hoz" + i, "3;3" + i));
		}

	}

}
