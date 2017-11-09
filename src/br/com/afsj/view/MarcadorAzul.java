package br.com.afsj.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import br.com.afsj.control.Xadrez;

public class MarcadorAzul extends JPanel {
	
	private static final long serialVersionUID = 1L;
	int posXTela;
	int posYTela;
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect(posXTela, posYTela, Xadrez.tamanhoQuadrado, Xadrez.tamanhoQuadrado);
	}
	
	public MarcadorAzul(int x, int y) {
		this.posXTela = x;
		this.posYTela = y;
	}

}
