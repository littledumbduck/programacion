package boletin_4;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int combinacion = 5982;
		int entrada;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 3; i > -1; i = i - 1) {
			
			System.out.println("Introduce la combinación de la caja fuerte:");
			entrada = teclado.nextInt();
			
			if (entrada == combinacion) {
				System.out.println("La combinación es correcta");
				i = -2;
			} else {
				System.out.println("La combinación no es correcta. Te quedan " + i + " intentos.");
			}
			
		}
		teclado.close();
	}
}
