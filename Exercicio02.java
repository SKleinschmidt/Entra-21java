import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o raio do circulo");
		double raio = input.nextDouble();
		
		double area = Math.PI*Math.pow(raio, 2);

		System.out.println("O valor do raio é:");
		System.out.println(area);
		
		
	}

}
