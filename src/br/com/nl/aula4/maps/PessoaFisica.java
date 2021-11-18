package br.com.nl.aula4.maps;

import br.com.nl.aula2.Pessoa;

public class PessoaFisica extends Pessoa {
	private Long cpf;

	public PessoaFisica(String nome, Long cpf) {
		this.setNome(nome);
		this.cpf = cpf;
	}
	
	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

}
