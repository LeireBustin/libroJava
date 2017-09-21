package com.ipartek.formacion.javalibro.pojo;

public class Pelicula {

	
			// ATRIBUTOS
			private String titulo;	//elementos en el XML
			private String guionista;
			private String productor;
			private String director;
			private String actor;
			private String comentarios;
			
			private String tipo;	//atributos en el XML
			private int año;
			
			public Pelicula() {
				super();
				this.titulo = "";
				this.guionista = "";
				this.productor = "";
				this.director = "";
				this.actor = "";
				this.comentarios = "";
				
				
				this.tipo = "";
				this.año = -1;
				
			}

			public Pelicula(String titulo, String guionista, String productor, String director, String actor,
					String comentarios) {
				super();
				this.titulo = titulo;
				this.guionista = guionista;
				this.productor = productor;
				this.director = director;
				this.actor = actor;
				this.comentarios = comentarios;
				this.tipo = tipo;
				this.año = año;
			}
			

			public String getTitulo() {
				return titulo;
			}

			public void setTitulo(String titulo) {
				this.titulo = titulo;
			}

			public String getGuionista() {
				return guionista;
			}

			public void setGuionista(String guionista) {
				this.guionista = guionista;
			}

			public String getProductor() {
				return productor;
			}

			public void setProductor(String productor) {
				this.productor = productor;
			}

			public String getDirector() {
				return director;
			}

			public void setDirector(String director) {
				this.director = director;
			}

			public String getActor() {
				return actor;
			}

			public void setActor(String actor) {
				this.actor = actor;
			}

			public String getComentarios() {
				return comentarios;
			}

			public void setComentarios(String comentarios) {
				this.comentarios = comentarios;
			}

			public String getTipo() {
				return tipo;
			}

			public void setTipo(String tipo) {
				this.tipo = tipo;
			}

			public int getAño() {
				return año;
			}

			public void setAño(int año) {
				this.año = año;
			}

			
			@Override
			public String toString() {
				return "Pelicula [titulo=" + titulo + ", guionista=" + guionista + ", productor=" + productor
						+ ", director=" + director + ", actor=" + actor + ", comentarios=" + comentarios + ", tipo="
						+ tipo + ", año=" + año + "]";
			}

			
			

}
