package controller;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor: "));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor "));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
		n4=Integer.parseInt(JOptionPane.showInputDialog("Digite o ultimo valor "));
		
	int	s=n1+n2+n3+n4;
	int m = n1*n2*n3*n4;
	
	JOptionPane.showConfirmDialog(null, "A soma dos numeros: "+s+"\na multiplicação é de : "+m);

	}

}
