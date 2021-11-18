package br.com.nl.aula4.listas;

import java.util.ArrayList;
import java.util.List;
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

		List<Double>  notas = new ArrayList<Double>();

		double mediaTurma = 0;

		for (int i = 0; i < quantidade; i++) {
			System.out.print("Digite a nota do " + i + " aluno:");
			notas.add(sc.nextDouble());

			mediaTurma += notas.get(i);
		}

		mediaTurma /= notas.size();

		System.out.println("Media de nota da turma = " + mediaTurma);
		String txtMaior = "Acima da media: ";
		String txtMenor = "Abaixo da media: ";
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) > mediaTurma) {
				txtMaior += notas.get(i) + ", ";
			} else {
				txtMenor += notas.get(i) + ", ";
			}
		}

		System.out.println(txtMaior);
		System.out.println(txtMenor);

	}
}