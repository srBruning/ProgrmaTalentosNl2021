package br.com.nl.aula4;

import br.com.nl.aula4.figuras.Quadrado2;

public class MainFiguras {

	
	public static void main(String[] args) {
		
		FiguraGeometrica figuras[] = new FiguraGeometrica[3];
		
		figuras[0] = new Quadrado(5);
		figuras[1] = new Retagulo(5, 3);
		figuras[2] = new Quadrado2(5);
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].nomeFigura());
			figuras[i].imprimir();
		}
		
	}
}
