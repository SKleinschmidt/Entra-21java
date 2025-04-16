import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double base = 10;
		double altura = 5;
		
		double area = calculoArea(base,altura);
		
		System.out.println(area);
		
		

	}
	
	public static double calculoArea(double base,double altura) {
		double resultado = base * altura;
		
		return resultado;
	
	}

}
