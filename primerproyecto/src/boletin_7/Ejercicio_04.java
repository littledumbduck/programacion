package boletin_7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {

		int[] numero = new int[20];
		int[] cuadrado = new int[20];
		int[] cubo = new int[20];
		int rand;
		Scanner sc = new Scanner(System.in);
		Random r = new Random ();
		
		for (int i = 0; i < cubo.length; i++) {
			rand = r.nextInt(101);
			numero[i] = rand;
			cuadrado[i] = (int) Math.pow(rand, 2);
			cubo[i] = (int) Math.pow(rand, 3);
			
			System.out.print(numero[i] + cuadrado[i] + cubo[i] + "\n");
		}
		sc.close();
	}

}
