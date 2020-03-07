package controller;

import javax.swing.JOptionPane;

public class questao03 {

	public static void main(String[] args) {

  double dolin=Double.parseDouble (JOptionPane.showInputDialog("informe um valor em dolár"));
          
  double d=dolin*4.47;
  JOptionPane.showConfirmDialog(null, "O valor convertido em reais é :"+ d);
  
	}

}
