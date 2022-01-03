package com.streamAPI;

/*
https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
https://medium.com/@racc.costa/streams-no-java-8-e-no-java-9-36177c5c3313
https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
https://www.geeksforgeeks.org/stream-in-java/
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html
https://www.baeldung.com/java-optional
 */
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class MetodosStramAPI {

	public static void main(String[] args) {
		List<String> numeros = Arrays.asList("1", "4", "3", "0", "1", "8", "6", "5", "2", "7");        
		
		System.out.println("Imprima os elementos");
		//lambda
		numeros.forEach(s -> System.out.println(s));
		System.out.println();
		//reference method
		numeros.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Coloque os 5 primeiros dentro de um set");
		Set<String> collectorSet = numeros.stream()
		       .limit(5) 
		       .collect(Collectors.toSet()); //coloque dentro de um set
		collectorSet.forEach(s -> System.out.println(s));
		System.out.println();
		
		System.out.println("Trasformar de string para inteiro");
		List<Integer> collectorList =	numeros.stream()
				.map(s -> Integer.parseInt(s))
					//ou  map.(Integer::parseInt);
				.collect(Collectors.toList()); //coloca em um list
		System.out.println();
		
		
		System.out.println("Colocar números pares maiores que 2 em uma lista");
		List<Integer> ListPares = numeros.stream()
				.map(Integer::parseInt)
				.filter(i -> (i%2 == 0 && i > 2))
				.collect(Collectors.toList());
		System.out.println(ListPares);
		System.out.println();
		
		
		System.out.println("Mostre a media dos números");
		numeros.stream()
				.mapToInt(s -> Integer.parseInt(s))
				.average() 
				.ifPresent(System.out::println);//se a media existir retorna
		System.out.println();
		
		//não usa stram porque não modifica a fonte
		System.out.println("Remova os valores impares");
		collectorList.removeIf(i -> (i%2 != 0));
		System.out.println(collectorList);
		
		
	}

}
