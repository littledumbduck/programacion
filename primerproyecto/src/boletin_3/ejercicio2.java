package boletin_3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		int edad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee la edad:");
		
		edad = teclado.nextInt();
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}
		else {
			System.out.println("No eres mayor de edad.");
		}
		teclado.close();
	}
}
