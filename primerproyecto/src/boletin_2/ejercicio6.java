package boletin_2;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		double celsius;
		System.out.println("Introduce la temperatura en grados celsius;");
		
		Scanner teclado = new Scanner(System.in);
		celsius = teclado.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("La temperatura en grados fahrenheit es de " + fahrenheit + "º.");
		teclado.close();

	}

}
