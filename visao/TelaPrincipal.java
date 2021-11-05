package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 10);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");// Nome do Jogo
		setSize(690, 438);// Tamanho da tela do Jogo
		setLocationRelativeTo(null);// tela centralizada
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//quando fechar a tela, mata o processo
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new TelaPrincipal();
		
	}

}
