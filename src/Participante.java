
public class Participante {

	// Atributos privados para no ser accesibles desde fuera de la Clase
	private String nombre;
	private String usuarioGit;
	private String email;
	private boolean trabajador;

	// Constructores
	public Participante() {
		super();
		this.nombre = "";
		this.email = "";
		this.usuarioGit = "";
		this.trabajador = false;
	}

	public Participante(String nombre, String usuarioGit) {
		super();
		this.nombre = nombre;
		this.usuarioGit = usuarioGit;
		this.email = "";
		this.trabajador = false;		
	}

	// getters y setters (ENCAPSULAR): para acceder a los atributos y BEAN o
	// POJO(clase con atributos)
	
	
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


	public String toString() {
		return "Participante [nombre=" + this.nombre + ", usuarioGit=" + this.usuarioGit + ", email=" + this.email + ", trabajador="
				+ this.trabajador + "]";
	}

}
