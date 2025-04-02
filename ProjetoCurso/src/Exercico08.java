import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercico08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o valor A");
		double a = input.nextDouble();
		
		System.out.println("Insira o valor B");
		double b = input.nextDouble();
		
		System.out.println("Insira o valor C");
		double c = input.nextDouble();
		
		double areaTriangulo = (a * b)/2;
		double areaCirculo = Math.pow(c,2) * Math.PI;
		double areaTrapezio = ((a + b) * c) / 2;
		double areaQuadrado = Math.pow(b,2);
		double areaRetangulo = a * b;
		
		System.out.println("Area Triangulo:" + areaTriangulo);
		System.out.println("Area Circulo:" + areaCirculo);
		System.out.println("Area Trapezio:" + areaTrapezio);
		System.out.println("Area Quadrado:" + areaQuadrado);
		System.out.println("Area Retangulo:" + areaRetangulo);
		
		
		
		
		

	}

}
