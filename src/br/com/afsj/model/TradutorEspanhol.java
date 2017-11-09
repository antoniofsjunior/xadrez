package br.com.afsj.model;

import javax.swing.Icon;

public class TradutorEspanhol implements Tradutor, Icone {

	@Override
	public String traduzir(String palavra) {

		if (palavra == null)
			return null;
		
		String translation;
		switch (palavra.toLowerCase()) {
		case "xadrez":
			translation = "Ajedrez";
			break;
		default:
			translation = null;
			break;
		}
		return translation;
	}

	@Override
	public Icon traduzirIcone(String palavra) {
		// TODO Auto-generated method stub
		return null;
	}

}
