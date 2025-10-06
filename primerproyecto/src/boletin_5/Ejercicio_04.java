package boletin_5;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee un número:");
		num = teclado.nextInt();
		
		AlReves(num);
		teclado.close();
		
	}

	public static void AlReves(int num) {

		int d = 0;
		int r = 0;
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
		
	}
	
}
