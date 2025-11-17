package boletin_9;

import java.util.Arrays;

public class Equipo {

	private String nombreEquipo;
	private Futbolista[] equipo;

	// constructors
	public Equipo() {
		this.nombreEquipo = "";
		this.equipo = new Futbolista[11];
	}

	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.equipo = new Futbolista[11];
	}

	// getters/setters
	public Futbolista[] getEquipo() {
		return equipo;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setEquipo(Futbolista[] equipo) {
		this.equipo = equipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	// toString
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", equipo=" + Arrays.toString(equipo) + "]";
	}

	// Methods
	public void anadirFutbolista(Futbolista x) {

		for (int i = 0; i < equipo.length; i++) {
			if (this.equipo[i] == null) {
				equipo[i] = x;
				break;
			} else if (equipo[i] != null && i == (equipo.length - 1)) {
				System.out.println("Equipo completo");
			}
		}

	}

	public int getTamano() {
		return this.equipo.length;
	}
	
	public void muestraPlantilla() {
		for (int i = 0; i < equipo.length; i++) {
			System.out.println(equipo[i]);
			}
	}

}