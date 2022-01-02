package com.map.exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Estados {

	public static void main(String[] args) {
		
		Map<String, Integer> estados = new LinkedHashMap<>() {{
			put("PE", 9616621);
			put("AL", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		estados.put("RN", 3534165);
		
		System.out.println("Tem o estado da paraiba? " + estados.containsKey("PB"));
		estados.put("PB", 4039277);
		System.out.println();
		
		System.out.println(estados);
		System.out.println();
		
		Map<String, Integer> estados1 = new TreeMap<>(estados);
		System.out.println(estados1);
		for (Map.Entry<String, Integer> entry : estados1.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println();
		
		System.out.print("Menor população: ");
		Integer menorPop = Collections.min(estados.values());
		Set<Map.Entry<String, Integer>> entries = estados.entrySet();
		String estadoMenorPop = "";
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(menorPop)) {
				estadoMenorPop = entry.getKey();
				System.out.println(estadoMenorPop + " - " + menorPop);
			}	
		}
		
		System.out.print("Maior população: ");
		Integer maiorPop = Collections.max(estados.values());
		String estadoMaiorPop = "";
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue().equals(maiorPop)) {
				estadoMaiorPop = entry.getKey();
				System.out.println(estadoMaiorPop + " - " + maiorPop);
			}	
		}
		System.out.println();
		
		System.out.print("Soma das populações: ");
		Iterator<Integer> iterator = estados.values().iterator();
		Integer soma = 0;
		while (iterator.hasNext()){
			soma += iterator.next();
		}
		System.out.println(soma);
		System.out.println("Media da população: "+ soma/estados.size());
		System.out.println();
		
		System.out.println("Remova os com população menor que 4 milhões");
		Iterator<Integer> iterator1 = estados1.values().iterator();
		while(iterator1.hasNext()) {
			if (iterator1.next() < 4000000) {
				iterator1.remove();
			}
		}
		System.out.println(estados1);
		estados.clear();
		System.out.println(estados.isEmpty());
	}

}
