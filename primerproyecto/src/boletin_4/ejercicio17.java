package boletin_4;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {

		double division, suma=0, num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee un número:");
		num = teclado.nextDouble();

		for (double i = 0; i < num; i++) {
			division = i / 2;
			if (division % 1 != 0) {
				suma = suma + i;
			}
		}
		teclado.close();
		System.out.println("El resultado es " + suma);
	}
}
