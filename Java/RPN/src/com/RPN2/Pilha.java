package com.RPN2;

public class Pilha {

	private No refNo;

	public Pilha() {
		this.refNo = null;
	}
	
	public boolean isEmpty() {
		return (refNo == null);
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
	
	
}
