package boletin_9;

public class Libro {

	private String titulo;
	private String autor;
	private String editorial;
	private int anioPublicacion;
	private boolean estaPrestado;

	public Libro() {
		this.titulo = "";
		this.autor = "";
		this.editorial = "";
		this.anioPublicacion = -1;
		this.estaPrestado = false;
	}

	public Libro(String titulo, String autor, String editorial, int anioPublicacion, boolean estaPrestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.anioPublicacion = anioPublicacion;
		this.estaPrestado = estaPrestado;
	}

	// Getters
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public boolean isEstaPrestado() {
		return estaPrestado;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public void setEstaPrestado(boolean estaPrestado) {
		this.estaPrestado = estaPrestado;
	}

	// Methods
	public void prestarLibro() {
		if (this.estaPrestado == false) {
			this.estaPrestado = true;
		} else {
			System.out.println("El libro no está disponible.");
		}
	}

	public void devolverLibro() {
		this.estaPrestado = false;
	}
	
	public void informacionLibro() {
		System.out.println("Nombre: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Editorial: " + this.editorial);
		System.out.println("Año de publicación: " + this.anioPublicacion);
		System.out.print("¿Está prestado?");
		if (estaPrestado) {
			
		} else {

		}
	}

}
