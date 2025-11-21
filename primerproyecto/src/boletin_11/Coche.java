package boletin_11;

public class Coche extends Vehiculo {
	
	private int numeroDePuertas;
	private String tipoDeCombustible;
	
	// Constructors
	public Coche() {
		super();
		this.numeroDePuertas = 2;
		this.tipoDeCombustible = "";
	}
	
	public Coche(String marca, String modelo, int anio, int numeroDePuertas, String tipoDeCombustible) {
		super(marca, modelo, anio);
		this.numeroDePuertas = numeroDePuertas;
		this.tipoDeCombustible = tipoDeCombustible;
	}

	// Getters
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}

	public String getTipoDeCombustible() {
		return tipoDeCombustible;
	}
	
	// Setters
	public void setNumeroDePuertas(int numeroDePuertas) {
		this.numeroDePuertas = numeroDePuertas;
	}

	public void setTipoDeCombustible(String tipoDeCombustible) {
		this.tipoDeCombustible = tipoDeCombustible;
	}
	
	// Methods
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Número de puertas: " + this.numeroDePuertas);
		System.out.println("Tipo de combustible: " + this.tipoDeCombustible);
	}
}
