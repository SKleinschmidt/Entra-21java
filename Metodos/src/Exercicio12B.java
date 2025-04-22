import java.util.Scanner;

public class Exercicio12B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número Inteiro");
		int numero = input.nextInt();
		
		int resultado = calculo(numero);
		
		System.out.println("O resultado é " + resultado);

	}

	public static int calculo(int numero) {
		
		if (numero % 2 == 0) {
			
			return numero * numero;
		}
		else {
			return numero * 2;
		}
		
	}
}
