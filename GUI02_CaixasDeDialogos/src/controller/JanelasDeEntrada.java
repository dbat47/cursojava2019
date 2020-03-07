package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeEntrada {

	public static void main(String[] args) {
		
		String texto1 = JOptionPane.showInputDialog("Janela de entrada 1");
	 JOptionPane.showConfirmDialog(null, "vc digitou: " + texto1);
		
		
		String texto2= JOptionPane.showInputDialog(null, " digite algo?" );
		JOptionPane.showMessageDialog(null, "voce digitou: "+texto2);
		
	String texto3 = JOptionPane.showInputDialog("janela 3", "digite aqui...");
	JOptionPane.showMessageDialog(null, "vc digitou: "+ texto3);

	String texto4 = JOptionPane.showInputDialog(null, "janela 4", "valor inicial...");
	JOptionPane.showMessageDialog(null, "vc digitou: "+texto4);
	
	String texto5 = JOptionPane.showInputDialog(null, "janela 5", "titulo da janela",JOptionPane.WARNING_MESSAGE);
	JOptionPane.showMessageDialog(null, "vc digitou: "+texto5);
	
	
	ImageIcon icone= new ImageIcon("img/apartamento.png");
	
	
	String [] vetor = {"Rodrigo","João","maria","camila","jose"};
	Object objeto= JOptionPane.showInputDialog(null, "janela 6", "titulo da janela", JOptionPane.PLAIN_MESSAGE, icone, vetor,vetor[2] );
	
	JOptionPane.showConfirmDialog(null, "vc escolheu: "+objeto);
	
	}

}
