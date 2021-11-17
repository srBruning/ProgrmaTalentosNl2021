package br.com.nl.aula2;

public class ExemploWhile {
	public static void main(String[] args) {
		int c = 0;

		while (c < 10) {
			System.out.println("  " + c);
			c++;
		}

		System.out.println("--- " +c);
		
		while (c >= 0) {
			System.out.println("  " + c);
			c--;
		}

	}
}
