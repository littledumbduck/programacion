package boletin_3;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {

		double numero1, numero2, numero3;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Teclee el primer número");
		numero1 = teclado.nextDouble();

		System.out.println("Teclee el segundo número");
		numero2 = teclado.nextDouble();

		System.out.println("Teclee el tercer número");
		numero3 = teclado.nextDouble();

		if (numero1 > numero2) {
			if (numero1 > numero3) {
				if (numero2 > numero3) {
					System.out.println(numero1 + " > " + numero2 + " > " + numero3);
				} else {
					System.out.println(numero1 + " > " + numero3 + " > " + numero2);
				}
			} else {
				System.out.println(numero3 + " > " + numero1 + " > " + numero2);
			}
		} else {
			if (numero2 > numero3) {
				if (numero3 > numero1) {
					System.out.println(numero2 + " > " + numero3 + " > " + numero1);
				} else {
					System.out.println(numero2 + " > " + numero1 + " > " + numero1);
				}
			} else {
				System.out.println(numero3 + " > " + numero2 + " > " + numero1);
			}
		}
		teclado.close();
	}

}
