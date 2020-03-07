package controller;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		
		
		JFrame tela = new JFrame ("Programação Desktop");
		
		JLabel texto = new JLabel("Alô, Mundo!");
		
		
		
		
		tela.getContentPane().add(texto);
		//(x, y, width, height)
		//((x,y)pixel-matriz na ponta da esquerda))(largura, altura 
		
		texto.setBounds(30, 20, 210,20 );
		
		
		
		tela.setLayout(null);
		//largura, altura
		tela.setSize(4000,1000);
		tela.setVisible(true);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		

	}

}
