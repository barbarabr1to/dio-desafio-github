package metodos;

public class Quadrilateros {

	public static void main(String[] args) {
		
		area(3);
		area(4, 7);
		area(5, 3, 2);

	}
	
	public static void area(double lado) {
		double areaQuadrado = lado * 2;
		System.out.println("ÁREA DO QUADRADO: " + areaQuadrado);
	}
	
	public static void area(double altura, double largura) {
		double areaRetangulo = altura * largura;
		System.out.println("ÁREA DO RETÂNGULO: " + areaRetangulo);
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("ÁREA DO TRAPÉZIO: " + areaTrapezio);
	}

}
