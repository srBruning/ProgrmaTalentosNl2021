package br.com.nl.aula4.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		PessoaFisica pf1 = new PessoaFisica("Diego", 100l);
		PessoaFisica pf2 = new PessoaFisica("João", 101l);

		Map<Long, PessoaFisica> map = new HashMap<Long, PessoaFisica>();
		map.put(pf1.getCpf(), pf1);
		map.put(pf2.getCpf(), pf2);

		if (map.containsKey(100l))
			System.out.println(map.get(100l).getNome());

		Collection<PessoaFisica> values = map.values();

		System.out.println("qtd itens: " + map.size());
		// foreach
		for (PessoaFisica paux : values) {
			System.out.println(paux.getNome());
		}

		// keys
		Set<Long> keys = map.keySet();

		for (Long cpf : keys) {
			System.out.println(cpf);
			System.out.println(map.get(cpf).getNome());
		}

		System.out.println("\nentrySet\n");
		// entryset
		Set<Entry<Long, PessoaFisica>> entrys = map.entrySet();
		for (Entry<Long, PessoaFisica> entry : entrys) {
			System.out.println(entry.getKey() + "->" + entry.getValue().getNome());
		}
	}
}
