package com.listaEncadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> LEncadeada = new ListaEncadeada<>();
		
		LEncadeada.add("conteudo 1");
		LEncadeada.add("conteudo 2");
		LEncadeada.add("conteudo 3");
		LEncadeada.add("conteudo 4");

		System.out.println(LEncadeada);
		
		System.out.println(LEncadeada.get(2));
		
		System.out.println(LEncadeada.size());
		
		System.out.println(LEncadeada.isEmpty());
		
		LEncadeada.remove(2);
		
		System.out.println(LEncadeada);
		
	}

}
