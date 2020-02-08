package controller;
import model.Livro;
import util.Teclado;

public class TesteLivro {

	public static void main(String[] args) {
		
		
		Livro livro= new Livro();


		livro.setIsbn(Teclado.lerInt("Digite o codigo"));
	livro.setTitulo("");	
		
		
		
	}

}
