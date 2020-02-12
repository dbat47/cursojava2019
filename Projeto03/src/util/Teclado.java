package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

	String teclado;
		
	private static BufferedReader teclado_01 =
			new BufferedReader(
					new InputStreamReader(System.in));
	
	public static String lerTexto(String texto) {
		try {
		//Mostra o texto
		System.out.println(texto);
		
		//L� a linha
		return teclado_01.readLine();
		
	}   catch (IOException e) {
		return null;
	}
		
	}

	public static int lerInt(String texto) {
		//Chama o m�todo lerString e converte o resultado para inteiro
		return Integer.parseInt(lerTexto(texto));
	}
	
	public static double lerDouble (String texto) {
		//Chama o m�todo lerString e converte o resultado para double
		return Double.parseDouble(lerTexto(texto));
	}
}
