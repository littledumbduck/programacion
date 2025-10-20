package boletin_6;

import java.util.*;

public class Funciones {

	public static void ContarHoras() {
		Scanner sc = new Scanner(System.in);
		int horas, minutos, segundos;
		System.out.println("Teclee las horas:");
		horas = sc.nextInt();
		System.out.println("Teclee los minutos:");
		minutos = sc.nextInt();
		System.out.println("Teclee los segundos:");
		segundos = sc.nextInt();
		segundos++;
		if (segundos >= 60) {
			segundos = 0;
			minutos++;
			if (minutos >= 60) {
				minutos = 0;
				horas++;
			}
		}
		System.out.println(
				"El resultado sería " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
	}

	public static void Casino() {

		int bucle = 0;
		int opcionCasino;
		while (bucle == 0) {
			int tirada1 = 0;
			int tirada2 = 0;
			Random r = new Random();
			tirada1 = r.nextInt(7);
			tirada2 = r.nextInt(7);

			if (tirada1 == 6 && tirada2 == 6) {
				System.out.println("Excelente");
			} else if (tirada1 == 6 || tirada2 == 6) {
				System.out.println("Muy bien.");
			} else {
				System.out.println("El valor de las tiradas han sido " + tirada1 + " y " + tirada2 + ".");
			}

			System.out.println("¿Quieres volver a intentarlo? \n 1. Sí \n 2. No");
			Scanner sc = new Scanner(System.in);
			opcionCasino = sc.nextInt();

			switch (opcionCasino) {
			case 1:
				bucle = 0;
				break;
			case 2:
				bucle = 1;
				break;
			default:
				System.out.println("Error.");
				break;
			}
		}
	}

	public static void Triangulos() {
		int n;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Diga un número del 1 al 9:");
		n = sc.nextInt();
		if (n < 19) {
			for (int i = 0; i < n; i++) {
				resultado = resultado * 10 + n;
				System.out.println(resultado);
			}
			for (int i = 1; i < n; i++) {
				resultado = resultado / 10;
				System.out.println(resultado);

			}
		} else {
			System.out.println("No se puede hacer una pirámide de un número mayor que 9.");
		}
	}

}
