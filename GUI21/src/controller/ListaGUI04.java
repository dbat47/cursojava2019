package controller;

import javax.swing.JOptionPane;

public class ListaGUI04 {

	public static void main(String[] args) {
		
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int s=n1+1;
		int a=n1-1;
		JOptionPane.showConfirmDialog(null, "O antecessor é: "+a+"\no numero é: "+n1+ "\no seu sucessor é: "+s);
	}

}
