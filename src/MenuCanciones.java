import java.util.ArrayList;

public class MenuCanciones {

	public static void main(String[] args) {

		final String cancion1 = "Can1";
		final String cancion2 = "Can2";
		final String cancion3 = "Can3";
		final String cancion4 = "Can4";
		final String cancion5 = "Can5";
		final String cancion6 = "Can6";
		final String cancion7 = "Can7";
		final String cancion8 = "Can8";
		final String cancion9 = "Can9";
		final String cancion10 = "Can10";
		final String e = "Can10";
		final String f = "Can10";
		final int i = 1;
		
		//Crear array
		ArrayList cancion = new ArrayList(e,f,i);
		
		
		//añado 10 canciones personales
		cancion.add(cancion1);
		cancion.add(cancion2);
		cancion.add(cancion3);
		cancion.add(cancion4);
		cancion.add(cancion5);
		cancion.add(cancion6);
		cancion.add(cancion7);
		cancion.add(cancion8);
		cancion.add(cancion9);
		cancion.add(cancion10);
		
		//cancion.toString();
		
		for(int i = 0; i < cancion.size(); i++) {   
		    System.out.println(cancion.get(i));
		}
		
		
		
		//Eliminar cancion
		
		//Crear canciones: crear y agregar despues
		
	}

}
