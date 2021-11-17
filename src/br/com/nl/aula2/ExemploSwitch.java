package br.com.nl.aula2;

public class ExemploSwitch {

	public static void main(String[] args) {
		System.out.println("Escolha uma opção:");
		System.out.println("1 - cadastrar"); 
		System.out.println("2 - alterar"); 
		System.out.println("3 - deletar"); 
		System.out.println("0 - sair\n\n"); 
		
		int opc = 1;
		
		switch (opc) {
		case 3:
			System.out.println("sair");
		case 1:
			System.out.println("cadastrar");
		case 2:
			System.out.println("alterar");
			break; 
		case 0:
			System.out.println("deletar");
			break; 
		default:
			System.out.println("opção invalida!");
		}
	}

}
