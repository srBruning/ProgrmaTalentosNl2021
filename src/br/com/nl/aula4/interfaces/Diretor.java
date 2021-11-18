package br.com.nl.aula4.interfaces;

import br.com.nl.aula4.Imprimivel;

public class Diretor extends Funcionario implements Autenticavel, Imprimivel {

	private String senha;

	@Override
	public double calculaHoraExtra() {
		return 0;
	}

	@Override
	public boolean autenticar(String senha) {
		return this.senha!=null && this.senha.equals(senha);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (getCodigo() == ((Diretor) obj).getCodigo()) {
			return true;
		}

		return false;
	}

	@Override
	public void imprimir() {
		System.out.println("Diretor: "+this.getNome());		
	}

}
