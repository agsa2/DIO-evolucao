package com.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

	private NoDuplo<T> primeiro;
	private NoDuplo<T> ultimo;
	private int        tamanho;
	
	public ListaDuplamenteEncadeada() {
		this.primeiro = null;
		this.ultimo   = null;
		this.tamanho  = 0;
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setProx(null);
		novoNo.setPrev(ultimo);
		
		if (primeiro == null) {
			primeiro  = novoNo;
		}
		
		if (ultimo != null) {
			ultimo.setProx(novoNo);
		}
		
		this.ultimo = novoNo;
		this.tamanho++;
	}
	
	public void add(int index ,T elemento) {
		NoDuplo<T> noAux  = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo(elemento);
		novoNo.setProx(noAux);
		
		if (novoNo.getProx() != null) {
			novoNo.setPrev(noAux.getPrev());
			novoNo.getProx().setPrev(novoNo);
		}
		else {
			novoNo.setPrev(ultimo);
			ultimo = novoNo;
		}
		
		if (index == 0) {
			primeiro = novoNo;
		}
		else {
			novoNo.getPrev().setProx(novoNo);
		}
		
		this.tamanho++;
		
	}
	
	public void remove(int index) {
		if (index == 0) {
			primeiro = primeiro.getProx();
			
			if (primeiro != null) {
				primeiro.setPrev(null);
			}
		}
		else {
			NoDuplo<T> noAux = getNo(index);
			noAux.getPrev().setProx(noAux.getProx());
			
			if (noAux != ultimo) {
				noAux.getProx().setPrev(noAux.getPrev());
			}
			else {
				ultimo = noAux;
			}
		}
		
		this.tamanho--;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	private NoDuplo<T> getNo(int index){
		NoDuplo<T> noAux = primeiro;
		
		for (int i = 0; (i < index) && (noAux != null); i++) {
			noAux = noAux.getProx();
		}
		
		return noAux;
	}
	
	public int size() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		String retorno = "";
		NoDuplo<T> noAux = primeiro;
		
		for (int i = 0; i < size(); i++) {
			retorno += "{No[conteudo: "+ noAux.getConteudo() +"]} -->";
			noAux = noAux.getProx();
		}
		
		retorno += "null";
		return retorno;
	}
	
	
}
