package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setTitle("Título da Janela.");

		janela.setSize(500, 300);
		
		//Não permito redmensionamento 
		janela.setResizable(false);
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone= new ImageIcon("img/linux.png");
		
		janela.setIconImage(icone.getImage());
		
		//ponto da matriz
		
		//janela.setLocation(100, 200);
		
		//Centralizar a tela 
		janela.setLocationRelativeTo(null);
		
		
		janela.setVisible(true);
		

	}

}
