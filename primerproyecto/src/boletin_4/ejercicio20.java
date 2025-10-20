package boletin_4;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {

		double[] arr1 = new double[10];
		double media = 0;
		int positivo = 0;
		double suma = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Introduzca una nota:");
			arr1[i] = sc.nextDouble();
			suma = suma + arr1[i];
		}

		media = suma / 10;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] >= media) {
				positivo++;
			}
		}

		System.out.println("La media de todas las notas es de " + media + ".");
		System.out.println("Hay " + positivo + " notas mayores que la media.");
		System.out.println(arr1.length);
		sc.close();
	}

}
