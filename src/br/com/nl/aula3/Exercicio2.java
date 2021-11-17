package br.com.nl.aula3;

import java.util.Scanner;

public class Exercicio2 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);

		try {
			processar();
		} finally {
			scanner.close();
		}
	}

	public static void processar() {

		System.out.println("Informe a quantidade de notas:");

		double media = 0;
		int quantidade = scanner.nextInt();

		double vetor[];
		vetor = new double[quantidade];

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Informe a " + (i + 1) + "ª nota");
			vetor[i] = scanner.nextInt();
			
			media = media + vetor[i];
		}
		
		media = media / quantidade;
		
		System.out.println("A média é              : " + media);

		String maior = "Nota(s) acima média    : ";
		String menor = "Nota(s) abaixo da média: ";
		for (int i = 0; i < quantidade; i++) {
			if (vetor[i] > media) {
				maior = maior + vetor[i] + "    ";
			} else {
				menor = menor + vetor[i] + "    ";
			}
		}
		
		System.out.println(maior);
		System.out.println(menor);
	}
}