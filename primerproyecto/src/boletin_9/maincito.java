package boletin_9;

public class maincito {

	public static void main(String[] args) {
		
		Futbolista cristiano = new Futbolista ("Cristiano", "Jaen", 42, "Delantero", 7);
		Equipo sevEst = new Equipo("Sevilla Este");
		
		//cristiano.mostrarInformacion();
		
		
		for (int i = 0; i < sevEst.getTamano(); i++) {
			sevEst.anadirFutbolista(cristiano);
		}

		sevEst.muestraPlantilla();
		
		sevEst.anadirFutbolista(cristiano);
		
	}

}
