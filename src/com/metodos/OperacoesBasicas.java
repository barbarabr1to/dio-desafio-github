package com.metodos;

public class OperacoesBasicas {

	public static void main(String[] args) {

		int a = 5;
		int b = 2;
		
		soma(a, b);
		subtracao(a, b);
		multiplicacao(a, b);
		divisao(a, b);
		
	}
	
	public static void soma(int a, int b) {
		int soma = a + b;
		System.out.println("SOMA = " + soma);
	}
	
	public static void subtracao(int a, int b) {
		int subtracao = a - b;
		System.out.println("SUBTRACAO = " + subtracao);
	}
	
	public static void multiplicacao(int a, int b) {
		int multiplicacao = a * b;
		System.out.println("MULTIPLICACAO = " + multiplicacao);
	}
	
	public static void divisao(int a, int b) {
		double d1 = a;
		double d2 = b;
		double divisao = d1 / d2;
		System.out.printf("DIVISÃO = %.1f", divisao);
	}

}
