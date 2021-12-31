package com.set.exercicios;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linguagem {

	public static void main(String[] args) {
		Set<LinguagemFavorita> linguagens = new LinkedHashSet<LinguagemFavorita>() {{
			add(new LinguagemFavorita("Java", 1995, "eclipse"));
			add(new LinguagemFavorita("C", 1972, "code bloc"));
			add(new LinguagemFavorita("Python", 1991, "intellij"));
		}};
		
		System.out.println("Ordem de Inserção");
		for (LinguagemFavorita ling : linguagens) {
			System.out.println(ling.getNome() + " - " + 
					ling.getAnoCriação() + " - " +
					ling.getIde());
		}
		System.out.println();
		
		
		System.out.println("Ordem natural");
		Set<LinguagemFavorita> linguagens1 = new TreeSet<>();
		linguagens1.addAll(linguagens);
		System.out.println(linguagens1);
		System.out.println();
		
		
		System.out.println("IDE");
		Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIDE());
		linguagens2.addAll(linguagens);
		
		for (LinguagemFavorita ling : linguagens2) {
			System.out.println(ling.getIde() + " - " + ling.getNome()
					+" - " + ling.getAnoCriação());
		}
		System.out.println();
		
		
		
		System.out.println("Ano de criação");
		Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorAnoCriacao());
		linguagens3.addAll(linguagens);
		
		for (LinguagemFavorita ling : linguagens3) {
			System.out.println(ling.getAnoCriação() + " - " + ling.getNome()
					+" - " + ling.getIde());
		}
		System.out.println();
		
		
		System.out.println("Por Nome, Ano de Criação e IDE");
		Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
		linguagens4.addAll(linguagens);
		
		for (LinguagemFavorita ling : linguagens4) {
			System.out.println(ling.getIde() + " - " + ling.getNome()
					+" - " + ling.getAnoCriação() );
		}
		System.out.println();
		
	}
	

}
