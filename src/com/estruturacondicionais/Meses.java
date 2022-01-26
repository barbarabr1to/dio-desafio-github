package com.estruturacondicionais;

import javax.swing.JOptionPane;

public class Meses {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 12:"));
		
		switch(numero) {
		case 1:
			JOptionPane.showMessageDialog(null, "Janeiro", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null, "Fevereiro", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null, "Março", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null, "Abril", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 5:
			JOptionPane.showMessageDialog(null, "Maio", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 6:
			JOptionPane.showMessageDialog(null, "Junho", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 7:
			JOptionPane.showMessageDialog(null, "Julho", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 8:
			JOptionPane.showMessageDialog(null, "Agosto", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 9:
			JOptionPane.showMessageDialog(null, "Setembro", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 10:
			JOptionPane.showMessageDialog(null, "Outubro", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 11:
			JOptionPane.showMessageDialog(null, "Novembro", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		case 12:
			JOptionPane.showMessageDialog(null, "Dezembro", "MÊS", JOptionPane.INFORMATION_MESSAGE);
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Valor inválido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
		}
	}
}
