package com.RPN2;

public class ListaToken {

	private NoToken refEntrada;

	public ListaToken() {
		this.refEntrada = null;
	}
	
	public boolean isEmpty() {
		return (refEntrada == null);
	}
	
	public int size() {
		int tamanhoLista = 0;
		NoToken refAux = refEntrada;

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
	
	public void add(Token dados) {
		NoToken novoNo = new NoToken(dados);
		
		if (this.isEmpty()) {
			refEntrada = novoNo;
			return;
		}
		
		NoToken noAux = refEntrada;
		for (int i=0; i < this.size()-1; i++) {
			noAux = noAux.getProxNo();
		}
		
		noAux.setProxNo(novoNo);
	}
	
			
		
	@Override
	public String toString() {
		String retorno = "";
		NoToken noAux = refEntrada;
		
			for (int i = 0; i < size(); i++) {
				retorno += "Token [type=" + noAux.getConteudo().type + ", lexeme=" + noAux.getConteudo().lexeme + "]\n";
				noAux = noAux.getProxNo();
				}
		
		return retorno;
	}
}
