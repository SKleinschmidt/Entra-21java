import java.util.Scanner;

public class Exercicio1203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número");
		int numeroUm = input.nextInt();
		
		System.out.println("Insira um segundo número");
		int numeroDois = input.nextInt();
		
		System.out.println("Insira um terceiro número");
		int numeroTres = input.nextInt();
		
		System.out.println("Insira um quarto número");
		int numeroQuatro = input.nextInt();
		
		int resultado = (numeroUm + numeroDois + numeroTres) - numeroQuatro;
		
		System.out.println("O resultado é:");
		System.out.println("Valor" + resultado);
		
		System.out.println("Insera a baixo as seguintes informações");
		
		System.out.println("insira a largura");
		double largura = input.nextDouble();
		
		System.out.println("Insira o comprimento");
		double comprimento = input.nextDouble();
		
		System.out.println("O resultado é");
		System.out.println("Metros Quadrados:" + comprimento * largura);
		
		
		
		
		
		
	}

}
