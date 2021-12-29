package metodos;

import java.util.Scanner;

public class Emprestimo {

	/* C�LCULO SIMPLES E HIPOT�TICO DE EMPR�STIMO:
	 * Valor at� 25.000 -> taxa de 2% ao m�s
	 * Valor de 25.000 at� 100.000 -> taxa de 5% ao m�s
     * Valor acima de 100.000 -> taxa de 10% ao m�s
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual valor do empr�stimo? ");
		double valor = input.nextDouble();
		
		System.out.print("Em quantos meses quer pagar? ");
		int meses = input.nextInt();
		
		exibirValorEmprestimo(valor, meses);
		
		input.close();
	}
	
	public static void calcularEmprestimo (double valor, double meses, double taxa) {
		double valorPorMes = valor/meses;
		double taxaPorMes = valorPorMes * taxa;
		double valorTotal = (valorPorMes + taxaPorMes) * 12;
		System.out.println("TOTAL EMPR�STIMO: " + valorTotal);
	}
	
	public static void exibirValorEmprestimo (double valor, double meses) {
		if(valor > 0 && valor < 25.000) {
			calcularEmprestimo(valor, meses, 0.02);
		}
		
		if(valor >= 25.000 && valor < 100.00) {
			calcularEmprestimo(valor, meses, 0.05);
		}
		
		if(valor < 25.000) {
			calcularEmprestimo(valor, meses, 0.1);
		}
	}
	
}
