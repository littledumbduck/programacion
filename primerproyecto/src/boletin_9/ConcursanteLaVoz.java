package boletin_9;

public class ConcursanteLaVoz {

	private String nombre;
	private int edad;
	private String generoMusical;
	private String coach;
	private String faseActual;
	private boolean haSidoSalvado;
	
	//Constructors
	public ConcursanteLaVoz() {
		String nombre = "";
		int edad = 0;
		String generoMusical = "";
		String coach = "";
		String faseActual = "";
		boolean haSidoSalvado = false;
	}
	
	public ConcursanteLaVoz(String nombre, int edad, String generoMusical, String coach, String faseActual, boolean haSidoSalvado) {
		nombre = nombre;
		edad = edad;
		generoMusical = generoMusical;
		coach = coach;
		faseActual = faseActual;
		haSidoSalvado = haSidoSalvado;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public String getCoach() {
		return coach;
	}

	public String getFaseActual() {
		return faseActual;
	}

	public boolean isHaSidoSalvado() {
		return haSidoSalvado;
	}
	
	//Setters
	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public void setFaseActual(String faseActual) {
		this.faseActual = faseActual;
	}

	public void setHaSidoSalvado(boolean haSidoSalvado) {
		this.haSidoSalvado = haSidoSalvado;
	}
	
	//Methods
	public void avanzarFase(String nuevaFase) {
		faseActual = nuevaFase;
	}
	
	public void salvarConcursante() {
		haSidoSalvado = true;
	}
	
	public void esEliminado() {
		haSidoSalvado = false;
		faseActual = "eliminado";
	}
	
	public void mostrarPerfil() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Género musical: " + generoMusical);
		System.out.println("Coach: " + coach);
		System.out.println("Fase actual: " + faseActual);
		System.out.println("¿Está salvado?: " + haSidoSalvado);
	}
	
	
	
	
	
	
}
