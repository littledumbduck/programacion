package boletin_9;

public class Futbolista {
	
	//Attributes
	private String nombre;
	private String equipo;
	private int edad;
	private String posicion;
	private int numeroCamiseta;
	
	//Constructors
	public Futbolista(String nombre, String equipo, int edad, String posicion, int numeroCamiseta) {
		this.nombre = nombre;
		this.equipo = equipo;
		this.edad = edad;
		this.posicion = posicion;
		this.numeroCamiseta = numeroCamiseta;
	}
	
	//getters
	public String getNombre() {
		return nombre;
	}
	public String getEquipo() {
		return equipo;
	}
	public int getEdad() {
		return edad;
	}
	public String getPosicion() {
		return posicion;
	}
	public int getNumeroCamiseta() {
		return numeroCamiseta;
	}
	
	//setters
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public void setNumeroCamiseta(int numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}
	
	//Methods
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Equipo: " + this.equipo);
		System.out.println("Edad: " + this.edad);
		System.out.println("Posición: " + this.posicion);
		System.out.println("Número de camiseta: " + this.numeroCamiseta);
	}
	
	public boolean esMayorDeEdad() {
		return this.edad >= 18;
	}
	
	public void cambiarEquipo(String nuevoEquipo) {
		equipo = nuevoEquipo;
		System.out.println("El cambio de equipo a " + nuevoEquipo + " ha sido realizado con éxito.");
	}
	
	public void entrenar() {
		System.out.println("Entrenando");
	}
	
	public double sueldo(double sueldoSinIva) {
		double sueldoConIva = sueldoSinIva * 1.21;
		return sueldoConIva;
	}
	
}
