package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout1 extends JFrame {

	public PainelGridLayout1 () {
		super("Titulo do Painel");
		ImageIcon icone=new ImageIcon("img/apartamento.png");
		ImageIcon icone2=new ImageIcon("img/gta.png");
		ImageIcon icone3=new ImageIcon("img/bat.jpg");
		
		JLabel labelTexto=new JLabel("Texto e Imagem no painel");
		JLabel label1=new JLabel(icone);
		JLabel label2=new JLabel(icone2);
		JLabel label3=new JLabel(icone3);
		
		JPanel painel=new JPanel();
		painel.setLayout(new GridLayout(2,2));
		
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		
		add(painel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Coloca a janela no tamanho nescessario
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new PainelGridLayout1();
		
		
		
		

	}

}
