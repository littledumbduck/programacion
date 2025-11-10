package boletin_9;

import java.util.Arrays;

public class Equipo {

	private String nombreEquipo; 
	private Futbolista[] equipo;
	
	//constructors
	public Equipo() {
		nombreEquipo = "";
		equipo = new Futbolista[11];
		for (int i = 0; i < equipo.length; i++) {
			equipo[i] = new Futbolista();
		}
	}
	
	public Equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
		equipo = new Futbolista[11];
		for (int i = 0; i < equipo.length; i++) {
			equipo[i] = new Futbolista();
		}
	}
	
	//getters/setters
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

	//toString
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", equipo=" + Arrays.toString(equipo) + "]";
	}
	
	//Methods
	public void añadirFutbolista() {
		
	}

}
