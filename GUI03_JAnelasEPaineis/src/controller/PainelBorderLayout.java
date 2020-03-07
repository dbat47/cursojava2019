package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelBorderLayout extends JFrame {

	public PainelBorderLayout () {
		super("Titulo do Painel");
		ImageIcon icone=new ImageIcon("img/apartamento.png");
		ImageIcon icone2=new ImageIcon("img/gta.png");
		ImageIcon icone3=new ImageIcon("img/bat.jpg");
		
		JLabel labelTexto=new JLabel("geovanni viado");
		JLabel label1=new JLabel(icone);
		JLabel label2=new JLabel(icone2);
		JLabel label3=new JLabel(icone3);
		
		/*
		JPanel painel=new JPanel();
		painel.setLayout(new GridLayout(2,2));
		
		
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		*/
		
		
		JPanel painelIcones= new JPanel();
		painelIcones.add(label1);
		painelIcones.add(label2);
		painelIcones.add(label3);
		
		JPanel painelTexto= new JPanel();
		painelTexto.add(labelTexto);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new GridLayout(2,1));
		
		painelPrincipal.add(painelTexto);
		painelPrincipal.add(painelIcones);
		
		
		
		
		
		
		
		
		
		add(painelPrincipal);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Coloca a janela no tamanho nescessario
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new PainelBorderLayout();
		
		
		
		

	}

}
