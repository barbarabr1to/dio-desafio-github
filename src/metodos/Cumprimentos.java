package metodos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cumprimentos {

	public static void main(String[] args) {
		
		Date dataHoraAtual = new Date();		
		String horaMinSec = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
		
		cumprimentos(horaMinSec);

	}
	
	public static void cumprimentos(String horaMinSec) {
		String vetorHoraMinSec[] = horaMinSec.split(":");
		int hora = Integer.parseInt(vetorHoraMinSec[0]);
		
		if(hora >= 0 && hora < 12) {
			System.out.println("Bom dia!");
		}
		
		if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}
		
		if(hora >= 18) {
			System.out.println("Boa noite!");
		}
		
	}

}








