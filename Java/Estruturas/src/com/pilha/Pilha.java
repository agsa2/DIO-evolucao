package com.pilha;

public class Pilha {

	private No refNo;

	public Pilha() {
		this.refNo = null;
	}
	
	public boolean isEmpty() {
		return (refNo == null);
	}
	
	public No top() {
		return refNo;
	}
	
	public void push(No novoNo) {
		No auxNo = refNo;
		refNo = novoNo;
		refNo.setProx(auxNo);
	}
	
	public No pop() {
		if (!this.isEmpty()) {
			No poped = refNo;
			refNo = refNo.getProx();
			return poped;
		}
		return null;
	}
	
	
	public String toString() {
		
		String retorno = "-----------\n";
		retorno += "Pilha\n";
		retorno += "-----------\n";
		
		No noAux = refNo;
		
		while (true) {
			if (noAux != null) {
				retorno += "[No{dado=" + noAux.getDados() + "}]\n";
				noAux = noAux.getProx();
			} else {
				break;
			}
		}
		
		retorno += "==========\n";
		return retorno;
	}
	
	

	
}
