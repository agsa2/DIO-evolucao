package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class OrdenacaoLista {

	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>() {{
			add(new Gato("Jon"  , 18, "preto"));
			add(new Gato("Simba", 6 , "tigrado"));
			add(new Gato("Jon"  , 12, "amarelo"));
		}};

		System.out.println(gatos);
		System.out.println();
		
		System.out.println("--\tOrdem de Inserção\t--");
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("--\tOrdem aleatoria\t--");
		//embaralha
		Collections.shuffle(gatos);
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("--\tOrdedm Natural (Nome)\t--");
		//collection.sort necessita do metodo compareTo
		Collections.sort(gatos);
		System.out.println(gatos);
		
		//Quando se quer comparar por mais de um metodo usa-se a interface Comparator
		System.out.println("--\tOrdenar por Idade\t--");
		//Collections.sort(gatos, new ComparatorIdade());
		//ou
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("--/tOrdenar por cor/t--");
		Collections.sort(gatos, new ComparatorCor());
		//ou
		//gatos.sort(new ComparatorCor);
		System.out.println(gatos);
		System.out.println();
		
		System.out.println("--/tOrdenar por Nome/Cor/Idade/t--");
		Collections.sort(gatos, new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
		
	}

}

class Gato implements Comparable<Gato>{
	
	private String  nome;
	private Integer idade;
	private String  cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome  = nome;
		this.idade = idade;
		this.cor   = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "\nGato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	//0 = iguais, 1 = é maior, -1 = é menor
		
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato gato1, Gato gato2) {
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato>{

	@Override
	public int compare(Gato gato1, Gato gato2) {
		return gato1.getCor().compareToIgnoreCase(gato2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
	
	@Override
	public int compare(Gato gato1, Gato gato2) {
		int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
		
		if (nome != 0) return nome;
		
		int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
		
		if (cor != 0) return cor;
		
		return Integer.compare(gato1.getIdade(), gato2.getIdade());
	}
	
}


