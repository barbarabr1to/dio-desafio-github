package metodos;

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
		double areaQuadrado = lado * 2;
		return areaQuadrado;
	}
	
	public static double area(double altura, double largura) {
		double areaRetangulo = altura * largura;
		return areaRetangulo;
	}
	
	public static double area(double baseMaior, double baseMenor, double altura) {
		double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
		return areaTrapezio;
	}

}
