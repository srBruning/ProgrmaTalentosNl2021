package br.com.nl.aula3;

import java.util.Scanner;

public class Exercicio2 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		try {
			processar();
		} finally {
			sc.close();
		}
	}

	/*
	 * 2) Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário.
	 * Calcule a média de todas elas. Exiba o conjunto das notas maiores do que a
	 * média calculada. Em seguida, de forma agrupada, exiba o outro conjunto de
	 * notas (menores do que a média).
	 * 
	 */
	public static void processar() {

		System.out.println("Informe a quantidade de notas:");

		int quantidade = sc.nextInt();

		double notas[] = new double[quantidade];

		double mediaTurma = 0;

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota do " + i + " aluno:");
			notas[i] = sc.nextDouble();

			mediaTurma += notas[i];
		}

		mediaTurma /= notas.length;

		System.out.println("Media de nota da turma = " + mediaTurma);
		String txtMaior = "Acima da media: ";
		String txtMenor = "Abaixo da media: ";
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > mediaTurma) {
				txtMaior += notas[i] + ", ";
			} else {
				txtMenor += notas[i] + ", ";
			}
		}

		System.out.println(txtMaior);
		System.out.println(txtMenor);

	}
}