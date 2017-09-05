
public class TocaLeer {

	static String [] alumnos = {"Arkaitz", "Erlantz", "Fran" , 
			"Cristian", "Leire", "Mikel", "Josu", "Alberto", "Jon", "Lander", "German"
			};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numAleatorio = 0;
		String alumno = "Ander";
		
		int numeroAleatorio = generarNumeroAleatorio (alumnos.length);
		//generar num aleatorio
		//numAleatorio = (int) (Math.random()*alumnos.length);
		
		System.out.println("Que afortunado es: " + alumnos[numAleatorio]);

	}
	
	/**
	 * Genera/devuelve un valor aleatorio entre 0 y <code>max</code>
	 * @param max: valor max del rango del que queremos sacar el numero aleatorio
	 * @return
	 */
	public static int generarNumeroAleatorio (int max){
	//TODO falta implementar logica	
		
		return 1;
	}
	
	
}

