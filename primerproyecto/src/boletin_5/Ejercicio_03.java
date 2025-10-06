package boletin_5;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		
		int num, suma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		num = sc.nextInt();
		
		
		if (EsPositivo(num)) {
			suma = Suma(num);
			System.out.println("El resultado es " + suma);
		} else {
			System.out.println("El número es negativo.");
		}
		sc.close();
		
	}
	
	public static boolean EsPositivo(int numero) {
		boolean positivo;
		if (numero>=0) {
			positivo = true;
		} else {
			positivo = false;
		}
		return positivo;
	}
	
	public static int Suma(int numero) {
		int suma = 0;
		for (int i = 0; i <= 100; i++) {
			suma = suma + numero;
			numero++;
		}
		return suma;
	}

}
