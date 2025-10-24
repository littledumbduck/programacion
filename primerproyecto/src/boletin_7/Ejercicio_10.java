package boletin_7;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {

		// attrb
		double[] intp = new double[10];
		double[] finalres = new double[10];
		Scanner sc = new Scanner(System.in);
		double division = 0;
		int contadorprimo = 0;
		int orden = 0;

		// 10 Scanners for intp
		for (int i = 0; i < intp.length; i++) {
			System.out.println("Escribe 10 números:");
			intp[i] = sc.nextDouble();
		}

		// print array
		for (int i = 0; i < intp.length; i++) {
			System.out.println(intp[i] + " | ");
			
		}

		// for to place prime numbers



		// for to place non prime numbers



		// Print final array
		for (int i = 0; i < finalres.length; i++) {
			System.out.println(finalres[i] + " | ");
		}

	}

}
