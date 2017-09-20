package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 
 * meter en CancionesWeb
 * @author Administrador
 *
 */
public class VerFechaActual {
	
	public static void main(String[] args)     {
		
		final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		final String DIASSEMANA[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
				
		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		
		int anyo = gc.get(Calendar.YEAR);
		int mes = gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int diassemana = (gc.get(Calendar.DAY_OF_WEEK)-1);
		
		System.out.println("año/mes/dia: " + anyo + " / " + MESES[mes] + " / " + DIASSEMANA[diassemana]);
		
		
		
	}

}
