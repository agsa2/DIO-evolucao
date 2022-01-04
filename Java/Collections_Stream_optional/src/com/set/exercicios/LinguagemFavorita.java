package com.set.exercicios;

import java.util.Comparator;

public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

	private String nome;
	private int    anoCriação;
	private String ide;
	
	
	public LinguagemFavorita(String nome, int anoCriação, String ide) {
		this.nome       = nome;
		this.anoCriação = anoCriação;
		this.ide        = ide;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoCriação() {
		return anoCriação;
	}


	public void setAnoCriação(int anoCriação) {
		this.anoCriação = anoCriação;
	}


	public String getIde() {
		return ide;
	}


	public void setIde(String ide) {
		this.ide = ide;
	}

	

	@Override
	public String toString() {
		return "LinguagemFavorita [nome=" + nome + ", anoCriação=" + anoCriação + ", ide=" + ide + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anoCriação;
		result = prime * result + ((ide == null) ? 0 : ide.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		LinguagemFavorita other = (LinguagemFavorita) obj;
		if (anoCriação != other.anoCriação)
			return false;
		if (ide == null) {
			if (other.ide != null)
				return false;
		} else if (!ide.equals(other.ide))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}


	@Override
	public int compareTo(LinguagemFavorita ling) {
			return this.getNome().compareTo(ling.getNome());
	}
	
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		int linguagem = ling1.getIde().compareTo(ling2.getIde());
		return linguagem;
	}

}


class ComparatorAnoCriacao implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		int linguagem = Integer.compare(ling1.getAnoCriação(), ling2.getAnoCriação());
		return linguagem;
	}
	
}


class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
		int nome = ling1.getNome().compareTo(ling2.getNome());
		if (nome != 0) return nome;
		
		int ano = Integer.compare(ling1.getAnoCriação(), ling2.getAnoCriação());
		if (ano != 0) return ano;
		
		return ling1.getIde().compareTo(ling2.getIde());
	}
	
}




