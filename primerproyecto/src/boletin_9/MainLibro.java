package boletin_9;

public class MainLibro {

	public static void main(String[] args) {
		
		Libro x = new Libro();
		
		x.setTitulo("El niño con el pijama de Rayas");
		x.setAutor("Antonio");
		x.setEditorial("Editorial MEDAC");
		x.setAnioPublicacion(1990);
		x.setEstaPrestado(false);
		
		x.informacionLibro();
		
		x.prestarLibro();
		
		x.informacionLibro();
		
		x.devolverLibro();
		
		x.informacionLibro();
	}

}
