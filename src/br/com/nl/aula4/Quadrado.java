package br.com.nl.aula4;

/**
 * Escreva um código em Java que apresente a classe Quadrado, com o atributo
 * lado e os métodos calcularArea, calcularPerimetro e. Salienta-se que a área
 * de um quadrado é obtida pela fórmula (lado * lado) e o perímetro por (4 *
 * lado). Adicione um método construtor que permita a definição de todos os
 * atributos no momento da instanciação do objeto.
 * 
 * @author diego
 *
 */
public class Quadrado extends FiguraGeometrica {

	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}

	@Override
	public float calcularArea() {
		return lado * lado;
	}

	@Override
	public float calcularPerimetro() {
		return 4 * lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String nomeFigura() {
		return "Quadrado";
	}

}
