package boletin_9;

public class MainOnePiece {

	public static void main(String[] args) {
		
		PersonajeOnePiece david = new PersonajeOnePiece("David", 1000000, "Manzana", "DAM", "Capitan", true, "Sirena");
		PersonajeOnePiece laura = new PersonajeOnePiece("Laura", 50000, "Pera", "DAM", "Navegante", false, "Humano");
		PersonajeOnePiece marta = new PersonajeOnePiece("Marta", 200000, "Platano", "DAM", "Cocinero", false, "");
		
		laura.incrementarRecompensa(1000000);
		
		System.out.println(david.esPeligroso());
		System.out.println(laura.esPeligroso());
		System.out.println(marta.esPeligroso());
	}

}
