package br.com.afsj.control;

import br.com.afsj.model.Tabuleiro;
import br.com.afsj.model.TradutorEspanhol;
//import br.com.afsj.model.TradutorIngles;

public class Xadrez {
	
	public static final int corPRETA = 0;
	public static final int corBRANCA = 1;
	public static final int tamanhoQuadrado = 45;

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		tabuleiro.iniciar(new TradutorEspanhol());
	}

}
