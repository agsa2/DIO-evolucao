package com.RPN2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Path path = Paths.get("/home/alvaro/Downloads/Calc1.stk"); //caminho para o arquivo
		
		Pilha pilha = new Pilha();
		ListaToken listaT = new ListaToken();
		
		List<String> linhas = Files.readAllLines(path);
		
		for (String l : linhas) {
			
			String op = l;
			
			if (op.equals("+")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 + value2;
				
				pilha.push(new No(value));
				listaT.add(new Token(TokenType.PLUS, op));
				
			} else if (op.equals("-")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 - value2;
				
				pilha.push(new No(value));
				listaT.add(new Token(TokenType.MINUS, op));
				
			} else if (op.equals("*")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 * value2;
				
				pilha.push(new No(value));
				listaT.add(new Token(TokenType.STAR, op));
				
			} else if (op.equals("/")) {
				int value1 = pilha.pop().getDados();
				int value2 = pilha.pop().getDados();
				
				int value = value1 / value2;
				
				pilha.push(new No(value));
				listaT.add(new Token(TokenType.SLASH, op));
				
			} else {
				boolean isNumeric =  op.matches("[+-]?\\d*(\\.\\d+)?");//verificar se "op" é um valor numerico
				
					if (isNumeric) {
						pilha.push(new No(Integer.valueOf(op)));
						listaT.add(new Token(TokenType.NUM, op));
						
					} else {
						System.out.println("Erro: Unexpected character: " + op);
						throw new Exception();
					}
				
			}
			
		}
		
		System.out.println(listaT);
		System.out.println();
		System.out.println(pilha.pop().getDados());

	}

}













