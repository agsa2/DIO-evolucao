package com.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {

	public static void main(String[] args) {
		
		System.out.println("Ordem Aleatoria");
		
		Map<String, Livro> livros = new HashMap<>() {{
			
			put("Hawking, Stephen"  , new Livro("Uma breve historia do tempo ", 256));
			put("Duhigg, Charles "  , new Livro("O Poder do Hábito, paginas"  , 408));
			put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21"  , 432));
		}};
		for (Map.Entry<String, Livro> entry : livros.entrySet()) {
			System.out.println(entry.getKey() + " - " +
							   entry.getValue().getNome() + " - " +
							   entry.getValue().getPaginas());
		}
		System.out.println();
		
		System.out.println("Ordem de inserção");
		Map<String, Livro> livros1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen"  , new Livro("Uma breve historia do tempo ", 256));
			put("Duhigg, Charles "  , new Livro("O Poder do Hábito, paginas"  , 408));
			put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21"  , 432));
		}};
		
		for (Map.Entry<String, Livro> entry : livros1.entrySet()) {
			System.out.println(entry.getKey() + " - " +
							   entry.getValue().getNome() + " - "+
							   entry.getValue().getPaginas());
		}
		System.out.println();
		
		System.out.println("ordem alfabetica dos autores");
		Map<String, Livro> livros2 = new TreeMap<>(livros);
		for (Map.Entry<String, Livro> entry : livros2.entrySet()) {
			System.out.println(entry.getKey() + " - " +
							   entry.getValue().getNome() + " - "+
							   entry.getValue().getPaginas());
		}
		System.out.println();
		
		System.out.println("Comparar por ordem do livro");
		Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
		livros3.addAll(livros.entrySet());
		for (Map.Entry<String, Livro> entry : livros3) {
			System.out.println(entry.getValue().getNome() + " - " +
							   entry.getKey() + " - "+
							   entry.getValue().getPaginas());
		}
		System.out.println();
		
		System.out.println("Ordenar pelo numero de páginas");
		Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPaginas());
		livros4.addAll(livros.entrySet());
		for (Map.Entry<String, Livro> entry : livros4) {
			System.out.println(entry.getValue().getPaginas()+ " - " +
							   entry.getKey() + " - "+
							   entry.getValue().getNome() );
		}
		
	}

}

class Livro {
	private String  nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		this.nome    = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (paginas == null) {
			if (other.paginas != null)
				return false;
		} else if (!paginas.equals(other.paginas))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Livro [nome= " + nome + ", paginas=" + paginas + "]\n";
	}
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas());
	}
}


