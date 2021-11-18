package br.com.nl.aula4.listas;

import java.util.ArrayList;

import br.com.nl.aula2.Pessoa;

public class Listas {
	public static void main(String[] args) {
		
		ArrayList<Pessoa> aPessoa = new ArrayList<>();
		
		
		aPessoa.add(new Pessoa());
		System.out.println(aPessoa.get(0));
		
		aPessoa.get(0).setIdade(10);
		System.out.println(aPessoa.get(0).getIdade());
		
	}
}