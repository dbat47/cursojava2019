package controller;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class Abas extends JFrame {

	
	JTabbedPane abas = new JTabbedPane();
	
	JLabel label1 = new JLabel("label painel1");
	JPanel painel1 = new JPanel();
	
	JLabel label2 = new JLabel("geovanni é boqueteiro");
	JPanel painel2= new JPanel();
	
	JLabel label3 = new JLabel("a vida ta intensa");
	JPanel painel3= new JPanel();
	
	ImageIcon icone= new ImageIcon("img/linux.png");
	ImageIcon icone2= new ImageIcon("img/bat.jpg");
	ImageIcon icone3= new ImageIcon();
	
	public Abas() {
		//titulo da janela
		super("Exemplo Abas");
		
		painel1.add(label1);
		painel2.add(label2);
		painel3.add(label3);
		
		abas.addTab("MAth", icone, painel1,"primeiro painel");
		abas.addTab("vida ta dura", icone2, painel2, "Segundo painel");
		abas.addTab("vida casca grossa", icone3, painel3,"terceiro painel");
		
		Container container = getContentPane();
		container.add(abas);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new Abas();
		
		
		
		
	}

}
