package com.listaCircular;

public class No<T> {

	private T     conteudo;
	private No<T> prox;
	
	public No(T conteudo) {
		this.conteudo = conteudo;
		this.prox     = null;
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No<T> getProx() {
		return prox;
	}

	public void setProx(No<T> prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return "No [conteudo=" + conteudo + "]";
	}
	
	
	
}
