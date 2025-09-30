package boletin_3;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		double numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee un número:");
		numero = teclado.nextInt();
		
		double exponente = Math.sqrt(numero);
		
		if (exponente %1 == 0) {
			System.out.println(exponente);
		} else {
			System.out.println("No se puede resolver como dos números enteros.");
		}
		teclado.close();
	}

}
