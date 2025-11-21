package boletin_11;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal lomito = new Perro();
		Animal misifu = new Gato();
		Animal x = new Animal();
		
		lomito.hacerSonido();
		misifu.hacerSonido();
		x.hacerSonido();
		
	}

}
