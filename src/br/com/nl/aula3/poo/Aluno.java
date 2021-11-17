package br.com.nl.aula3.poo;

/**
 * Escreva uma classe cujos objetos representam alunos matriculados em uma
 * disciplina. Cada objeto dessa classe deve guardar os seguintes dados do
 * aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. Escreva os
 * seguintes métodos para esta classe: public float media() calcula a média
 * final do aluno
 * 
 * @author diego
 *
 */
public class Aluno {
	// atributos
	private int matricula;
	private String nome;
	private float notaProva1;
	private float notaProva2;
	private float notaTrabalho;

	public Aluno(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNotaProva1() {
		return notaProva1;
	}

	public void setNotaProva1(float notaProva1) {
		this.notaProva1 = notaProva1;
	}

	public float getNotaProva2() {
		return notaProva2;
	}

	public void setNotaProva2(float notaProva2) {
		this.notaProva2 = notaProva2;
	}

	public float getNotaTrabalho() {
		return notaTrabalho;
	}

	public void setNotaTrabalho(float notaTrabalho) {
		this.notaTrabalho = notaTrabalho;
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * Calcula e retorna a media das notas do aluno
	 * @return
	 */
	public float media() {
		float media = (notaProva1 + notaProva2 + notaTrabalho) / 3;
		return media;
	}

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno(50, "Diego ");
		aluno1.setNotaProva1(10);
		aluno1.setNotaProva2(5);
		aluno1.setNotaTrabalho(2);
		float media = aluno1.media();
		System.out.println(aluno1.getNome() + ": " + media);
	}
}
