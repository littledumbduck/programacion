package boletin_7;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int mayor;
		int menor;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduce un número:");
			arr[i] = sc.nextInt();
			
		}
		mayor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > mayor) {
				mayor = arr[i];
			}
		}
		menor = arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] < menor) {
				menor = arr[i];
			}
		}
		
		System.out.println("El numero mayor es " + mayor + " y el número menor es " + menor + ".");
		sc.close();
	}

}
