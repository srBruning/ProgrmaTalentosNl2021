package br.com.nl.aula4;

/**
 * Escreva uma classe abstrata que representa uma figura geométrica e defina os
 * um método imprimir que imprime a área e o perímetro da figura, e os seguintes
 * métodos para ser implementado nas classes filha: calcularArea e
 * calcularPerimetro
 * 
 * @author diego
 *
 */
public abstract class FiguraGeometrica implements Imprimivel {

	public void imprimir() {
		System.out.println("Área: "+calcularArea());
		System.out.println("Perímetro: "+calcularPerimetro());
	}
	
	public abstract String nomeFigura();
	
	public abstract float calcularArea();

	public abstract float calcularPerimetro();

}
