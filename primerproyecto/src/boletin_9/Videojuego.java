package boletin_9;

public class Videojuego {

	private String nombre;
	private String plataforma;
	private String genero;
	private double precio;
	private int calificacionEdad;
	private int cantidadEnStock;

	public Videojuego() {
		precio = 0;
		calificacionEdad = 3;
		cantidadEnStock = 0;
	}

	public Videojuego(String nombre, String plataforma, String genero, double precio, int calificacionEdad,
			int cantidadEnStock) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.genero = genero;
		this.precio = precio;
		this.calificacionEdad = calificacionEdad;
		this.cantidadEnStock = cantidadEnStock;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCalificacionEdad() {
		return calificacionEdad;
	}

	public int getCantidadEnStock() {
		return cantidadEnStock;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		} else {
			System.out.println("El valor no puede ser negativo.");
		}
	}

	public void setCalificacionEdad(int calificacionEdad) {
		if (calificacionEdad >= 0) {
			this.calificacionEdad = calificacionEdad;
		} else {
			System.out.println("El valor no puede ser negativo.");
		}
	}

	public void setCantidadEnStock(int cantidadEnStock) {
		if (cantidadEnStock >= 0) {
			this.cantidadEnStock = cantidadEnStock;
		} else {
			System.out.println("El valor no puede ser negativo.");
		}
	}

	// Methods
	public void venderCopias(int value) {
		this.cantidadEnStock = this.cantidadEnStock - value;
		System.out.println("Se han vendido " + value + " copias. Ahora quedan " + this.cantidadEnStock);
	}

	public void reabastecerStock(int value) {
		this.cantidadEnStock = this.cantidadEnStock + value;
		System.out.println("Se han reabastecido " + value + " copias. Ahora quedan " + this.cantidadEnStock);
	}

	public void actualizarPrecio(double value) {
		this.precio = value;
		System.out.println("El precio ahora es de " + this.precio);
	}

	public boolean esAptoParaMenores() {
		if (this.calificacionEdad <= 12) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Plataforma: " + this.plataforma);
		System.out.println("Género: " + this.genero);
		System.out.println("Precio: " + this.precio);
		System.out.print("¿Es para menores? ");
		if (this.esAptoParaMenores() == true) {
			System.out.println("sí.");
		} else {
			System.out.println("no.");
		}
		System.out.println("Cantidad en stock: " + this.cantidadEnStock);
	}
	
	public void descuentoEspecial(double value) {
		this.precio = this.precio * (100 - value) / 100;
		System.out.println("Se ha aplicado un " + value + "% de descuento y el juego cuesta ahora " + this.precio + "€.");
	}

	// toString
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", plataforma=" + plataforma + ", genero=" + genero + ", precio="
				+ precio + ", calificacionEdad=" + calificacionEdad + ", cantidadEnStock=" + cantidadEnStock + "]";
	}
}
