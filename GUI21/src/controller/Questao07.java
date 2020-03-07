package controller;

import javax.swing.JOptionPane;

public class Questao07 {

	public static void main(String[] args) {
		
	int numero = Integer.parseInt(JOptionPane.showInputDialog("informe um numero: "));
		/*
		String saida="tabuada do "+numero+":\n";
		int i = 1;
		while(i<=10) {
			saida= saida+ numero+" . "+i+"="+(numero*i)+"\n";
			i++;
		}
		
JOptionPane.showMessageDialog(null, saida);
	*/
	StringBuffer bufferSaida= new StringBuffer("Tabuada do "+numero+":\n");
	int i = 1;
	while(i<=10) {
	//append = inserir no final
		bufferSaida.append(numero+" . "+i+"="+(numero*i)+"\n");
		i++;
	}
	
	
	
	}
	

}
