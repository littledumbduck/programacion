package boletin_4;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		
		int num;
		int d = 0;
		int r = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee un número:");
		num = teclado.nextInt();
		
		while (num != 0) {
			d = num % 10;
			num = num / 10;
			
			if (r == 0) {
				r = d;
			} else {
				r = (r * 10) + d;
			}
		}
		System.out.println(r);
		teclado.close();
		
	}

}
