package boletin_3;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee un número:");
		numero = teclado.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Aries");
			break;
		case 2:
			System.out.println("Tauro");
			break;
		case 3:
			System.out.println("Géminis");
			break;
		case 4:
			System.out.println("Cáncer");
			break;
		case 5:
			System.out.println("Leo");
			break;
		case 6:
			System.out.println("Virgo");
			break;
		case 7:
			System.out.println("Libra");
			break;
		case 8:
			System.out.println("Escorpio");
			break;
		case 9:
			System.out.println("Sagitario");
			break;
		case 10:
			System.out.println("Capricornio");
			break;
		case 11:
			System.out.println("Acuario");
			break;
		case 12:
			System.out.println("Piscis");
			break;
		default:
			System.out.println("El númro no corresponde a ningún signo zodiacal.");
			break;
		}
		teclado.close();
	}

}
