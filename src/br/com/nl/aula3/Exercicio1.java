package br.com.nl.aula3;

import java.util.Scanner;

public class Exercicio1 {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		try {
			processar();
		} finally {
			scanner.close();
		}

	}

	private static void processar() {
		String[] nomes;
		nomes = new String[5];
		double[] notas = new double[5];
		double soma = 0, media;
		for (int i = 0; i <= 4; i++) {
			System.out.println("Entre com o nome do aluno nº " + (i + 1));
			nomes[i] = scanner.nextLine();
			System.out.println("Entre com a nota do aluno nº " + (i + 1));
			notas[i] = scanner.nextDouble();
			soma = soma + notas[i];
		}
		media = soma / 5;
		System.out.println("A média dos alunos é: " + media);
		System.out.println();
		System.out.println("Lista dos alunos cuja nota é superior a média da turma");
		for (int i = 0; i <= 4; i++) {
			if (notas[i] > media)
				System.out.println(nomes[i]);
		}

	}

}