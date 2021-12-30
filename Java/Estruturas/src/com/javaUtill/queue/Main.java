package com.javaUtill.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Forde"));
		queueCarros.add(new Carro("Fiat"));
		queueCarros.add(new Carro("chevrolet"));
		
		System.out.println(queueCarros);
		
		queueCarros.add(new Carro("Peugeot"));
		System.out.println(queueCarros);
		
		System.out.println(queueCarros.peek());
		queueCarros.poll();
		System.out.println(queueCarros.isEmpty());
		System.out.println(queueCarros);
		System.out.println(queueCarros.size());
		
		
		
		
		
		
		
	}

}
