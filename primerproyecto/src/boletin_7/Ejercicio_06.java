package boletin_7;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {

		int[] arr = new int[15];
		Scanner sc = new Scanner(System.in);
		int sacar;

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduzca un número:");
			arr[i] = sc.nextInt();
		}

		sacar = arr[14];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[0] = sacar;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
