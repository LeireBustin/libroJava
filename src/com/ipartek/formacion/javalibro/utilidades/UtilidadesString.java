package com.ipartek.formacion.javalibro.utilidades;


public class UtilidadesString {

	

/**
 * Cuenta las palabras q esten contenidas en el 'texto'
 * @param texto String donde buscar las palabras
 * @param busqueda String palabra q buscamos dentro del 'texto'
 *@return int 0 si no encuentra, numero de palabras/busquedas encontradas 
 * 
 */
		static int buscarPalabra (String texto, String busqueda) {
			//TODO implementar despues del test
			int resul = 0;
			int pos = -1;
						
			if (texto == null || busqueda == null) {
				resul = 0;
			}else {
								
				//dowhile, while o for hasta pos = -1
				do {
					
				//buscar palabra
				
				pos = texto.indexOf(busqueda);
				
				//existe?
				if( pos != -1){
					
					//sumar 1 al resul
					resul ++;
					
					//recortar el texto
					texto = texto.substring(pos + busqueda.length());
				}
				}while (pos != -1);
				resul = 99;
			}
			/*
			 * String texto;
			int texto.IndexOf(palabra);
			
			int desdePuntoString = 0;
			public int texto.indexOf(palabra, desdePuntoString)
			if ( desdePuntoString != 0) {
				
			}
			*/
			return -1;
			
		}
		
		public static void main(String[] args) {
		
		
		
		
		
		
		
		

	}

}
