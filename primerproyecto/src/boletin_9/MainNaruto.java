package boletin_9;

public class MainNaruto {

	public static void main(String[] args) {
		
		NinjaNaruto naruto = new NinjaNaruto();
		
		naruto.setNombre("Naruto");
		naruto.setAldea("Sevilla Este");
		naruto.setRango("Jefe");
		naruto.setChakra(1000);
		naruto.setJutsuPrincipal("No se que es esto");
		
		naruto.mostrarInformacion();
		
		naruto.realizarMision();
		
		naruto.mostrarInformacion();
		
		naruto.recargarChakra();
		
		naruto.mostrarInformacion();
	}

}
