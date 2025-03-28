import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira o primeiro numero");
		double numero1 = input.nextDouble();
		System.out.println("Insira o segundo numero");
		double numero2 = input.nextDouble();
		
		System.out.println("Escolha a operação");
		System.out.println("1-Soma os dois números");
		System.out.println("2-Subtraia os dois números");
		System.out.println("3-Multiplique os dois números");
		System.out.println("4-Divida os dois números");
		
		int escolha = input.nextInt();
		
		if (escolha == 1) {
			System.out.println(numero1 + numero2);
		}
		else if (escolha == 2) {
			System.out.println(numero1 - numero2);
		}
		else if (escolha == 3) {
			System.out.println(numero1 * numero2);
		}
		else if (escolha == 4) {
			System.out.println(numero1 / numero2);
		}
		else {
			System.out.println(" Conta invalida");
		}

	}

}
