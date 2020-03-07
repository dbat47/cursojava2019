package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaHeranca extends JFrame {

	public JanelaHeranca() {

		super("Titulo da JanelaHerança");

		setSize(500, 300);

		// Não permito redmensionamento
		setResizable(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icone = new ImageIcon("img/linux.png");

		setIconImage(icone.getImage());

		// ponto da matriz

		// janela.setLocation(100, 200);

		// Centralizar a tela
		setLocationRelativeTo(null);

		setVisible(true);

	}

	public static void main(String[] args) {

		
		new JanelaHeranca();
		
		
		
		
	}

}
