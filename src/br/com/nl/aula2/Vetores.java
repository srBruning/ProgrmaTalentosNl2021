package br.com.nl.aula2;

public class Vetores {
	public static void main(String[] args) {
		int[] array1;
		int array2[];
		
		array1 = new int[10];
		array2 = new int[] {1,2,3};

//		System.out.println(array1.length);
//		System.out.println(array2.length);
//		

//		System.out.println(array1[0]);
//		System.out.println(array2[3]); 
		
		Pessoa aPessoa[] = new Pessoa[10];
		aPessoa[0] = new Pessoa();
		System.out.println(aPessoa[0]);
		System.out.println(aPessoa[1]);
		
		aPessoa[0].setIdade(10);
		System.out.println(aPessoa[0].getIdade());
		
	}
}
