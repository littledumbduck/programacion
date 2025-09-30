package boletin_3;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {

		int edad;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee la edad:");
		edad = teclado.nextInt();
		
		if (edad<12) {
			System.out.println("El precio de la entrada junior es de 10€.");
		} else {
			if (edad<65) {
				System.out.println("El precio de la entrada adulta es de 15€.");
			} else {
				System.out.println("El precio de la entrada senior es de 12€.");
			}
		}
		teclado.close();
	}

}
