package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MainMetodos {

	public static void main(String[] args) {
		
		List<Double> notas = new ArrayList<>();
		
		System.out.println("Cria uma lista de notas");

		
		notas.add(4.0);
		notas.add(9.0);
		notas.add(6.5);
		notas.add(2.8);
		notas.add(0.0);
		notas.add(8.4);
		notas.add(5.9);
		
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Exiba a posição da nota 2.8: " + notas.indexOf(2.8));
		System.out.println();
		
		System.out.println("Adicione la lista a nota 7.0 na posição 4: ");
		notas.add(4, 7d);
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Subistitua 2.8 por 3.5");
		notas.set(notas.indexOf(2.8), 3.8);
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Confira se a nota 8.4 está na lista");
		System.out.println(notas.contains(8.4));
		System.out.println();
		
		System.out.println("Exiba todas as notas na ordem inserida");
		for (Double nota : notas) System.out.println(nota);
		System.out.println();
		
		//método min não existe em list, pegamos emprestado de Collections
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		System.out.println();
		
		System.out.println("Exima a maior nota: " + Collections.max(notas));
		System.out.println();
		
		System.out.print("Exiba a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		System.out.println();
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()) );
		System.out.println();
		
		System.out.println("remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		System.out.println();
		
		System.out.println("remova a nota da posição 0: ");
		notas.remove(0);
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Remova as notas menores que 7");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7) {
				iterator1.remove();
			}
		}
		System.out.println(notas);
		System.out.println();
		
		System.out.println("Apague a lista");
		notas.clear();
		System.out.println();
		
		System.out.println("----------------LinkedList--------------");
		System.out.println();
		
		LinkedList<Double> notas2 = new LinkedList<>();
		
		notas2.add(4.0);
		notas2.add(9.0);
		notas2.add(6.5);
		notas2.add(2.8);
		notas2.add(0.0);
		notas2.add(8.4);
		notas2.add(5.9);
		
		System.out.println("Mostre a primeira nota da lista: " + notas2.get(0));
		System.out.println(notas2);
		System.out.println();
		
		System.out.println("Mostre e remova a primeira nota: " + notas2.remove());
		System.out.println(notas2);
		
	}

}
