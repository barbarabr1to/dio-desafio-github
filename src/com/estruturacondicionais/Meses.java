package com.estruturacondicionais;

import javax.swing.JOptionPane;

public class Meses {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 a 12:"));
		
		switch(numero) {
		case 1:
			JOptionPane.showMessageDialog(null, "Janeiro", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Fevereiro", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Mar�o", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Abril", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 5:
			JOptionPane.showMessageDialog(null, "Maio", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 6:
			JOptionPane.showMessageDialog(null, "Junho", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 7:
			JOptionPane.showMessageDialog(null, "Julho", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 8:
			JOptionPane.showMessageDialog(null, "Agosto", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 9:
			JOptionPane.showMessageDialog(null, "Setembro", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 10:
			JOptionPane.showMessageDialog(null, "Outubro", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 11:
			JOptionPane.showMessageDialog(null, "Novembro", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 12:
			JOptionPane.showMessageDialog(null, "Dezembro", "M�S", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Valor inv�lido", "ATEN��O", JOptionPane.ERROR_MESSAGE);
		}
	}
}
