package boletin_11;

public class Vehiculo {

	private String marca;
	private String modelo;
	private int anio;
	
	// Constructores
	public Vehiculo () {
		this.marca = "";
		this.modelo = "";
		this.anio = 0;
	}
	
	public Vehiculo (String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	// Getters
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnio() {
		return anio;
	}
	
	// Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	// toString
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	}
	
	// Methods
	public void mostrarInfo() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Año de fabricación: " + this.anio);
	}
	
}
