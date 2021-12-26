package com.listaCircular;

public class Main {

	public static void main(String[] args) {
		
		ListaCircular<String> LC = new ListaCircular<>();
		
		LC.add("c0");
		System.out.println(LC);
		
		LC.add("c1");
		LC.add("c2");
		LC.add("c3");
		LC.remove(0);
		System.out.println(LC);

		LC.add("c4");
		LC.add("c5");
		System.out.println(LC.get(3));
		System.out.println(LC.get(4));
		System.out.println(LC.get(5));
		
		System.out.println();
		
		for (int i = 0; i < 20; i++) {
			System.out.println(LC.get(i));
		}

		System.out.println(LC.size());

	}

}
