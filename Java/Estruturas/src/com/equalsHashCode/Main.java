package com.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listaCarros = new ArrayList<>();

		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Fiat"));
		listaCarros.add(new Carro("Chevrolet"));
		
		System.out.println(listaCarros.contains(new Carro("Ford")));
		
		System.out.println(new Carro("Ford").hashCode());
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Fiat");
		System.out.println(carro1.equals(carro2));
	}

}
