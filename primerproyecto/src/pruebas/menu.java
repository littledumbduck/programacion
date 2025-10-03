package pruebas;

import java.util.Scanner;

public class menu {

	public static void main(String[] args) {

		int opcion = 0, num1, num2, operacion;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Selecciona una operación:");
		System.out.println("1- Suma");
		System.out.println("2- Resta");
		System.out.println("3- Producto");
		System.out.println("4- Salir");

		opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Suma");

			System.out.println("Teclee el primer numero");
			num1 = teclado.nextInt();
			System.out.println("Teclee el segundo numero");
			num2 = teclado.nextInt();
			
			operacion = num1 + num2;
			
			System.out.println("El resultado es " + operacion);
			
			System.out.println("Selecciona una operación:");
			System.out.println("1- Suma");
			System.out.println("2- Resta");
			System.out.println("3- Producto");
			System.out.println("4- Salir");

			break;
		case 2:
			System.out.println("Resta");
			break;
		case 3:
			System.out.println("Producto");
			break;
		case 4:
			System.out.println("Salir");
			break;

		default:
			break;
		}
	}

}
