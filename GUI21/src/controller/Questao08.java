package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Questao08 {

	public static void main(String[] args) {
		
		/*
		String local=JOptionPane.showInputDialog("informe a sigla do seu estado :");
		
		switch (local) {
		case "RJ":
			JOptionPane.showMessageDialog(null, "vc é carioca");
			break;
		case "SP":
			JOptionPane.showMessageDialog(null, "vc é paulista");
			break;
		case "MG":
			JOptionPane.showMessageDialog(null, "vc é mineiro");
			break;
		default:
			JOptionPane.showMessageDialog(null, "vc é de outro estado");
			break;
		}
		*/
		String[] siglas= {"RJ","SP","MG","OUTROS"};
		
		ImageIcon icone=new ImageIcon("img/home.png");
		
		Object objeto=JOptionPane.showInputDialog(null, "Qual seu estado", "Questao08", JOptionPane.PLAIN_MESSAGE, icone, siglas, siglas[0]);
		
		switch (objeto.toString()) {
		case "RJ":
			JOptionPane.showMessageDialog(null, "carioca");
			break;

		default:
			break;
		}
		
	}

}
