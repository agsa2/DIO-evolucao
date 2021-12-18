package com.fila;

public class Fila<T> {
	
	private No<T> refNoEntrada;

	public Fila() {
		this.refNoEntrada = null;
	}
	
	public boolean isEmpty() {
		return (refNoEntrada == null);
	}
	
	public void enqueue(T object) {
		No novoNo = new No(object);
		novoNo.setRefNo(refNoEntrada);
		refNoEntrada = novoNo;
	}
	
	public T first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntrada;
			
			while(true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}
				else {
					break;
				}
			}
			return (T) primeiroNo.getObject();
		}
		return null;
	}
	
	public T dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntrada;
			No noAux = refNoEntrada;
			
			while(true) {
				if (primeiroNo.getRefNo() != null) {
					noAux = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}
				else {
					noAux.setRefNo(null);
					break;
				}
			}
			
			return (T) primeiroNo.getObject();
		}
		return null;
	}

	@Override
	public String toString() {
		String retorno = "";
		No noAux = refNoEntrada;
		
		if (refNoEntrada != null) {
			while (true) {
				retorno += "[No{objeto = " + noAux.getObject() + "}]-->";
				if (noAux.getRefNo() != null) {
					noAux = noAux.getRefNo();
				}
				else {
					retorno += "null";
					break;
				}
			}
		}
		else {
			retorno = "null";
		}
		
		
		return retorno;
	}
		
	
}
