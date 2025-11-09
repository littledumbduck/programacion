package boletin_9;

import java.util.Scanner;

public class Lampara {
	
	//Attributes
	private boolean encendida;
	private int intensidad;
	
	//Constructors
	public Lampara() {
		this.encendida = true;
		this.intensidad = 5;
	}
	
	public Lampara(boolean encendida, int intensidad) {
		this.encendida = encendida;
		this.intensidad = intensidad;
	}
	
	//Getters
	public boolean isEncendida() {
		return encendida;
	}
	
	public int getIntensidad() {
		return intensidad;
	}

	//Setters
	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}
	
	//Methods
	public void interruptor() {
		this.encendida = !this.encendida;
	}

	public void cambiarIntensidad() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nueva intensidad: ");
		this.intensidad = sc.nextInt();
	}
	
	public void mostrarEstado() {
		System.out.println("La intesidad de la luz es de " + intensidad + ".");
	}
}