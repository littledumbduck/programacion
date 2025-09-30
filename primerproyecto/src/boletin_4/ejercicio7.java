package boletin_4;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double media = 0;
		double numero = 0;
		double cantidad = 0;

		System.out.println("Teclee los números:");

		while (numero >= 0) {
			numero = teclado.nextDouble();
			if (numero >= 0) {
				media = numero + media;
				cantidad++;
				System.out.println("Teclee el siguiente número:");
			}
		}

		double resultado = media / cantidad;

		System.out.println("La media de todos los números es " + resultado);
		teclado.close();
	}

}
