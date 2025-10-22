package boletin_7;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		
		int[] num = new int[8];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Introduce un número:");
			num[i] = sc.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.println(num[i] + " es impar.");
			} else {
				System.out.println(num[i] + " es par.");
			}
		}
		sc.close();
	}

}
