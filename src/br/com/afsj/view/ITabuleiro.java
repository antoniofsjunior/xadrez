package br.com.afsj.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import br.com.afsj.control.Xadrez;
import br.com.afsj.model.Tabuleiro;

public class ITabuleiro {

	protected JLabel imagem = new JLabel(new ImageIcon("imagens/Tabuleiro.png"));

	public ITabuleiro() {
		
		imagem.setHorizontalAlignment(JLabel.LEFT);
		imagem.setVerticalAlignment(JLabel.TOP);
		imagem.addMouseListener(new MouseAdapter() 
		{
		    @Override
		    public void mouseClicked(MouseEvent e) 
		    {
		    	int x = e.getX() / Xadrez.tamanhoQuadrado;
		    	int y = e.getY() / Xadrez.tamanhoQuadrado;		    	
		    	Tabuleiro.avaliarEventoTabuleiro(x, y);
		    }
		});

	}
	
	public JLabel getImagem() {
		return imagem;
	}

}
