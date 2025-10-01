package boletin_4;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		int num, suma = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Teclee un número:");
		num = teclado.nextInt();

		for (int i = 0; i < num; i++) {
			suma = suma + (i + i);
		}
		System.out.println("El resultado es:" + suma);
	}

}
