package boletin_9;

public class NinjaNaruto {

	private String nombre;
	private String aldea;
	private String rango;
	private int chakra;
	private String jutsuPrincipal;
	private int misionesCompletadas;

	public NinjaNaruto() {
		this.nombre = "";
		this.aldea = "";
		this.rango = "";
		this.chakra = 0;
		this.jutsuPrincipal = "";
		this.misionesCompletadas = 0;
	}

	public NinjaNaruto(String nombre, String aldea, String rango, int chakra, String jutsuPrincipal,
			int misionesCompletadas) {
		super();
		this.nombre = nombre;
		this.aldea = aldea;
		this.rango = rango;
		this.chakra = chakra;
		this.jutsuPrincipal = jutsuPrincipal;
		this.misionesCompletadas = misionesCompletadas;
	}

	// Getters
	public String getNombre() {
		return nombre;
	}

	public String getAldea() {
		return aldea;
	}

	public String getRango() {
		return rango;
	}

	public int getChakra() {
		return chakra;
	}

	public String getJutsuPrincipal() {
		return jutsuPrincipal;
	}

	public int getMisionesCompletadas() {
		return misionesCompletadas;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setAldea(String aldea) {
		this.aldea = aldea;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public void setChakra(int chakra) {
		this.chakra = chakra;
	}

	public void setJutsuPrincipal(String jutsuPrincipal) {
		this.jutsuPrincipal = jutsuPrincipal;
	}

	// Methods
	public void realizarMision() {
		this.misionesCompletadas++;
		this.chakra = this.chakra + 10;
	}

	public void recargarChakra() {
		this.chakra = this.chakra + 100;
	}

	public void mostrarInformacion() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Aldea: " + this.aldea);
		System.out.println("Rango: " + this.rango);
		System.out.println("chakra: " + this.chakra);
		System.out.println("Jutsu principal: " + this.jutsuPrincipal);
		System.out.println("Misiones completadas: " + this.misionesCompletadas);
	}
}
