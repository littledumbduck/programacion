package boletin_9;

public class MainTikTok {

	public static void main(String[] args) {
		
		TikTokVideo bailecito = new TikTokVideo("12", "newuser", 66, 123, 1, "esto es una descripcion", "esto son los hashtags");
		
		System.out.println(bailecito);
		
		bailecito.darLike();
		bailecito.comentar();
		bailecito.comentar();
		bailecito.comentar();
		bailecito.comentar();
		
		bailecito.mostrarEstadisticas();
	}
}