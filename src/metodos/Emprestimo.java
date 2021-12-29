package metodos;

import java.util.Scanner;

public class Emprestimo {

	/* CÁLCULO SIMPLES E HIPOTÉTICO DE EMPRÉSTIMO:
	 * Valor até 25.000 -> taxa de 2% ao mês
	 * Valor de 25.000 até 100.000 -> taxa de 5% ao mês
     * Valor acima de 100.000 -> taxa de 10% ao mês
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Qual valor do empréstimo? ");
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
		System.out.println("TOTAL EMPRÉSTIMO: " + valorTotal);
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
