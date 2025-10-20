package boletin_7;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Introduce un número:");
			arr[i] = sc.nextInt();
		}

		for (int j = (arr.length - 1); j > 0; j--) {
			System.out.println(arr[j]);
		}
		sc.close();
	}

}
