package boletin_2;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el precio del producto sin IVA:");
		double precio;
		Scanner teclado = new Scanner(System.in);
		precio = teclado.nextDouble();
		double iva = 21;
		double preciofinal = precio * (iva + 100) / 100;
		System.out.println("El precio con IVA es de " + preciofinal + ".");
		
		teclado.close();
	}

}
