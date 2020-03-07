package controller;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		
		String nome,sexo;
		int idade;
		nome=JOptionPane.showInputDialog("Informe seu nome");
		sexo= JOptionPane.showInputDialog("informe seu sexo");
		idade=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
		JOptionPane.showConfirmDialog(null, "Nome: "+nome+"\nSexo: "+sexo+ "\nIdade: "+idade);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
