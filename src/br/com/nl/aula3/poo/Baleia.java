package br.com.nl.aula3.poo;

public class Baleia extends Mamifero {
	private float comprimentoBarbatana;

	public float getComprimentoBarbatana() {
		return comprimentoBarbatana;
	}

	public void setComprimentoBarbatana(float comprimentoBarbatana) {
		this.comprimentoBarbatana = comprimentoBarbatana;
	}

	public String locomoverSe() {
		return "nadando";
	}
}
