package boletin_5;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {

		int num;
		System.out.println("Teclee un número");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		Multiplicacion(num);
		
		sc.close();
	}
	
	public static void Multiplicacion(int x) {
		
		for (int i = 0; i <= 10; i++) {
			
			System.out.println(x + " * " + i + " = " + (x*i));
			
		}
		
	}

}
