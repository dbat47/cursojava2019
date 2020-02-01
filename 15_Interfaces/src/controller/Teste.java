package controller;
import model.Professor;
import model.Aluno;

public class Teste {

	public static void main(String[] args) {

		
		
		
		Professor prof= new Professor("joaquim","joaquim123",0,"joaquim da silva","doutor",1123);
		prof.mostrar();
		
		
		// aqui eu decidi que o login seria "joaquim" e a senha seria "joaquim123"
		System.out.println(prof.validarLogin("joaquim", "joaquim123"));
		
		//aqui vou ter o retorno verdadeiro 
		System.out.println(prof.validarLogin(prof.getLogin(),prof.getSenha()));
		
		
		
		
		System.out.println("==============================");
		
		Aluno aluno=new Aluno("muzi","muzi123",1,"sergio Muzi","primeiro","tarde", 32115);
		
		aluno.mostrar();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
