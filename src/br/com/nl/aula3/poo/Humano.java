package br.com.nl.aula3.poo;

public class Humano extends Mamifero {
	private float altura;
	private String etinia;

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getEtinia() {
		return etinia;
	}

	public void setEtinia(String etinia) {
		this.etinia = etinia;
	}

	public String locomoverSe() {
		return "andando";
	}
}
