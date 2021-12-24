package com.listaEncadeada;

public class ListaEncadeada<T> {
	
	private No<T> refEntrada;
	
	
	public ListaEncadeada() {
		this.refEntrada = null;
	}
	
	public boolean isEmpty() {
		return (refEntrada == null);
	}
	
	public int size() {
		int tamanhoLista = 0;
		No<T> refAux = refEntrada;

		while(true) {
			if (refAux != null) {
				tamanhoLista++;
				if (refAux.getProxNo() != null) {
					refAux = refAux.getProxNo();
				}
				else {
					break;
				}
			}
			else {
				break;
			}
		}
		return tamanhoLista;
	}
	
	public void add(T conteudo){
		No<T> novoNo = new No<>(conteudo);
		
		if (this.isEmpty()) {
			refEntrada = novoNo;
			return;
		}
		
		No<T> noAux  = refEntrada;
		for (int i = 0; i < this.size()-1; i++) {
			noAux = noAux.getProxNo();
		}
		
		noAux.setProxNo(novoNo);
	}
	
	private No<T> getNo(int index) {
		validar(index);
		
		No<T> noAux = refEntrada;
		No<T> noRetorno = null;
		
		for (int i = 0; i <= index; i++) {
			noRetorno = noAux;
			noAux = noAux.getProxNo();
		}
		
		return noRetorno;
	}
	
	private void validar(int index) {
		if (index >= size()) {
			int ultimo = size()-1;
			throw new IndexOutOfBoundsException("O indice "+ index +"não pertence a lista. O tamanho da lista vai até "+ ultimo +".");
		}
	}
	
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		
		if (index == 0) {
			refEntrada = noPivor.getProxNo();
			return noPivor.getConteudo();
		}
		
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProxNo(noPivor.getProxNo());
		return noPivor.getConteudo();
	}

	@Override
	public String toString() {
		String retorno = "";
		No<T> noAux = refEntrada;
		
		for (int i = 0; i < size(); i++) {
			retorno += "No [" + noAux.getConteudo() + "] --> ";
			noAux = noAux.getProxNo();
		}
		retorno += "null";
		return retorno;
	}
	
	
	
	
}






















