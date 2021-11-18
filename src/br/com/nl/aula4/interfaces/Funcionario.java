package br.com.nl.aula4.interfaces;

public abstract class Funcionario {
	private int codigo;
	private String nome;
	private double salario;

	public  abstract double calculaHoraExtra() ;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
