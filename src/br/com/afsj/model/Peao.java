package br.com.afsj.model;

import br.com.afsj.control.Xadrez;

public class Peao extends Peca {
	
	@Override
	public boolean mover(int x, int y) {
		if (posX == -1 && posY == -1) {
			posX = x;
			posY = y;
			return true;
		}
		if (cor == Xadrez.corBRANCA) {
			if ( (x == posX) && (y == posY-1) ) {
				posY = y;
				return true ;
			}
		}

		if (cor == Xadrez.corPRETA) {
			if ( (x == posX) && (y == posY+1) ) {
				posY = y;
				return true ;
			}
		}
		return false;
	}
	
	@Override
	public boolean capturar(int x, int y) {

		//System.out.println(z);

		if (cor == Xadrez.corBRANCA) {
			if ( (x == posX-1 || x == posX+1) && (y == posY-1) ) {
				posX = x;
				posY = y;
				return true ;
			}
		}

		if (cor == Xadrez.corPRETA) {
			if ( (x == posX-1 || x == posX+1) && (y == posY+1) ) {
				posX = x;
				posY = y;
				return true ;
			}
		}
		return false;		
	}
}
