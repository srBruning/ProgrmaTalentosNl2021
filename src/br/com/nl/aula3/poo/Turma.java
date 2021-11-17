package br.com.nl.aula3.poo;

public class Turma {
	
	private String nome;
	private Aluno alunos[];
	
	private int qtdAluno = 0;
	
	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new Aluno[100];
	}
	
	public void adicionaAluno(Aluno aluno) {
		alunos[qtdAluno++] = aluno;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	/**
	 * Calcula a media da turama com base nas medias dos alunos.
	 * @return
	 */
	public float mediaTuram() {
		float media = 0;
		for (int i = 0; i < qtdAluno; i++) {
			media += alunos[i].media();
		}
		media = media/qtdAluno;
		
		return media;
	}
	
	
	public static void main(String[] args) {
		Turma t1 = new Turma("t1");

		Aluno al1 = new Aluno(1, "Diego");
		al1.setNotaProva1(10);
		al1.setNotaProva2(5);
		al1.setNotaTrabalho(8);
		
		t1.adicionaAluno(al1);
		

		Aluno al2 = new Aluno(2, "João");
		al2.setNotaProva1(8);
		al2.setNotaProva2(9);
		al2.setNotaTrabalho(5);
		
		t1.adicionaAluno(al2);
		
		
		Aluno alunos[]= t1.getAlunos();
		for (int i = 0; i < alunos.length; i++) {
			if(alunos[i]==null)
				break;
			System.out.println(alunos[i].getNome()+": "+alunos[i].media());
		}
		
		float mediaTuram = t1.mediaTuram();
		System.out.println(mediaTuram);
	}
	
}
