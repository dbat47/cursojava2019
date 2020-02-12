package controller;
import util.Teclado;
public class Trator {

	int cavalos;
	String avaliacaocavalos;
	int ano;
	int quilometragem;
	
	public static void main(String[] args) {
		
		Trator trator = new Trator ();
		trator.cavalos=Teclado.lerInt("Informe o Cavalo do veículo:");
		trator.ano=Teclado.lerInt("Informe o Ano do veículo:");
		trator.quilometragem=Teclado.lerInt("Informe a quilometragem do veículo:");
		
		if(trator.cavalos>=100){
			
		trator.avaliacaocavalos = "FORTE" ;
			
		}else{
			
			trator.avaliacaocavalos="FRACO";
			
		}
		
		System.out.println("Os Cavalos do Trator é: "+trator.cavalos);
        System.out.println("O ano do Trator é: "+trator.ano);
        System.out.println("A quilometragem do Trator é :"+trator.quilometragem);
        System.out.println("A avaliação de Cavalos do Trator é: "+trator.avaliacaocavalos);
        
	}

}
