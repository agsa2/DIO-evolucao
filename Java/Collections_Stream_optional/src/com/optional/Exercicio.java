package com.optional;

import java.util.Optional;

public class Exercicio {

	public static void main(String[] args) {
		
		Optional<Integer> optionalVazio = Optional.empty();
		Optional<Integer> optionalPresente = Optional.of(10);
		Optional<Integer> optionalNull = Optional.ofNullable(null);
		
		
		
		if (optionalPresente.isPresent()) {
			int valor = optionalPresente.get();
			System.out.println(valor);
			
		} else {
			optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
			optionalPresente.orElseThrow(IllegalStateException::new);
		}
		optionalPresente.map((valor) -> valor.toString()).ifPresent(System.out::println);

		
		if (optionalNull.isPresent()) {
			int valor = optionalNull.get();
			System.out.println(valor);
			
		} else {
			optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
			optionalNull.orElseThrow(IllegalStateException::new);
		}
		optionalNull.map((valor) -> valor.toString()).ifPresent(System.out::println);

		
		if (optionalVazio.isPresent()) {
			int valor = optionalVazio.get();
			System.out.println(valor);
			
		} else {
			optionalVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
			optionalVazio.orElseThrow(IllegalStateException::new);
		}
		optionalVazio.map((valor) -> valor.toString()).ifPresent(System.out::println);

		
	}

}
