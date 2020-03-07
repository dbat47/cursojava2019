package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Mensagem 1");
		
		JOptionPane.showMessageDialog(null, "Mensagem 2", "título da mensagem 2",JOptionPane.ERROR_MESSAGE);
		
		ImageIcon icone= new ImageIcon("img/gta.png");
		
		JOptionPane.showMessageDialog(null, "Se fodeu", "Título da mensagem 3", JOptionPane.PLAIN_MESSAGE, icone);
		
		ImageIcon img= new ImageIcon("img/apartamento.png");
		
		JOptionPane.showMessageDialog(null, "apartamento", "meu apartamento", JOptionPane.PLAIN_MESSAGE,img);
		
		
	}

}
