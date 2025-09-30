package boletin_3;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {

		int anios;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Teclee los años de servicio en la empresa:");
		anios = teclado.nextInt();
		
		if (anios<1) {
			System.out.println("Al tener menos de 1 año de servicio, no le corresponde bonus.");
		} else {
			if (anios<2) {
				System.out.println("Al tener entre 1 año y 2 años de servicio, le corresponde un 5% de bonus.");
			} else {
				if (anios<3) {
					System.out.println("Al tener entre 2 año y 3 años de servicio, le corresponde un 10% de bonus.");
				} else {
					System.out.println("Al tener más de 3 años de servicio, le corresponde un 15% de bonus.");
				}
			}
		}
		teclado.close();
		
	}

}
