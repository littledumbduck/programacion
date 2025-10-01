package boletin_4;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {

		int num, total = 0;
		int media = 0;
		int numerodenotas = 0, positivo = 0;
		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Teclee la nota:");
			num = teclado.nextInt();

			total = total + num;
			numerodenotas++;
			media = total / numerodenotas;

			if (num > media) {
				positivo++;
			}

		}

		teclado.close();
		System.out.println("La media de notas es " + media + " y las notas superiores a la media es de " + positivo + " notas.");

	}

}
