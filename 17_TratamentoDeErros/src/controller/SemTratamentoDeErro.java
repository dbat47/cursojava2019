package controller;

import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		
		
		double a,b,c;
		a=Teclado.lerDouble("Digite o numerador"); 
        b=Teclado.lerDouble("Digite um denominador");
        c=a/b;
        
        System.out.println("Resultado da divisão "+ c);
        
	}

}
