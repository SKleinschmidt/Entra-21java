import java.util.Scanner;

public class Exercicio9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insiras as informações solicitadas abaixo");
		
		System.out.println("\nInsira o primeiro número");
		double numero1 = input.nextDouble();
		
		System.out.println("\nInsira o segundo número");
		double numero2 = input.nextDouble();
		
		System.out.println("\nInsira o terceiro número");
		double numero3 = input.nextDouble();
		
		System.out.println("\nInsira o quarto número");
		double numero4 = input.nextDouble();
		
		System.out.println("Selecione a opção de calculo");
		System.out.println("\n1- Multiplicar o 1 numero pelo 2 numero ");
		System.out.println("\n2- Dividir a soma do 1 Num e 2 Num pelo 3 numero ");
		System.out.println("\n3- Multiplicar os 4 números ");
		System.out.println("\n4- Somar o 1 num,2 num,3 num  e dividir pelo 4 num");
		
		System.out.println("\nQual é a sua escolha?");
		int escolha = input.nextInt();
		
		if (escolha == 1) {
			multiplicar(numero1, numero2);
			
		}
		else if (escolha == 2) {
			dividir(numero1, numero2, numero3);
			
		}
		else if (escolha == 3) {
			multiplicar(numero1, numero2, numero3, numero4);
			
		}
		else if (escolha == 4) {
			somarDividir(numero1, numero2, numero3, numero4);
			
		}
		else {
			System.out.println(" Escolha invalida");
		}

	}
	
	public static double multiplicar(double numero1, double numero2) {
		
		double resultado = numero1 * numero2;
		
		System.out.println("O resultado da multiplicação do 1 e 2 é:" + " " + resultado);
		return 1;
		
	}
	public static double dividir(double numero1, double numero2, double numero3) {
		
		double dividir = (numero1 + numero2) / numero3;
		
		System.out.println("O resultado da soma do 1 e 2 dividido pelo 3 é:" + " " + dividir);
		
		return 2;
		
	}
	
	public static double multiplicar(double numero1, double numero2, double numero3, double numero4) {
		
		double multiplicar = numero1 * numero2 * numero3 * numero4;
		
		System.out.println("O resultado da multiplicação entre eles é:" + " " + multiplicar);
		
		
		return 3;
		
	}
	
	public static double somarDividir(double numero1, double numero2, double numero3, double numero4) {
		
		double resultado = (numero1 + numero2 + numero3) / numero4;
		
		System.out.println("O resultado é:" + " " + resultado);
		return 4;
	}

}
