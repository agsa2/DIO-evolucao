package com.list.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Crime {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<String> respostas = new ArrayList<>();

		System.out.println("Telefonou para a vítima?");
		respostas.add(in.next());
		
		System.out.println("Esteve no local do crime?");
		respostas.add(in.next());
		
		System.out.println("Mora perto da vítima?");
		respostas.add(in.next());
		
		System.out.println("Devia para a vítima?");
		respostas.add(in.next());
		
		System.out.println("Já trabalhou com a vítima?");
		respostas.add(in.next());
		
		
		Iterator<String> iterator = respostas.iterator();
		int count = 0;
		while (iterator.hasNext()) {
			String next = iterator.next();
			
			if (next.equalsIgnoreCase("S")) {
				count++;
			}
		}
		
		
		if (count > 4) {
			System.out.println("Assassina");
		}
		else if (count > 2) {
			System.out.println("Cúmplice");
		}
		else if (count > 0){
			System.out.println("Suspeita");
		}
		else {
			System.out.println("Inocente");
		}
	}

}
