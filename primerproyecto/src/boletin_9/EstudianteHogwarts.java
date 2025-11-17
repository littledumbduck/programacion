package boletin_9;

public class EstudianteHogwarts {
	
	private String nombre;
	private String casa;
	private int curso;
	private int puntosCasa;
	private int pocionesHechas;
	private double dominioVarita;
	
	public EstudianteHogwarts() {
		this.casa = "";
		this.curso = 1;
		this.puntosCasa = 0;
		this.pocionesHechas = 0;
		this.dominioVarita = 0.5;
	}
	
	public EstudianteHogwarts(String nombre, String casa, int curso, int puntosCasa, int pocionesHechas, double dominioVarita) {
		this.casa = casa;
		this.curso = curso;
		this.puntosCasa = puntosCasa;
		this.pocionesHechas = pocionesHechas;
		this.dominioVarita = dominioVarita;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public String getCasa() {
		return casa;
	}

	public int getCurso() {
		return curso;
	}

	public int getPuntosCasa() {
		return puntosCasa;
	}

	public int getPocionesHechas() {
		return pocionesHechas;
	}

	public double getDominioVarita() {
		return dominioVarita;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCasa(String casa) {
		this.casa = casa;
	}

	public void setCurso(int curso) {
		if (curso > 0 && curso < 8) {
			this.curso = curso;
		} else {
			System.out.println("El curso no existe.");
		}
	}

	public void setPuntosCasa(int puntosCasa) {
		this.puntosCasa = puntosCasa;
	}

	public void setPocionesHechas(int pocionesHechas) {
		if (pocionesHechas > 0) {
			this.pocionesHechas = pocionesHechas;
		} else {
			System.out.println("El número no es válido.");
		}
	}

	public void setDominioVarita(double dominioVarita) {
		if (dominioVarita >= 0) {
			this.dominioVarita = dominioVarita;
		} else {
			System.out.println("El número no puede ser negativo.");
		}
	}
	
	// Methods
	public void ganarPuntos(int value) {
		this.puntosCasa = this.puntosCasa + value;
		System.out.println("Se ha incrementado " + value + " puntos. Hay un total de " + this.puntosCasa + " puntos.");
	}
	
	public void hacerPocion() {
		this.pocionesHechas++;
		System.out.println("Poción hecha exitosamente. " + this.pocionesHechas + " pociones hechas en total.");
	}
	
	public void practicarConVarita() {
		if (this.dominioVarita <= 10) {
			this.dominioVarita = this.dominioVarita + 0.1;
		} else {
			System.out.println("El dominio de varita no se puede aumentar más.");
		}
		if (this.dominioVarita > 10) {
			this.dominioVarita = 10;
		}	
	}
	
	public void mostrarPerfilEstudiante() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Casa: " + this.casa);
		System.out.println("Curso: " + this.curso);
		System.out.println("Puntos de la casa: " + this.puntosCasa);
		System.out.println("Pociones hechas: " + this.pocionesHechas);
		System.out.println("Dominio de varita: " + this.dominioVarita);
	}
	
	public void asistirAClases() {
		switch (this.curso) {
		case 1:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.1;
			break;
		case 2:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.2;
			
			break;
		case 3:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.3;
			break;
		case 4:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.4;
			break;
		case 5:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.5;
			break;
		case 6:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.6;
			break;
		case 7:
			this.pocionesHechas++;
			this.dominioVarita = this.dominioVarita + 0.7;
			break;
		}
		System.out.println("Clase asistida. Tienes un total de " + this.pocionesHechas + " y tu dominio de varita es de " + this.dominioVarita + ".");
	}

	// toString
	public String toString() {
		return "EstudianteHogwarts [nombre=" + nombre + ", casa=" + casa + ", curso=" + curso + ", puntosCasa="
				+ puntosCasa + ", pocionesHechas=" + pocionesHechas + ", dominioVarita=" + dominioVarita + "]";
	}
	
}
