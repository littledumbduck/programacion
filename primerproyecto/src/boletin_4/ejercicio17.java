package boletin_4;

public class ejercicio17 {

	public static void main(String[] args) {

		double division;

		for (double i = 100; i > 0; i--) {
			division = i / 2;
			if (division % 1 != 0) {
				System.out.println(i);
			}
		}
	}
}
