package boletin_2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lado1;
		System.out.println("Introduce el valor del lado X");
		Scanner teclado = new Scanner(System.in);
		lado1 = teclado.nextDouble();
		double lado2;
		System.out.println("Introduce el valor del lado Y");
		Scanner teclado2 = new Scanner(System.in);
		lado2 = teclado2.nextDouble();

		double area = lado1 * lado2;

		System.out.println("El área del cuadrado es de " + area + " metros al cuadrado.");
		teclado.close();
		teclado2.close();
	}

}
