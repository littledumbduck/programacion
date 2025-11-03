package boletin_8;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[5][4];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee 20 números:");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[j][i] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num[j][i] + " | ");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
