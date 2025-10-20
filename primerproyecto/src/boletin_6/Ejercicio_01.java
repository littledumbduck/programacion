package boletin_6;

import java.util.*;

public class Ejercicio_01 {

	public static void main(String[] args) {

		int opcion = 0;
		boolean repite = true;
		Scanner l = new Scanner(System.in);

		while (repite == true) {

			System.out.println("Selecciona una operación:");
			System.out.println("1- Sumar segundo");
			System.out.println("2- Casino");
			System.out.println("3- Triángulo");
			System.out.println("4- Salir");

			opcion = l.nextInt();

			switch (opcion) {
			case 1:
				Funciones.ContarHoras();
				break;
			case 2:
				Funciones.Casino();
				break;
			case 3:
				Funciones.Triangulos();
				break;
			case 4:
				System.out.println("Saliendo de la aplicación.");
				repite = false;
				break;
			default:
				System.out.println("Error. Número no válido.");
				break;
			}
		}
		l.close();
	}
}
