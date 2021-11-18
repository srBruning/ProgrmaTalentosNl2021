package br.com.nl.aula2;

/**
 * Representa uma pessoa
 * 
 * @author diego
 *
 */
public class Pessoa {
	// representa a idade da pessoa
	private int idade;
	private String nome;

	public static int qtdPessoas;

	/**
	 * Altera o estado da idade
	 * 
	 * @param id
	 */
	public void setIdade(int id) {
		idade = id;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
	}

}
