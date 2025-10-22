package boletin_7;

import java.util.Random;

public class Ejercicio_09 {

	public static void main(String[] args) {
		
		int[] cadena = new int[20];
		Random r = new Random();
		int[] imp = new int[20];
		int[] pa = new int[20];
		
		for (int i = 0; i < cadena.length; i++) {
			cadena[i] = r.nextInt(101);
		}
		
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i] % 2 == 1) {
				imp[i] = cadena[i];
			} else {
				pa[i] = cadena[i];
			}
		}
		
		System.out.println("Números pares:");
		for (int i = 0; i < pa.length; i++) {
			System.out.println(pa[i]);
		}

		System.out.println("Números impares:");
		for (int i = 0; i < pa.length; i++) {
			System.out.println(imp[i]);
		}
	}

}
