package controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Trataento {

	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException{
		 int val1 = obtemNumero("primeiro");
		 int val2 = obtemNumero("segundo");
		 System.out.println("N�meros lidos: " + val1 + " e " + val2);
		 }
		 static int obtemNumero(String n) throws NumberFormatException, IOException{
		 System.out.println("Digite o " + n + " numero: ");
		 return lerNumero();
		 }
		 static int lerNumero() throws NumberFormatException, IOException{
		 BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		 int x = Integer.parseInt(teclado.readLine());
		 return x;
		 }
		

}