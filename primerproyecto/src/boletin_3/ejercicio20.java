package boletin_3;

import java.util.Scanner;

public class ejercicio20 {

	public static void main(String[] args) {
		int velocidad;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee la velocidad:");
		velocidad = teclado.nextInt();
		
		if (velocidad<50) {
			System.out.println("La velocidad no excede el límite de velocidad de una carretera urbana.");
		} else {
			System.out.println("La velocidad excede el límite de velocidad de una carretera urbana.");
		}

		if (velocidad<90) {
			System.out.println("La velocidad no excede el límite de velocidad de una carretera rural.");
		} else {
			System.out.println("La velocidad excede el límite de velocidad de una carretera rural.");
		}

		if (velocidad<120) {
			System.out.println("La velocidad no excede el límite de velocidad de una autopista.");
		} else {
			System.out.println("La velocidad excede el límite de velocidad de una autopista.");
		}
		
		teclado.close();
		
	}

}
