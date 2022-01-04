package com.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainMetodos {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.2, 9.5, 4d, 3.4, 6.7, 0.0, 7d));
		//Elementos repitidos não entram, não guarda posição
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Confira se a nota 4 está no conjunto: " + notas.contains(4d));
		System.out.println();
		
		System.out.println("Exiba a menor e a maior nota: " + Collections.min(notas) + " e " + Collections.max(notas));
		System.out.println();
		
		System.out.println("Exiba a soma dos valores");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		System.out.println();
		
		System.out.println("Media das nota: "+ soma/notas.size());
		System.out.println();
		
		System.out.println("Remova a nota 0");
		notas.remove(0d);
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Remova as notas menores que 7");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) iterator1.remove();
		}
		System.out.println(notas);
		System.out.println();
		
		//Para salvar a ordem de entrada tem que se trabalhar com a LinkedHashSet
		System.out.println("Exiba as notas na ordem que foram informadas");
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.2, 9.5, 4d, 3.4, 6.7, 0.0, 7d));
		System.out.println(notas2);
		System.out.println();
		
		//Para exibir em ordem crescente usamos a treeSet
		//notas2 é double que implementa comparable
		System.out.println("Exiba as notas em ordem crescente");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		notas.clear();
		System.out.println(notas);
		System.out.println();
		
		


	}
	

}
