package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {

	public static void main(String[] args) {
		

		Set<Serie> series = new HashSet<Serie>(){{
			
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));

		}};
		System.out.println("--\tOrdem Aleatoria\t--");
		
		for (Serie serie: series) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + 
					" - " + serie.getTempEpisodio());
		}
		System.out.println();
		
		
		System.out.println("--\tOrdem de Inserção\t--");
		Set<Serie> series2 = new LinkedHashSet<>() {{
			
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comedia", 25));	
		}};
		
		for (Serie serie: series2) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + 
					" - " + serie.getTempEpisodio());
		}
		System.out.println();
		
		
		
		System.out.println("--\tOrdem Natural (TmpoEpisodio)\t--");
		Set<Serie> series3 = new TreeSet<>(series);
		for (Serie serie : series3) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + 
					" - " + serie.getTempEpisodio());
		}
		System.out.println();
		
		
		
		System.out.println("--\tOrdenar por Nome/Gênero/TempoEpisodio\t--");
		Set<Serie> series4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		series4.addAll(series);
		
		for (Serie serie : series4) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + 
					" - " + serie.getTempEpisodio());
		}
		System.out.println();
		
		System.out.println("--\tOrdenar por Gênero\t--");
		Set<Serie> series5 = new TreeSet<>(new ComparatorGenero());
		series5.addAll(series);
		
		for (Serie serie : series5) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + 
					" - " + serie.getTempEpisodio());
		}
		System.out.println();
		
		System.out.println("--\tOrdenar por TempoEpisodio\t--");
		Set<Serie> series6 = new TreeSet<>(new ComparatorTempoEpisodio());
		series6.addAll(series);
		
		for (Serie serie : series6) {
			System.out.println(serie.getNome() + " - " + serie.getGenero() + 
					" - " + serie.getTempEpisodio());
		}
			
	}

}

