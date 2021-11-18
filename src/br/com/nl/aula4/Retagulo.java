package br.com.nl.aula4;

/**
 * Escreva um código em Java que apresente a classe Retângulo, com atributos
 * comprimento, largura e, os métodos calcularArea,calcularPerimetro.
 * Salienta-se que a área de um retângulo é obtida pela fórmula(comprimento *
 * largura) e o perímetro por (2 * comprimento) + (2 * largura). Adicione um
 * método construtor que permita a definição de todos os atributos no momento da
 * instanciação do objeto.
 * 
 * @author diego
 *
 */
public class Retagulo extends FiguraGeometrica {

	private float comprimento;
	private float largura;

	public Retagulo(float comprimento, float largura) {
		super();
		this.comprimento = comprimento;
		this.largura = largura;
	}

	@Override
	public float calcularArea() {
		return comprimento * largura;
	}

	@Override
	public float calcularPerimetro() {
		return (2 * comprimento) + (2 * largura);
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	@Override
	public String nomeFigura() {
		return "Retangulo";
	}

}
