package com.RPN2;

public class NoToken {


	private Token  dados;
	private NoToken refNo;
	
	public NoToken() {
	}
	
	public NoToken(Token dados) {
		this.dados = dados;
		this.refNo  = null;
	}

	public NoToken(Token dados, NoToken refNo) {
		this.dados = dados;
		this.refNo   = refNo;
	}

	public Token getConteudo() {
		return dados;
	}

	public void setConteudo(Token dados) {
		this.dados = dados;
	}

	public NoToken getProxNo() {
		return refNo;
	}

	public void setProxNo(NoToken refNo) {
		this.refNo = refNo;
	}
}












