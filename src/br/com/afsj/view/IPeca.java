package br.com.afsj.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.JLabel;

import br.com.afsj.control.Xadrez;
import br.com.afsj.model.Peca;
import br.com.afsj.model.Tabuleiro;

public class IPeca {
	
	// Atributos
	protected Icon iconeBranco;
	protected Icon iconeMarrom;
	protected JLabel imagem;
	protected Peca p;
	
	// Métodos

	public IPeca(Peca np) {
		this.p = np;
		this.imagem = new JLabel();
		this.imagem.setHorizontalAlignment(JLabel.LEFT);
		this.imagem.setVerticalAlignment(JLabel.TOP);
		
		IPeca ip = this;

		this.imagem.addMouseListener(new MouseAdapter() 
		{
		    @Override
		    public void mouseClicked(MouseEvent e) 
		    {
		    	Tabuleiro.avaliarEventoPeca(p, ip);		    	
		    }
		});

	}
	public void marcar() {
		System.out.println("Marcado");
	}
	
	public void desmarcar() {
		System.out.println("Desmarcado");		
	}
	
	public void remover() {
		imagem.setVisible(false);
		imagem.setEnabled(false);
	}
	
	public void mover(int posX, int posY) {
		int posXTela = Xadrez.tamanhoQuadrado * posX;
		int posYTela = Xadrez.tamanhoQuadrado * posY;
		
		if ( ((posX + posY) % 2) == 0 )
			imagem.setIcon(iconeBranco);
		else
			imagem.setIcon(iconeMarrom);
		
		imagem.setBounds(posXTela, posYTela, Xadrez.tamanhoQuadrado, Xadrez.tamanhoQuadrado);
	}
	
	public void setIconeBranco(Icon i) {
		this.iconeBranco = i;
	}
	
	public void setIconeMarrom(Icon i) {
		this.iconeMarrom = i;
	}
	
	public JLabel getImagem() {
		return this.imagem;
	}
}
