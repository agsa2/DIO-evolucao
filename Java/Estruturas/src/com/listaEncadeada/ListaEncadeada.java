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
	
	//private No<T> getNo(int index) {
		
	//}
}






















