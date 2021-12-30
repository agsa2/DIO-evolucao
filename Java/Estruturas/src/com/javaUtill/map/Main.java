package com.javaUtill.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String, String> aluno = new HashMap<>();
		
		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3b");
		
		System.out.println(aluno);
		System.out.println(aluno.keySet());
		System.out.println(aluno.values());
		
		List<Map<String, String>> listAluno = new ArrayList<>();
		
		Map<String, String> aluno2 = new HashMap<>();
		
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "19");
		aluno2.put("Media", "10");
		aluno2.put("Turma", "2b");
		
		listAluno.add(aluno);
		listAluno.add(aluno2);
		
		System.out.println(listAluno);
		
		
		
	}

}
