package boletin_9;

public class MainVideojuego {

	public static void main(String[] args) {
		
		Videojuego dbd = new Videojuego();
		
		dbd.setNombre("Dead by Daylight");
		dbd.setGenero("Terror");
		dbd.setPlataforma("Todas");
		dbd.setPrecio(20.50);
		dbd.setCalificacionEdad(16);
		dbd.setCantidadEnStock(13);
		
		System.out.println(dbd);
		
		dbd.venderCopias(1);
		System.out.println(dbd);
		
		dbd.reabastecerStock(3);
		System.out.println(dbd);
		
		dbd.actualizarPrecio(18.5);
		
		dbd.mostrarInformacion();
		
		dbd.descuentoEspecial(20);
	}

}
