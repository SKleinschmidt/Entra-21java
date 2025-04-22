import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número inteiro");
		int numero1 = input.nextInt();
		
		System.out.println("\nInsira o segundo número inteiro");
		int numero2 = input.nextInt();
		
		System.out.println("O maior numero è:" + " " + maiorMemor(numero1,numero2));

	}
	
	public static String maiorMemor(int numero1, int numero2) {
		  
		if  (numero1 > numero2) {
			return String.valueOf(numero1);
			
		}
		else if (numero2 > numero1) {
			return String.valueOf(numero2);
		}
		return "Os números são iguais";
		
	}

}
