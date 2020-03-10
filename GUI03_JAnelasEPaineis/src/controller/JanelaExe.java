package controller;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class JanelaExe extends JFrame {

	JTabbedPane abas=new JTabbedPane();
	
	ImageIcon fusca= new ImageIcon("img/fusca.jpg");
	ImageIcon toro= new ImageIcon("img/toro.jpg");
	ImageIcon chevette= new ImageIcon("img/chevette.jpg");
	
	JLabel lbl= new JLabel(fusca);
	JLabel lbl2= new JLabel(toro);
	JLabel lbl3 = new JLabel(chevette);
	
	JPanel painel= new JPanel(new GridLayout(2,2));
	
	
	
	JPanel painel2=new JPanel();	
	JPanel painel3=new JPanel();
	
	public JanelaExe() {
		
		super("Catálogo de Carros");
		
		painel.add(lbl);
		painel2.add(lbl2);
		painel3.add(lbl3);
		
		
		
		abas.addTab("Carro 1", painel );
		abas.addTab("Carro 2", painel2);
		abas.addTab("carro 3", painel3);
		
		Container container = getContentPane();
		container.add(abas);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,500);
		setVisible(true);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new JanelaExe();
		
		

	}

}
