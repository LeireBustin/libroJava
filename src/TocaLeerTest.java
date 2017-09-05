import junit.framework.TestCase;


public class TocaLeerTest extends TestCase {

	public void testGenerarNumeroAleatorio() {
		
		int numAleatorio = -1;
		boolean [] aCheck = new boolean[15];
		
		for (int i = 0; i < 1000; i++){
			numAleatorio = TocaLeer.generarNumeroAleatorio(15);
			aCheck [numAleatorio]=true; 
		}
		
		//comprobar q todas las posiciones sean true
		for (int i = 0; i < aCheck.length; i++){
			assertTrue(aCheck[i]);
		}
	
	}

}
