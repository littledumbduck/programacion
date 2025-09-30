package boletin_3;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {

		double num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee el primer número:");
		num1 = teclado.nextDouble();
		
		System.out.println("Teclee el segundo número:");
		num2 = teclado.nextDouble();
		
		if (num1>num2) {
			System.out.println(num1 + " es mayor que " + num2);
		} else {
			if (num1==num2) {
				System.out.println(num1 + " es igual que " + num2);
			} else {
				System.out.println(num1 + " es menor que " + num2);
			}
		}
		teclado.close();
	}

}
