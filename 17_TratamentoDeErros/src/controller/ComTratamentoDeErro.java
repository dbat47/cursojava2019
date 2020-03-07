package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		
		try {
			
			double a= Teclado.lerDouble("Digite o numerador: ");
			double b= Teclado.lerDouble("Digite o denominador: ");
			double c= a/b;
			System.out.println("Resultado da divisão de a por b : "+c);
			
		} catch (NumberFormatException nfe ) {
			
			System.out.println("caractere inválido! ");
		
		}
		
		

	}

}
