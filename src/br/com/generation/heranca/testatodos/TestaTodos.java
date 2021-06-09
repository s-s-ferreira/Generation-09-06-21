package br.com.generation.heranca.testatodos;

import br.com.generation.heranca.Animal;
import br.com.generation.heranca.cachorro.Cachorro;
import br.com.generation.heranca.cavalo.Cavalo;
import br.com.generation.heranca.preguica.Preguica;

public class TestaTodos {

	public static void main(String[] args) {
		
		Animal a = new Animal ();
		Cachorro c1 = new Cachorro ();
		Cavalo c2 = new Cavalo ();
		Preguica p = new Preguica ();
		
		c1.setNome("Billy");
		c1.setIdade(6);
		c1.setSom("Au Au Au");
		c1.setCorrer("Corredor");
		
		c2.setNome("Klaus");
		c2.setIdade(10);
		c2.setSom("iiirrrrí");
		c2.setCorrer("Corredor");
		
		p.setNome("Sara");
		p.setIdade(22);
		p.setSom("Ahhh");
		p.setSubir("Escaladora");
		
		System.out.println("===Som dos Animais===");
		System.out.println("O som que o cachorro faz: " + c1.getSom());
		System.out.println("O som que o cavalo faz: " + c2.getSom());
		System.out.println("O som que a preguiça faz: " + p.getSom());

	}

}
