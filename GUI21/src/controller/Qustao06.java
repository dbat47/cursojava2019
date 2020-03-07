package controller;

import javax.swing.JOptionPane;

public class Qustao06 {

	public static void main(String[] args) {
		String br="Brasilia";
		br=JOptionPane.showInputDialog("informe a capital do brasil");
		
		
		
		if(br.equalsIgnoreCase("Brasilia")) {
			
			JOptionPane.showMessageDialog(null, "A capital está correta: "+br);
		}else {
			JOptionPane.showMessageDialog(null, "Capital incorreta");
		}
		

	}

}
