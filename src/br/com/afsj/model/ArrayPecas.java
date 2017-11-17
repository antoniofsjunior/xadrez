package br.com.afsj.model;

import java.util.ArrayList;

public class ArrayPecas extends ArrayList<Peca> {
	
	Peca pecaPosicao(int x, int y) {
		// Retorna a Peça que está na posição indicada
		// Retorna null, caso não haja peças nessa posição
		Peca p;
		for (int i = 0; i < this.size(); i++) {
			p = this.get(i);
			if ((p.getPosX() == x) && (p.getPosY() == y))
				return p;
		}
		return null;
	}
	
	ArrayPecas pecasParaPosicao(int x, int y) {
		// Retorna um Array contendo as peças que podem ir a uma dada posição.
		ArrayPecas pRetorno = new ArrayPecas();
		Peca p;
		for (int i = 0; i < this.size(); i++) {
			p = this.get(i);
			if (p.movimentoOK(x, y))
				pRetorno.add(p);
		}
		return pRetorno;		
	}
	
	boolean posicaoLivreAtaque(int x, int y) {
		// Retorna true se nenhuma peça pode atacar esta posição
		// Retorna false se pelo menos uma peça pode atacar a posição
		for (int i = 0; i < this.size(); i++) {
			if (this.get(i).movimentoOK(x, y))
				return false;
		}
		return true;		
		
	}
}
