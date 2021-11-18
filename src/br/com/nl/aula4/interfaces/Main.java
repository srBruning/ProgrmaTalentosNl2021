package br.com.nl.aula4.interfaces;

import java.util.ArrayList;
import java.util.List;

import br.com.nl.aula4.Imprimivel;
import br.com.nl.aula4.Quadrado;

public class Main {
	public static void main(String[] args) {
		List<Imprimivel> lst = new ArrayList<Imprimivel>();

		if (lst.size() > 0)
			System.out.println(lst.get(0));

		lst.add(new Diretor());
		((Diretor) lst.get(0)).setNome("Diego");

		lst.add(new Quadrado(5));

		for (int i = 0; i < lst.size(); i++) {
			lst.get(i).imprimir();
		}
	}
}
