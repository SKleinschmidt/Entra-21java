import java.util.Scanner;

public class MetodosComParametro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira as informações a baixo");
		
		System.out.println("Primeiro número");
		double primeiro = input.nextDouble();
		
		System.out.println("Segundo número");
		double segundo = input.nextDouble();
		
		System.out.println("Terceiro número");
		double terceiro = input.nextDouble();
		
		fazerConta(primeiro, segundo, terceiro);
		

	}

	public static void fazerConta(double primeiro,double segundo,double terceiro) {
		
		double resultado = (primeiro * segundo) / terceiro;
		
		System.out.println("Resultaddo é " + "R$:" + resultado);
	}
}
