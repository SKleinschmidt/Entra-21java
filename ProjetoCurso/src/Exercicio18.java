import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira um número ");
		double numero = input.nextDouble();
		
		System.out.println("Escolha a operação");
		System.out.println("Operação 1");
		System.out.println("Operação 2");
		System.out.println("Operação 3");
		System.out.println("Operação 4");
		
		int operacao = input.nextInt();
		
		if (operacao == 1) {
			System.out.println(numero + 10);
		}
		else if (operacao == 2) {
			System.out.println(numero - 10);
		}
		else if (operacao == 3) {
			System.out.println(numero * 10);
		}
		else if (operacao == 4) {
			System.out.println(numero / 10);
		}
		else {
			System.out.println(" Operação informada não é valida");
		}

	}

}
