package boletin_9;

public class maincito {

	public static void main(String[] args) {
		
		Futbolista cristiano = new Futbolista ("Cristiano", "Jaen", 42, "Delantero", 7);
		
		cristiano.mostrarInformacion();
		
		Equipo sevEst = new Equipo("Sevilla Este");
		
		for (int i = 0; i < sevEst.getTamano(); i++) {
			sevEst.anadirFutbolista(cristiano);
		}
		
		
		System.out.println(sevEst.toString());
	}

}
