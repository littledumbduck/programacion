package boletin_3;

import java.util.*;

public class ejercicio4 {

	public static void main(String[] args) {
		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Teclee el número:");
		numero = teclado.nextInt();
		
		if (numero >= 0) {
			System.out.println("El número es positivo.");
		} else {
			System.out.println("El número es negativo.");
		}
		teclado.close();
	}

}
