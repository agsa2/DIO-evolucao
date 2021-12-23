package com.pilha;

public class No {
	
	private int dados;
	private No  prox;
	
	
	
	public No() {
		this.prox = null;
	}

	public No(int dados) {
		this.dados = dados;
		this.prox  = null;
	}

	public int getDados() {
		return dados;
	}

	public void setDados(int dados) {
		this.dados = dados;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}

	@Override
	public String toString() {
		return "No [dados=" + dados + "]";
	}
	
	

}
