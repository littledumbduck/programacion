package boletin_5;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {

		double num1, num2;
		int opcion = 0;
		Scanner sc = new Scanner(System.in);

		while (opcion != 5) {

			System.out.println("Seleccione una operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Producto");
			System.out.println("4. Division");
			System.out.println("5. Salir");
			opcion = sc.nextInt();
			System.out.println("Teclee el primer número:");
			num1 = sc.nextDouble();
			System.out.println("Teclee el segundo número:");
			num2 = sc.nextDouble();

			switch (opcion) {
			case 1:
				Funciones.Sumar(num1, num2);
				break;
			case 2:
				Funciones.Restar(num1, num2);
				break;
			case 3:
				Funciones.Producto(num1, num2);
				break;
			case 4:
				Funciones.Division(num1, num2);
				break;
			case 5:
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Error.");
				break;
			}

		}
		sc.close();
	}
}
