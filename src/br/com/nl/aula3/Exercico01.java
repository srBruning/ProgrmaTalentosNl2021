package br.com.nl.aula3;

import java.util.Scanner;

public class Exercico01 {
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		try {

			processar();
		} finally {
			sc.close(); // Encerra o programa
		}
	}

	/*
	 * * Lê 5 nomes e notas de uma turma, 
	 * calcula e exibe a média das notas da turma e
	 * em seguida exibe a relação de nomes cuja nota é superior a esta média
	 */
	public static void processar() {
		double notas[] = new double[5];
		String nomes[] = new String[5];
		
		double mediaTurma = 0;
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o nome do "+i+" aluno:");
			nomes[i] = sc.next();
			
			System.out.print("Digite a nota do "+i+" aluno:");
			notas[i] = sc.nextDouble();
			
			mediaTurma += notas[i];
		}
		
		mediaTurma = mediaTurma/notas.length;
		
		System.out.println("Media de nota da turma = "+mediaTurma);
		String txt = "Acima da media: ";
		for (int i = 0; i < nomes.length; i++) {
			if(notas[i] > mediaTurma) {
				txt += nomes[i]+", ";
			}
		}
		
		System.out.println(txt);
	}
}
