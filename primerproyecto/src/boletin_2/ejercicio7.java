package boletin_2;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso, altura, imc;

		System.out.println("Teclee su altura en cm:");

		Scanner teclado = new Scanner(System.in);
		altura = teclado.nextDouble();

		System.out.println("Teclee su peso en kg:");
		peso = teclado.nextDouble();

		imc = peso / Math.pow((altura / 100), 2);
		System.out.println("El IMC es " + imc + ".");
		teclado.close();
	}

}
