package boletin_3;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		
		int grados;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee la temperatura en grados:");
		grados = teclado.nextInt();
		
		if (grados>30) {
			System.out.println("La actividad recomendada es piscina.");
		} else {
			if (grados>20) {
				System.out.println("La actividad recomendada es jugar al fútbol.");
			} else {
				if (grados>10) {
					System.out.println("La actividad recomendada es gimnasio.");
				} else {
					System.out.println("La actividad recomendada es esquiar.");
				}
			}
		}
		teclado.close();
	}

}
