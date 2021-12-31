package com.list.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<>();
		
		Double soma = 0d;
		for (int i = 0; i < 6; i++) {
			System.out.println("Escreva uma temperatura!");
			Double temp = in.nextDouble();
			
			temperaturas.add(temp);	
			soma += temp;
		}
		
		// Calculando a média das temperaturas	
		Double media = soma/temperaturas.size();
		
		System.out.println("A média das temperaturas é: " + media);

		
		/*  //exibindo todas as temperaturas:
        System.out.print("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));
		*/
		
		
		System.out.println("Os meses com temperatura maiores que a media são: ");
		Iterator<Double> iterator1 = temperaturas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			
			if (next > media) {
				System.out.print(temperaturas.indexOf(next)+1 + ", ");
			}
		}
		
		
	}

}
