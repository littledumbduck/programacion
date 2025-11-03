package boletin_8;

import java.util.Random;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = new int[5][4];
		Random r = new Random();
		int millis;
		
		System.out.println("Teclee 20 números:");
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num[j][i] = r.nextInt(100, 999);
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(num[j][i] + " | ");
				try {
					Thread.sleep(millis = r.nextInt(100, 3000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.print("\n");
		}
	}

}
