package com.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainMetodos {

	public static void main(String[] args) {
		
		Map<String, Double> carros = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carros);
		System.out.println();
		
		System.out.println("Subistitua o valor do gol");
		carros.put("gol", 15.2);
		System.out.println(carros);
		System.out.println();
		
		System.out.println("Verifique se um modelo esta no map");
		System.out.println(carros.containsKey("tucson"));
		System.out.println();
		
		System.out.println("Mostre o consumo do uno");
		System.out.println(carros.get("uno"));
		System.out.println();
		//metodo keyset retorna um set do tipo da chave
		System.out.println("Mostre os modelos");
		Set<String> modelos = carros.keySet();
		System.out.println(modelos);
		//metodo values retorna uma collection
		System.out.println("Mostre os consumos");
		Collection<Double> consumos = carros.values();
		System.out.println(consumos);
		System.out.println();
		
		System.out.println("mostre o modelo mais economico");
		Double consumoMax = Collections.max(carros.values());
		//para poder obter uma chave baseada em um valor, usamos o
		//metodo entrySet, ele retorna um Set do tipo entry
		//para trabalhar com o valor do dicionario usamos um Set
		Set<Map.Entry<String, Double>> entries = carros.entrySet();
		String maisEficiente = "";
		for (Map.Entry<String, Double> entry : entries) {
			if (entry.getValue().equals(consumoMax)) {
				maisEficiente = entry.getKey();
				System.out.println(maisEficiente+ " - "+ entry.getValue());
			}
		}
		System.out.println();
		
		System.out.println("Exiba o modelo menos economico");
		Double consumomin = Collections.min(carros.values());
		String menosEficiente = "";
		for (Map.Entry<String, Double> entry : carros.entrySet()) {
			if (entry.getValue().equals(consumomin)) {
				menosEficiente = entry.getKey();
				System.out.println(menosEficiente + "\t"+ consumomin);
			}
		}
		System.out.println();
		//retorno de carros.values é um collection
		System.out.println("Exiba a soma dos consumos");
		Iterator<Double> iterator = carros.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		System.out.println();
		
		System.out.println("Exiba a média");
		System.out.println(soma/carros.size());
		System.out.println();
		
		System.out.println("remova os modelos com consumo 15.4");
		Iterator<Double> iterator1 = carros.values().iterator();
		while (iterator1.hasNext()) {
			if (iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println(carros);
		System.out.println();
		
		System.out.println("Exiba os carros na ordem de inserção");
		Map<String, Double> carros1 = new LinkedHashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carros1);
		System.out.println();
		
		
		System.out.println("Exiba ordenado pelo modelo");
		Map<String, Double> carros2 = new TreeMap<>(carros1);
		System.out.println(carros2);
		System.out.println();
		
		System.out.println("Apague o dicionario");
		carros.clear();
		System.out.println(carros.isEmpty());
	
	
	}

}
