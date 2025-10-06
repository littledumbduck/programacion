package boletin_5;

import java.util.Scanner;

import boletin_4.Ejercicio09;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Di el número primo");
		num = sc.nextDouble();
		Ejercicio09.Primo(num);
		sc.close();
		
	}
	
	public static void Primo(double num) {
		
		int resultado = 0;
		String primo;
		
		for (int i = 1; i <= num; i++) {

			double division = num / i;

			if (division % 1 == 0) {
				resultado++;
			}

		}

		if (resultado > 2) {
			primo = "No es primo";
		} else {
			primo = "Es primo";
		}
		System.out.println(primo);
		
	}

}
