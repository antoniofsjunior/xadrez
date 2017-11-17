package br.com.afsj.model;

public abstract class Peca {
	
	// Atributos
	protected int cor;
	protected int posX = -1;
	protected int posY = -1;
	
	// Métodos
	public int getCor() {
		return cor;
	}
	public void setCor(int cor) {
		this.cor = cor;
	}
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public String getNome(){
		return this.getClass().getName();
	}
	
	public boolean mover(int x, int y) {
		if ( this.movimentoOK(x,y) ) {
			posX = x;
			posY = y;
			return true;
		}
		return false;
	}
	public abstract boolean movimentoOK(int x, int y);
	
	public void remover() {
		this.posX = -1;
		this.posY = -1;
	}
	public boolean capturar(int x, int y) {
		return mover(x,y);
	}
}
