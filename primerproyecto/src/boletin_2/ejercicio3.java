package boletin_2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Teclee el primer valor");
		double valor1;
		Scanner teclado = new Scanner(System.in);
		valor1 = teclado.nextDouble();
		System.out.println("Teclee el segundo valor");
		double valor2;
		Scanner teclado2 = new Scanner(System.in);
		valor2 = teclado2.nextDouble();

		double suma = valor1 + valor2;
		double resta = valor1 - valor2;
		double producto = valor1 * valor2;
		double division = valor1 / valor2;

		System.out.println(valor1 + " + " + valor2 + " = " + suma);
		System.out.println(valor1 + " - " + valor2 + " = " + resta);
		System.out.println(valor1 + " * " + valor2 + " = " + producto);
		System.out.println(valor1 + " / " + valor2 + " = " + division);
		teclado.close();
		teclado2.close();
	}

}
