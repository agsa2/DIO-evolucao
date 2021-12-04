package com.no;

public class Main {

	public static void main(String[] args) {

		No no1 = new No("conteudo 1");
		
		No no2 = new No("conteudo 2");
		
		no1.setProx(no2);
		
		No no3 = new No("conteudo 3");
		no2.setProx(no3);

		No no4 = new No("conteudo 4");
		no3.setProx(no4);


		System.out.println(no1.getProx().getProx().getProx());
	}

}
