package controller;
import util.Teclado;
public class Trator {

	int cavalos;
	String avaliacaocavalos;
	int ano;
	int quilometragem;
	
	public static void main(String[] args) {
		
		Trator trator = new Trator ();
		trator.cavalos=Teclado.lerInt("Informe o Cavalo do ve�culo:");
		trator.ano=Teclado.lerInt("Informe o Ano do ve�culo:");
		trator.quilometragem=Teclado.lerInt("Informe a quilometragem do ve�culo:");
		
		if(trator.cavalos>=100){
			
		trator.avaliacaocavalos = "FORTE" ;
			
		}else{
			
			trator.avaliacaocavalos="FRACO";
			
		}
		
		System.out.println("Os Cavalos do Trator �: "+trator.cavalos);
        System.out.println("O ano do Trator �: "+trator.ano);
        System.out.println("A quilometragem do Trator � :"+trator.quilometragem);
        System.out.println("A avalia��o de Cavalos do Trator �: "+trator.avaliacaocavalos);
        
	}

}
