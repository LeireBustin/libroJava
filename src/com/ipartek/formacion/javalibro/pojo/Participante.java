package com.ipartek.formacion.javalibro.pojo;

import com.ipartek.formacion.javalibro.excepciones.ParticipanteException;

public class Participante {

	// Atributos privados para no ser accesibles desde fuera de la Clase
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;
	private int edad;

	// Constructores
	public Participante() {
		super();
		this.nombre = "";
		this.email = "";
		this.usuarioGit = "";
		this.trabajador = false;
		this.edad = 0;
	}

	public Participante(String nombre, String usuarioGit) {
		this();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		
	}
	
	public Participante(String nombre, int edad) throws ParticipanteException {
		this();
		this.nombre = nombre;
		this.setEdad (edad);
	}

	// getters y setters (necesarios para mantener la encapsulacion)
	//(ENCAPSULAR): para acceder a los atributos y BEAN o POJO(clase con atributos)
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getUsuarioGit() {
		return usuarioGit;
	}


	public void setUsuarioGit(String usuarioGit) {
		this.usuarioGit = usuarioGit;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isTrabajador() {
		return trabajador;
	}

	public void setTrabajador(boolean trabajador) {
		this.trabajador = trabajador;
	}
		
	//otros metodos
	// test para comparar q el link es correcto
	public String getLinkGitHub() {
		return "https://github.com/" + this.usuarioGit;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws ParticipanteException {
		if (edad < 0){
			throw new ParticipanteException( ParticipanteException.EXCEPTION_MENOR_CERO );
		} else if (edad > 100){
			throw new ParticipanteException( ParticipanteException.EXCEPTION_MAYOR_CIEN );
		}
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", usuarioGit=" + usuarioGit + ", email=" + email + ", trabajador="
				+ trabajador + ", edad=" + edad + "]";
	}

	

}
