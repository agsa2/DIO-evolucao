package com.listaCircular;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> cauda;
	private int tamanho;
	
	public void ListaCircular() {
		this.cabeca  = null;
		this.cauda   = null;
		this.tamanho = 0;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if (this.tamanho == 0) {
			this.cabeca = novoNo;
			this.cauda  = this.cabeca;
			this.cabeca.setProx(cauda);
		}
		else {
			novoNo.setProx(this.cauda);
			this.cabeca.setProx(novoNo);
			this.cauda = novoNo;
		}
		
		this.tamanho++;
	}
	
	public void remove(int index) {
		if (index >= this.tamanho) {
			throw new IndexOutOfBoundsException("O indice é maior que a lista");
		}
		
		if (index == 0) {
			this.cauda = this.cauda.getProx();
			this.cabeca.setProx(this.cauda);
		}
		else if(index == 1) {
			this.cauda.setProx(this.cauda.getProx().getProx());
		}
		else {
			No<T> noAux = this.cauda;
			
			for (int i = 0; i < index-1; i++) {
				noAux = noAux.getProx();
			}
			
			noAux.setProx(noAux.getProx().getProx());
		}
		
		this.tamanho--;
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	private No<T> getNo(int index){
		if (this.isEmpty()) {
			throw new IndexOutOfBoundsException("A lista está vazia");
		}
		
		if (this.tamanho == 0) {
			return this.cauda;
		}
		
		No<T> noAux = this.cauda;
		for (int i = 0; i < index; i++) {
			noAux = noAux.getProx();
		}
		
		return noAux;
	}
	
	public boolean isEmpty() {
		return (this.tamanho == 0);
	}
	
	public int size() {
		return this.tamanho;
	}
	

	@Override
	public String toString() {
		String retorno = "";
		
		No<T> noAux = this.cauda;
		for (int i = 0; i < this.size(); i++) {
			retorno += "{No[conteudo: "+ noAux.getConteudo() +"]} -->";
			noAux = noAux.getProx();
		}
		
		retorno += this.size() != 0 ? "(Retorna ao início)" : "[]";
		
		return retorno;
	}
	
	
	
	
}
