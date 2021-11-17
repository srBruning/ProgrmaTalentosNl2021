package br.com.nl.aula3.poo;

public class MainMamifero {
	public static void main(String[] args) {

		Mamifero lst[] = new Mamifero[2];

		lst[0] = new Humano();
		lst[1] = new Baleia();
		// classes abstratas não podem ser instaciadas 
		//lst[2] = new Mamifero();

		// cobra não é um mamifero
		// lst[2] = new Cobra();

		for (int i = 0; i < lst.length; i++) {
			System.out.println(lst[i].locomoverSe());
		}

	}
}
