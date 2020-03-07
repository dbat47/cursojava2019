package controller;

import javax.swing.JOptionPane;

public class Questao09 {

	public static void main(String[] args) {
	
    String[] nome= new String[5];
	String[] profissao =new String[5];
	
		for(int i=0; i<nome.length;i++) {
			
			nome[i]=JOptionPane.showInputDialog("informe o nome :");
			profissao[i]= JOptionPane.showInputDialog("INforme sua profissão "+i+":");
			
		}
		StringBuffer bufferSaida= new StringBuffer("nomes e profissões:\n");
		for (int i=0;i<profissao.length; i++) {
			bufferSaida.append(i+" - Nome: "+nome[i]+" - profissão: "+profissao[i]+"\n");
			
		}
		
		JOptionPane.showMessageDialog(null, bufferSaida.toString());
	}

}
