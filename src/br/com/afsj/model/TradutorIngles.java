package br.com.afsj.model;

public class TradutorIngles implements Tradutor {

	@Override
	public String traduzir(String palavra) {

		if (palavra == null)
			return null;
		
		String translation;
		switch (palavra.toLowerCase()) {
		case "xadrez":
			translation = "Chess";
			break;
		default:
			translation = null;
			break;
		}
		return translation;
	}

}
