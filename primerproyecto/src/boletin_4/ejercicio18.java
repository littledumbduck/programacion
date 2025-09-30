package boletin_4;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {

		int num = 1;
		int suma = 0;
		Scanner teclado = new Scanner(System.in);

		while (num > 0) {
			System.out.println("Teclee un número:");
			num = teclado.nextInt();

			if (num > 0) {
				suma = suma + num;
			}
			
		}
		System.out.println("La suma de todos los números es " + suma + ".");
		teclado.close();
	}

}
