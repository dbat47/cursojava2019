package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import com.sun.javafx.iio.ImageMetadata;

import jdk.nashorn.internal.scripts.JO;

public class JanelasDeConfirmacao {

	public static void main(String[] args) {
		
		int opcao1,opcao2,opcao3;
		
		opcao1= JOptionPane.showConfirmDialog(null, "Janela de Confirmação 1");
		
		switch(opcao1) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showConfirmDialog(null, "você ciclou em cancelar");
			break;
		case JOptionPane.YES_OPTION:
			JOptionPane.showConfirmDialog(null, "você ciclou em Sim");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showConfirmDialog(null, "voce ciclou em não");
			break;
			
		default:
			JOptionPane.showConfirmDialog(null, "você fechou a janela");
		
		
		
		}
		
		opcao2=JOptionPane.showConfirmDialog(null, "janela 2","titulo da janela", JOptionPane.OK_CANCEL_OPTION);
		
		switch(opcao2) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showConfirmDialog(null, "Você clicou em Cancelar");
			break;
		case JOptionPane.OK_OPTION:
			JOptionPane.showConfirmDialog(null, "Vc clicou em ok");
			break;
			default:
				JOptionPane.showConfirmDialog(null, "Voce fechou a janela");
		break; 
		}
        
		opcao3=JOptionPane.showConfirmDialog(null, "janela de confirmação3","titulo da janela" ,JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
		
		switch (opcao3) {
		case JOptionPane.YES_NO_OPTION:
			JOptionPane.showConfirmDialog(null,"vc clicou em sim");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showConfirmDialog(null,"vc clicou em não");
			break;
		
		default:
			JOptionPane.showConfirmDialog(null, "Você fechou a janela");
			break;
		}
		ImageIcon icone = new ImageIcon("img/linux.png");
		
		int opcao4;
		
         opcao4= JOptionPane.showConfirmDialog(null, "Janela de confirmação 4", "Titulo da janela", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, icone);
	
	switch (opcao4) {
	case JOptionPane.YES_OPTION:
		JOptionPane.showConfirmDialog(null,"vc clicou em sim");
		break;
	case JOptionPane.NO_OPTION:
		JOptionPane.showConfirmDialog(null, "vc clicou em não");
		break;
	case JOptionPane.CANCEL_OPTION:
		JOptionPane.showConfirmDialog(null, "Vc clicou em cancelar");
		break;
	default:
		JOptionPane.showConfirmDialog(null, "vc fechou a janela");
		break;
	}
	}

}
