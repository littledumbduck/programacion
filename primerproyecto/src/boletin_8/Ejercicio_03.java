package boletin_8;

import java.util.Random;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[5][4];
		Random r = new Random();
		
		System.out.println("Teclee 20 números:");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[j][i] = r.nextInt(100, 999);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num[j][i] + " | ");
			}
			System.out.print("\n");
		}
	}

}