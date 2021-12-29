package com.arvoreBinaria;

import com.arvoreBinaria.model.Obj;

public class Main {

	public static void main(String[] args) {
		
		ArvoreBinaria<Obj> AB = new ArvoreBinaria<>();
		
		AB.inserir(new Obj(13));
		AB.inserir(new Obj(10));
		AB.inserir(new Obj(25));
		AB.inserir(new Obj(2));
		AB.inserir(new Obj(12));
		AB.inserir(new Obj(20));
		AB.inserir(new Obj(31));
		AB.inserir(new Obj(29));
		
		AB.exibirInOrdem();
		AB.exibirPreOrdem();
		AB.exibirPosOrdem();
		
		AB.inserir(new Obj(32));
		AB.exibirInOrdem();
		AB.remover(new Obj(32));
		AB.remover(new Obj(31));
		AB.exibirInOrdem();



	}

}
