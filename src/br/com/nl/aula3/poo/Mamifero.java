package br.com.nl.aula3.poo;

public abstract class Mamifero {

	private int tamanhoMedioPelos;
	private String corPelo;

	/**
	 * metodo abstrato que deve ser implementado nas classes filha.
	 * @return
	 */
	public abstract String locomoverSe() ;
	
	
	public int getTamanhoMedioPelos() {
		return tamanhoMedioPelos;
	}

	public void setTamanhoMedioPelos(int tamanhoMedioPelos) {
		this.tamanhoMedioPelos = tamanhoMedioPelos;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	

}
