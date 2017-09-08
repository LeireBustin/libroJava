import java.util.ArrayList;
import java.util.Scanner;

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

		pedirOpcion();
		do {
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
				crearCancion();// add
				detalle();//
				listar();

			case OP_DETALLE:
				listar();
				mostrarDetalle();
				mostrarMenu();

			case OP_SALIR:

				// TODO hacer el resto de opciones

			default:
				break;
			}
		} while (OP_SALIR != opcionSeleccionada);

	}

	private static void crearCancion() {
		// incluir canciones en Array.
		sc = new Scanner(System.in);
		System.out.println("Introduce el titulo de la cancion: ");
		String titulo = sc.next();

		System.out.println("Introduce el artista de la cancion: ");
		String artista = sc.next();

		System.out.println("Introduce la duracion de la cancion en numero de minutos: ");
		int duracion = sc.next();

		cancion c = new Cancion(titulo, artista, duracion);
		canciones.add(c);
		//ASI SE PUEDE??	canciones.add(setTitulo(titulo), setArtista(artista), setDuracion(duracion));

		//sc.close();

	}

	private static void eliminar() {
		// TODO Auto-generated method stub
		// Eliminar cancion

	}

	private static void listar() {
		// TODO Auto-generated method stub
		// Listar Array
		for (int i = 0; i < canciones.size(); i++) {
			System.out.println((i+1) + canciones.get(i).getTitulo());
			//NO SERVIRIA?	canciones.getTitulo(i);
		}

	}

	private static void pedirOpcion() {
		// TODO Scanner y gestion de Excepcion
				
		sc = new Scanner(System.in);
		boolean opcionCorrecta = false;
		
		try {
			do {
			System.out.println("Selecciona una opcion del 1 al 5");
			opcionSeleccionada = sc.nextInt();
			if (opcionSeleccionada >= 1 && opcionSeleccionada <= 5 ) {
				opcionCorrecta = true;
				//sc.close();
			} else catch (Exception e) {
				
			}
			
			} while (!opcionCorrecta);
			
			System.out.println("Agur. Gracias por su visita.");
		
		}
		

	}
	
	private static void detalle() {
	//NO SERVIRIA? canciones.toString();
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
		final int duracion1 = 4;
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
			canciones.add(new Cancion("Fiesta Pagana" + i, "Mafo de Hoz" + i, 3 + i));
		}

	}

}
