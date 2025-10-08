package boletin_6;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {

		int n;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga un número del 1 al 9:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			resultado = resultado * 10 + n;
			System.out.println(resultado);
		}
		for (int i = 1; i < n; i++) {
			resultado = resultado / 10;
			System.out.println(resultado);

		}
	}
}
