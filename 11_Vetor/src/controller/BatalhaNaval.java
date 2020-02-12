package controller;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import util.Teclado;
public class BatalhaNaval {

	
	URL som= BatalhaNaval.class.getResource("som.wav");
	AudioClip Som=Applet.newAudioClip(som);
	
	public static void main(String[] args) {
		// "[0=primeiro]" linha "[1=segundo]" coluna 
		
		String arena [] [] = new String [4] [5];
		int a = 1;
		

		while(a<=5){
		
		  for (int i = 0; i<4;i++) {
			  for (int j = 0; j < 5; j++ ) {
				  arena [i] [j] = "água";
			  }
		  }
		
		arena [2] [2] = "Barco";
		arena [1] [3] = "Submarino";
		arena [3] [3] = "porta-Aviões";
		arena [0] [2] = "Navio";
		
		int linha, coluna;
		
		linha= Teclado.lerInt("Digite a coordenada da linha:");
		coluna= Teclado.lerInt("Digite a coordenada da coluna:");
		
	BatalhaNaval tocar= new BatalhaNaval();
	tocar.Som.play();
		
		javax.swing.JOptionPane.showMessageDialog(null, "voce acertou:"+ arena[linha][coluna]);
		
		
	
	a=a+a++;
		}
	
	}
	}


