import java.util.Scanner;

public class Exercicio11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira as informações solicitadas a baixo");
		
		System.out.println("\nInsira número");
		double numero1 = input.nextDouble();
		
		System.out.println("\nInsira outro número");
		double numero2 = input.nextDouble();
		
		System.out.println("O maior numero é " + " " + maior(numero1, numero2));

	}
	
	public static String maior(double numero1, double numero2) {
		
		if (numero1 > numero2) {
			
			return String.valueOf(numero1);
		}
		else if ( numero2 > numero1) {
			return String.valueOf(numero2);
		}
		return "Os numeros são iguais";
		
	}

}
