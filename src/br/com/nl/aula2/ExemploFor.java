package br.com.nl.aula2;

public class ExemploFor {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("* " + i);
		}

		System.out.println("----");

		for (int i = 0; i <= 5; i++) {
			System.out.println("* " + i);
		}

		// não pode acesar i fora do for
		// System.out.println("* "+i);
		System.out.println("----");
		int j;

		for (j = 0; j <= 5; j++) {
			System.out.println("* " + j);
		}
		System.out.println(" [ " + j + " ]\n\n");

		System.out.println("----");

		for (int i = 0; i < 5; i += 2) {
			System.out.println("* " + i);
		}

		System.out.println("----");

		for (int i = 5; i >= 0; i--) {
			System.out.println("* " + i);
		}

		System.out.println("----");

		for (int i = 5; i >= 0; i--) {
			System.out.println("* " + i);
			if (i == 3)
				break;
		}

		System.out.println("-----");
		for (int i = 5; i >= 0; i--) {
			if (i == 3)
				continue;
			System.out.println("* " + i);
		}

	}
}
