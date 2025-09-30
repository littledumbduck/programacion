package boletin_4;

public class ejercicio15 {

	public static void main(String[] args) {

		double division;

		for (double i = 1; i < 101; i++) {
			division = i / 2;
			if (division % 1 == 0) {
				System.out.println(i);
			}
		}
	}
}
