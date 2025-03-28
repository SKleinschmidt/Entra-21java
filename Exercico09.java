import java.util.Scanner;

public class Exercico09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("insira um número");
		int numero = input.nextInt();
		
		System.out.println("insira um número");
		int numeroDois = input.nextInt();
		
		if (numero > numeroDois) {
			System.out.println("O nmero " + numero + " é o maior");
		} else {
			System.out.println("O nmero" + numeroDois + " é o menor");
			
			
		}
		
		
		
		
		

	}

}
