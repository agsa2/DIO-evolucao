package com.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class MetodosOptional {

	public static void main(String[] args) {
		
		//quando queremos colocar um valor dentro do optional usamos of
		Optional<String> optional = Optional.of("Valor presente");                              
		
		System.out.println("Valor optional presente");
		optional.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));
		System.out.println();
		
		//quado não temos certeza se o valor é null usamos ofNullable
		Optional<String> optional1 = Optional.ofNullable(null);
		
		System.out.println("Valor optional não presente");
		optional1.ifPresentOrElse(System.out::println, () -> System.out.println("null = não está presente"));
		System.out.println();
		
		//Quando temos certeza que é nulo
		Optional<String> optional2 = Optional.empty();
		
		System.out.println("Valor optinal que não está presente");
		optional2.ifPresentOrElse(System.out::println, () -> System.out.println("empty = não está presente"));
		System.out.println();
		
		//Optionals para tipos primitivos
		
		System.out.println("Valor inteiro");
		OptionalInt.of(10).ifPresent(System.out::println);
		System.out.println();
		
		System.out.println("Valor decimal");
		OptionalDouble.of(25.7).ifPresent(System.out::println);
		System.out.println();
		
		System.out.println("Valor longo");
		OptionalLong.of(15l).ifPresent(System.out::println);
		System.out.println();
		
		System.out.println(optional.isPresent());
		System.out.println(optional.isPresent());
		System.out.println();
		
		if (optional.isPresent()) {
			String valor = optional.get();
			System.out.println(valor);
		}
		System.out.println();
		
		optional.map((valor) -> valor.concat("***")).ifPresent(System.out::println);
		
		System.out.println(optional2.orElseThrow(IllegalStateException::new));
		
		

	}

}
