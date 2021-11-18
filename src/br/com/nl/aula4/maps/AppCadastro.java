package br.com.nl.aula4.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.nl.aula2.Pessoa;

public class AppCadastro {

	static Map<Long, Pessoa> db = new HashMap<>();
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		try {
			mostrarMenu();

		} finally {
			sc.close(); // Encerra o programa
		}
	}

	private static void mostrarMenu() {
		while (true) {
			System.out.println("Escolha uma opção");
			System.out.println("0 - sair    1 - cadastrar    2 - consultar");
			int opc = sc.nextInt();

			switch (opc) {
			case 0:
				return;
			case 1:
				cadastrar();
				break;
			case 2:
				consultar();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}

	}

	public static void cadastrar() {
		System.out.println("Digite o CPF");
		long cpf = sc.nextLong();

		System.out.println("Digite o Nome");
		String nome = sc.next();

		System.out.println("Digite a idade");
		int idade = sc.nextInt();

		PessoaFisica pessoa = new PessoaFisica(nome, cpf);
		pessoa.setIdade(idade);

		db.put(cpf, pessoa);

	}

	public static void consultar() {
		System.out.println("Digiteo CPF");
		long cpf = sc.nextLong();
		
		if(!db.containsKey(cpf)) {
			System.out.println("Nenhuma pessoa encontrada para o cpf "+cpf);
			return;
		}
		
		Pessoa pessoa = db.get(cpf);
		
		System.out.println(pessoa);

	}
}
