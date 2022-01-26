package com.metodos;

public class Quadrilateros {

	public static void main(String[] args) {
		
		double areaQuadrado = area(3);
		System.out.println("ÁREA DO QUADRADO: " + areaQuadrado);
		
		double areaRetangulo = area(4, 7);
		System.out.println("ÁREA DO RETÂNGULO: " + areaRetangulo);
		
		double areaTrapezio = area(5, 3, 2);
		System.out.println("ÁREA DO TRAPÉZIO: " + areaTrapezio);

	}
	
	public static double area(double lado) {
		return lado * 2;
	}
	
	public static double area(double altura, double largura) {
		return altura * largura;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}

}
