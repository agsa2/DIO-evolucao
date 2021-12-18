package com.fila;

public class Main {

	public static void main(String[] args) {
		
		Fila<String> fila = new Fila<>();
		
		fila.enqueue("primeiro");
		fila.enqueue("segubdo");
		fila.enqueue("terceiro");
		fila.enqueue("quarto");
		
		System.out.println(fila.toString());
		System.out.println(fila.dequeue());
		System.out.println(fila.first());
		System.out.println(fila);
		
	}

}
