package boletin_8;

import java.util.Random;

public class Ejercicio_06 {

	public static void main(String[] args) {
		
		int[][] num = new int[6][10];
		Random r = new Random();
		int max = 0;
		int min = 1000;
		int columna, fila;
		boolean bucle;
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 6; j++) {
									
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 6; j++) {
				if (num[j][i] > max) {
					max = num[j][i];
				}
			}
		}
		
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 6; j++) {
				if (num[j][i] < min) {
					min = num[j][i];
				}
			}
		}
		
		System.out.println("Maximo = " + max);
		System.out.println("Mínimo = " + min);
	}

}
