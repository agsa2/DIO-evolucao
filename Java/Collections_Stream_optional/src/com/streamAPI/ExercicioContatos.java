package com.streamAPI;

/*
https://www.baeldung.com/java-8-functional-interfaces
https://www.baeldung.com/java-method-references
*/

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExercicioContatos {

	public static void main(String[] args) {
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1, new Contato("Simba", 2222));
			put(4, new Contato("Cami" , 5555));
			put(3, new Contato("Jon"  , 1111));
		}};
		System.out.println("Ordem aleatoria");
		for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
			System.out.println(entry.getKey() + " - " + 
							   entry.getValue().getNome() + " - " +
							   entry.getValue().getNumero());
		}
		System.out.println();
		
		System.out.println("Ordem aleatoria");
		Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
			put(1, new Contato("Simba", 2222));
			put(4, new Contato("Cami" , 5555));
			put(3, new Contato("Jon"  , 1111));
		}};
		for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
			System.out.println(entry.getKey() + " - " + 
							   entry.getValue().getNome() + " - " +
							   entry.getValue().getNumero());
		}
		System.out.println();
		
		System.out.println("Ordem id");
		Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
		for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
			System.out.println(entry.getKey() + " - " + 
							   entry.getValue().getNome() + " - " +
							   entry.getValue().getNumero());
		}
		System.out.println();
		
		
		
		
		
		System.out.println("Ordem numero telefone");
		
		/* Classe anonima
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {      

			public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
				return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
			}
		});  */
		
		/* Method function
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
				new Function<Map.Entry<Integer, Contato>, Integer>() {

					@Override
					public Integer apply(Entry<Integer, Contato> cont) {
						return cont.getValue().getNumero();
					}
		}));*/
		
		//Lambda
		Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
				cont -> cont.getValue().getNumero()));
		//Lambda			
		set.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set) {
			System.out.println(entry.getKey() + " - " + 
							   entry.getValue().getNumero() + " - " + 
							   entry.getValue().getNome());
		}
		System.out.println();
		
		System.out.println("Ordenar por Nome");
		Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
					nome -> nome.getValue().getNome()));
		
		set1.addAll(agenda.entrySet());
		for (Map.Entry<Integer, Contato> entry : set1) {
			System.out.println(entry.getKey() + " - " + 
							   entry.getValue().getNome() + " - " + 
							   entry.getValue().getNumero() );
		}
	}

}
/* Se tornou uma classe anonima
class ComparatorNumero implements Comparator<Map.Entry<Integer, Contato>>{
	@Override
	public int compare(Entry<Integer, Contato> num1, Entry<Integer, Contato> num2) {	
		return Integer.compare(num1.getValue().getNumero(), num2.getValue().getNumero());
	}	
}

class ComparatorNome implements Comparator<Map.Entry<Integer, Contato>>{
	@Override
	public int compare(Entry<Integer, Contato> n1, Entry<Integer, Contato> n2) {
		return n1.getValue().getNome().compareTo(n2.getValue().getNome());
	}	
} */