package com.set.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Arco {

	public static void main(String[] args) {
		
		Set<String> arco = new HashSet<String>() {{
			add(new String("vermelha"));
			add(new String("laranja"));
			add(new String("amarela"));
			add(new String("verde"));
			add(new String("azul"));
			add(new String("azul-escuro"));
			add(new String("violeta"));
		}};
		
		Iterator<String> iterator = arco.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		System.out.println("Quantidade de cores é: " + arco.size());
		System.out.println();
		
		Set<String> arco1 = new TreeSet<>(arco);
		System.out.println(arco1);
		System.out.println();
		
		Set<String> arco2 = new LinkedHashSet<>(Arrays.asList("violeta", "azul-escuro", "azul", "verde", "amarelo", "laranja", "vermelho"));
		List<String> arcoList = new ArrayList<String>(arco2); 
		Collections.reverse(arcoList);
		System.out.println(arcoList);
		System.out.println();
		
		
		System.out.println("Cores que começam com aletra v");
		for (String cor : arco) {
			if (cor.startsWith("v")) {
				System.out.println(cor);
			}
		}
		System.out.println();
		
		System.out.println("Remova cores que não começam com v");
		Iterator<String> iterator1 = arco.iterator();
		while (iterator1.hasNext()) {
			String cor = iterator1.next();
			if (!cor.startsWith("v")) {
				iterator1.remove();
			}
		}
		System.out.println(arco);
			
		arco.clear();
		
		System.out.println("conjunto arco esta vazio? " + arco.isEmpty());
			
			
			
			
	}

}
