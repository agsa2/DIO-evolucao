package com.set;

import java.util.Comparator;

public class Serie implements Comparable<Serie>{

	private String nome;
	private String genero;
	private int    tempEpisodio;

	public Serie() {
	}

	public Serie(String nome, String genero, int tempEpisodio) {
		this.nome         = nome;
		this.genero       = genero;
		this.tempEpisodio = tempEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTempEpisodio() {
		return tempEpisodio;
	}

	public void setTempEpisodio(int tempEpisodio) {
		this.tempEpisodio = tempEpisodio;
	}

	
	
	
	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempEpisodio=" + tempEpisodio + "]\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + tempEpisodio;
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
		Serie other = (Serie) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (tempEpisodio != other.tempEpisodio)
			return false;
		return true;
	}

	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempEpisodio(), serie.getTempEpisodio());
		
		if (tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		
		return this.getGenero().compareTo(serie.getGenero());
	}
	
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) {
			return nome;
		}
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) {
			return genero;
		}
		
		return Integer.compare(s1.getTempEpisodio(), s2.getTempEpisodio());
		
	}
	
}

class ComparatorGenero implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		return s1.getGenero().compareTo(s2.getGenero());
	}
	
}

class ComparatorTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		return Integer.compare(s1.getTempEpisodio(), s2.getTempEpisodio());
	}
	
}












