package boletin_7;

import java.util.Random;

public class Ejercicio_09v2 {

	public static void main(String[] args) {

		int[] cadena = new int[20];
		Random r = new Random();
		int contpar = 0;
		int contimpar = 0;

		for (int i = 0; i < cadena.length; i++) {
			cadena[i] = r.nextInt(101);
		}

		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i] % 2 == 1) {
				contimpar++;
			} else {
				contpar++;
			}
		}

		int[] cadenapar = new int[contpar];
		int[] cadenaimpar = new int[contimpar];
		int ordenimpar = 0;
		int ordenpar = 0;

		for (int i = 0; i < cadena.length; i++) {

			if (cadena[i] % 2 == 1) {
				cadenaimpar[ordenimpar] = cadena[i];
				ordenimpar++;
			} else {
				cadenapar[ordenpar] = cadena[i];
				ordenpar++;
			}
		}
		System.out.println("Números impares:");
		for (int i = 0; i < cadenaimpar.length; i++) {
			System.out.println(cadenaimpar[i]);
		}
		System.out.println("Números pares:");
		for (int i = 0; i < cadenapar.length; i++) {
			System.out.println(cadenapar[i]);
		}
	}

}
