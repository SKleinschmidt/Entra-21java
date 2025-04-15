import java.util.Scanner;

public class Exercico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um número qualquer");
		int numero = input.nextInt();
		
		exibirProximos(numero);
		
		
	}
	
	public static void exibirProximos(int numeroInserido) {
		System.out.println("O número inserido foi" + numeroInserido);
		 
		for (int i = 1; i <= numeroInserido + 20; i++) {
			System.out.print(numeroInserido + i + " , ");
			
		}
		
		System.out.println();
	}

}
