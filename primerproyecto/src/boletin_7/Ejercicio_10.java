package boletin_7;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {

		// attrb
		double[] intp = new double[10];
		double[] finalres = new double[10];
		Scanner sc = new Scanner(System.in);
		boolean primo;
		int contador = 0;

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
		for (int i = 0; i < finalres.length; i++) {
			
			primo = esPrimo(intp[i]);
			
			if (primo == true) {
				finalres[contador] = intp[i];
				contador++;
			}
			
		}


		// for to place non prime numbers
		for (int i = 0; i < finalres.length; i++) {
			
			primo = esPrimo(intp[i]);
			
			if (primo == false) {
				finalres[contador] = intp[i];
				contador++;
			}
			
		}


		// Print final array
		for (int i = 0; i < finalres.length; i++) {
			System.out.println(finalres[i] + " | ");
		}

	}
	
	public static boolean esPrimo(double intp) {
		
		int resultado = 0;
		boolean primo;
		
		for (int i = 1; i <= intp; i++) {

			double division = intp / i;

			if (division % 2 == 0) {
				resultado++;
			}

		}

		if (resultado > 2) {
			primo = true;
		} else {
			primo = false;
		}
		return primo;
	}
	
}
