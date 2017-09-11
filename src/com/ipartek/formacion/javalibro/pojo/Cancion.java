package com.ipartek.formacion.javalibro.pojo;


public class Cancion {

	// ATRIBUTOS
	private String nombre;
	private String artista;
	private String duracion; // en minutos

	// CONSTRUCTORES
	public Cancion() {
		super();
		this.nombre = "";
		this.artista = "";
		this.duracion = "";

	}

	public Cancion(String nombre) {
		super();
		this.nombre = nombre;
		this.artista = "";
		this.duracion = "";

	}

	public Cancion(String nombre, String artista) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = "";

	}

	public Cancion(String nombre, String artista, String duracion) {
		super();
		this.nombre = nombre;
		this.artista = artista;
		this.duracion = duracion;

	}

	public String toString() {
		return "Cancion [nombre=" + nombre + ", artista=" + artista + ", duracion=" + duracion + "]";
	}

	// getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

}
