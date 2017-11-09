package br.com.afsj.model;

public class Cavalo extends Peca {
	
	@Override
	public boolean mover(int x, int y) {
		if (posX == -1 && posY == -1) {
			posX = x;
			posY = y;
			return true;
		}
		if ( ( (x == posX+2 || x == posX-2) && (y == posY-1 || y == posY+1) ) ||
			 ( (x == posX+1 || x == posX-1) && (y == posY-2 || y == posY+2) ) ) {
			posY = y;
			posX = x;
			return true ;
		}
		return false;
	}
}
