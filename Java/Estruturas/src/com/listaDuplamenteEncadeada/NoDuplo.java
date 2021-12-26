package com.listaDuplamenteEncadeada;

public class NoDuplo<T> {

	private T       conteudo;
	private NoDuplo prox;
	private NoDuplo prev;
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoDuplo getProx() {
		return prox;
	}

	public void setProx(NoDuplo prox) {
		this.prox = prox;
	}

	public NoDuplo getPrev() {
		return prev;
	}

	public void setPrev(NoDuplo prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "NoDuplo [conteudo=" + conteudo + "]";
	}
	
	
	
	
	
}
