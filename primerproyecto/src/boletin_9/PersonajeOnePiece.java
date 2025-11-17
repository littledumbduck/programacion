package boletin_9;

public class PersonajeOnePiece {
	
	String nombre;
	long recompensa;
	String frutaDelDiablo;
	String tripulacion;
	String posicion;
	boolean haki;
	String especie;
	
	public PersonajeOnePiece () {
		this.nombre= "";
		this.recompensa = 0;
		this.frutaDelDiablo = "";
		this.tripulacion = "";
		this.posicion = "";
		this.haki = false;
		this.especie = "";
	}
	
	public PersonajeOnePiece (String nombre, long recompensa, String frutaDelDiablo, String tripulacion, String posicion, boolean haki, String especie) {
		this.nombre= nombre;
		this.recompensa = recompensa;
		this.frutaDelDiablo = frutaDelDiablo;
		this.tripulacion = tripulacion;
		this.posicion = posicion;
		this.haki = haki;
		this.especie = "";
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public long getRecompensa() {
		return recompensa;
	}

	public String getFrutaDelDiablo() {
		return frutaDelDiablo;
	}

	public String getTripulacion() {
		return tripulacion;
	}

	public String getPosicion() {
		return posicion;
	}

	public boolean isHaki() {
		return haki;
	}

	public String getEspecie() {
		return especie;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setRecompensa(long recompensa) {
		this.recompensa = recompensa;
	}

	public void setFrutaDelDiablo(String frutaDelDiablo) {
		this.frutaDelDiablo = frutaDelDiablo;
	}

	public void setTripulacion(String tripulacion) {
		this.tripulacion = tripulacion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public void setHaki(boolean haki) {
		this.haki = haki;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	//Methods
	public void incrementarRecompensa(long value) {
		this.recompensa = this.recompensa + value;
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Recompensa: " + this.recompensa);
		System.out.println("Fruta del diablo: " + this.frutaDelDiablo);
		System.out.println("Tripulación: " + this.tripulacion);
		System.out.println("Posición: " + this.posicion);
		System.out.println("Haki: " + this.haki);
	}
	
	public boolean esPeligroso () {
		if (this.recompensa >= 1000000 || haki == true) {
			return true;
		} else {
			return false;
		}
	}
	
}
