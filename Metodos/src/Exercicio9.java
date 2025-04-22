import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira a solicitação a baixo");
		
		System.out.println("\nInsira o primeiro número");
		int numero1 = input.nextInt();
		
		System.out.println("\nInsira o segunto número");
		int numero2 = input.nextInt();
		
		System.out.println("\nInsira o terceiro número");
		int numero3 = input.nextInt();
		
		System.out.println("\nInsira o quarto número");
		int numero4 = input.nextInt();
		
		somaNumero(numero1, numero2, numero3, numero4);
		


	}
	
	public static int somaNumero(int numero1, int numero2, int numero3, int numero4) {
		
		int resultado = numero1 + numero2 + numero3 + numero4;
		
		System.out.println("\n O resultado da soma dos números è:" + " " + resultado);
		
		return 0;
		
		
	}

}
