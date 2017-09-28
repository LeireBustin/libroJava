package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.excepciones.PersonaException;
import com.ipartek.formacion.javalibro.utilidades.Validaciones;

public class Persona {
	
	public static int MAYOR_EDAD = 18;
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;
	private String email;
	private String dni;
	private String rol;
		
	
	public Persona(String nombre, String apellido1, String apellido2, String email, String dni, String rol, int edad) throws PersonaException {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		//this.edad = edad;
		setEdad(edad);
		//this.email = email;
		setEmail(email);
		//this.dni = dni;
		setDni(dni);
		this.rol = rol;
		
	}


	public Persona() {
		super();
		this.nombre = "";
		this.apellido1 = "";
		this.apellido2 = "";
		this.email = "";
		this.dni = "";
		this.rol = "";
		this.edad = 0;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Setea la edad de la persona
	 * @param edad int años de la persona
	 * @throws PersonaException edad < 18
	 */
	public void setEdad(int edad) throws PersonaException {
		/* boolean erroneo = false;		//*/
		if ( !Validaciones.edad(edad) || edad < MAYOR_EDAD ) {
			/* erroneo = true;		//*/
			throw new PersonaException(PersonaException.MSG_EDAD_MENOR);
		}
			
		this.edad = edad;
		/* return erroneo;		//No se si lo recoge o se lo envia bien a entradaErronea de ValidacionPersona (en POJOs)*/
	}
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) throws PersonaException {
		/* boolean erroneo = false;	//*/
		if ( !Validaciones.email(email) ) {
			/* erroneo = true;		//*/
			throw new PersonaException(PersonaException.MSG_EMAIL_ERROR);
		}
		this.email = email;
		/* return erroneo;		//*/
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) throws PersonaException {
		/* boolean erroneo = false;		//*/
		if ( !Validaciones.dni(dni) ) {
			/* erroneo = true;		//*/
			throw new PersonaException(PersonaException.MSG_DNI_ERROR);
		}
			
		this.dni = dni;
		/* return erroneo;		//*/
	}


	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}


	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", email="
				+ email + ", dni=" + dni + ", rol=" + rol + ", edad=" + edad + "]";
	}
	
	
	
	

}