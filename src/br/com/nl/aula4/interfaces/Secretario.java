package br.com.nl.aula4.interfaces;

public class Secretario extends Funcionario {

	@Override
	public double calculaHoraExtra() {
		return 0.5 * getSalario();
	}

}
