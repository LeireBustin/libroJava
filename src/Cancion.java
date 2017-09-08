
public class Cancion {

	// ATRIBUTOS
	private String titulo;
	private String artista;
	private int duracion; // en minutos

	// CONSTRUCTORES
	public Cancion() {
		super();
		this.titulo = "";
		this.artista = "";
		this.duracion = 0;

	}

	public Cancion(String titulo) {
		super();
		this.titulo = titulo;
		this.artista = "";
		this.duracion = 0;

	}

	public Cancion(String titulo, String artista) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = 0;

	}

	public Cancion(String titulo, String artista, int duracion) {
		super();
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;

	}

	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + "]";
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

}
