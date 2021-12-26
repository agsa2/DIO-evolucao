package com.listaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> LD = new ListaDuplamenteEncadeada<>();

		LD.add("c1");
		LD.add("c2");
		LD.add("c3");
		LD.add("c4");
		LD.add("c5");
		
		System.out.println(LD);
		
		LD.remove(3);
		
		System.out.println(LD);

		LD.add(3, "c99");
		
		System.out.println(LD);

		System.out.println(LD.get(3));
		
		System.out.println(LD.size());
	}

}
