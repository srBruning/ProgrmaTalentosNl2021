package br.com.nl.aula2;

import java.util.Scanner;

public class ExemploScaner {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Digite um texto:");
			String texto = sc.next();
			System.out.println("texto: " + texto);

			System.out.print("Digite um numero inteiro:");
			int numero = sc.nextInt();
			System.out.println("numero: " + numero);

			System.out.print("Digite um numero:");
			double valor = sc.nextDouble();
			System.out.println("numero: " + valor);

		} finally {
			sc.close(); // Encerra o programa
		}
	}
}