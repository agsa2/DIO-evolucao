package com.RPN;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("/home/alvaro/Downloads/Calc1.stk"); //caminho para o arquivo
		
		Pilha pilha = new Pilha();
		List<String> linhas = Files.readAllLines(path);
		
		for (String l : linhas) {
			
			String op = l;
			
			if (op.equals("+")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 + value2;
				
				pilha.push(new No(value));
				
			} else if (op.equals("-")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 - value2;
				
				pilha.push(new No(value));
				
			} else if (op.equals("*")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 * value2;
				
				pilha.push(new No(value));
				
			} else if (op.equals("/")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 / value2;
				
				pilha.push(new No(value));
				
			} else {
				pilha.push(new No(Integer.valueOf(op)));
			}
			
		}
		
		System.out.println(pilha.pop().getDados());

	}

}
