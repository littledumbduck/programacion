package boletin_2;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		double radio;
		System.out.println("Escribe la longitud del radio en cm:");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextDouble();
		
		double longitud = 2 * 3.14 * Math.pow(radio, 2);
		double area = 3.14 * Math.pow(radio, 2);
		double volumen = 4/3 * 3.14 * Math.pow(radio, 2);
		
		System.out.println("La longitud del círculo es de " + longitud + "cm.");
		System.out.println("El área del círculo es de " + area + " centímetros al cuadrado.");
		System.out.println("El volumen del círculo es de " + volumen + " centímetros al cubo.");
		
		teclado.close();

	}

}
