package controller;

import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {
		
	double	n1=Double.parseDouble(JOptionPane.showInputDialog("informe um numero ?"));
	double d=n1/2;
	
	if(n1>20){
		JOptionPane.showMessageDialog(null, "O valor maior que 20 foi dividido "+ d );
	}else {
		
		JOptionPane.showMessageDialog(null, "o numero menor que 20 não é mexido: "+n1);
	}
		
		
		

	}

}
