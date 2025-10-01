package boletin_4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		int num;
		int fac = 1;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Teclee un número:");
		num = teclado.nextInt();
				
		for (int i = 1; i <= num; i++) {
			fac = fac * i;
		}
		
		System.out.println("El resultado es: " + fac);
		teclado.close();
	}

}
