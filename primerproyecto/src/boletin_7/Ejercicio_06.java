package boletin_7;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {

		int[] num = new int[15];
		Scanner sc = new Scanner(System.in);
		int rot;

		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduzca un número:");
			num[i] = sc.nextInt();
		}

		rot = num[num.length - 1];
		for (int i = num.length - 1; i > 0; i--) {
			num[i] = num[i - 1];
		}
		num[0] = rot;

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		sc.close();
	}

}
