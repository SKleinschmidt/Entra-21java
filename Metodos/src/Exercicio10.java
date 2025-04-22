import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
				
			System.out.println("Insira uma número inteiro");
			int numero = input.nextInt();
			
			System.out.println("O número inserido é par?" + " " + checarValor(numero));

	}
	
	public static boolean checarValor(int numero) {
		
		if (numero % 2 == 0) {
			return true;
		}
		
			return false;
		
		}
		
}
