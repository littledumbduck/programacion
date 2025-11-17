package boletin_9;

public class MainLaVoz {

	public static void main(String[] args) {
		
		ConcursanteLaVoz aitana = new ConcursanteLaVoz("Aitana", 21, "Pop", "Elena", "Primera fase", false);
		
		aitana.mostrarPerfil();
		
		aitana.salvarConcursante();
		
		
	}
}