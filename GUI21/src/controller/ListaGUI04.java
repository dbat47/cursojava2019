package controller;

import javax.swing.JOptionPane;

public class ListaGUI04 {

	public static void main(String[] args) {
		
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int s=n1+1;
		int a=n1-1;
		JOptionPane.showConfirmDialog(null, "O antecessor �: "+a+"\no numero �: "+n1+ "\no seu sucessor �: "+s);
	}

}
