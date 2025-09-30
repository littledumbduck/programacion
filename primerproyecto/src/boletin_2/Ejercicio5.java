package boletin_2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distancia;
		System.out.println("Introduzca la distancia en millas:");
		Scanner teclado = new Scanner(System.in);
		distancia = teclado.nextDouble();
		double resultado = distancia * 1852;
		System.out.println(distancia + " millas son " + resultado + " metros.");

		teclado.close();

	}

}
