import java.util.Scanner;

public class Exercicio3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Insira um número");
		int numeroInserido = input.nextInt();
		
		sequenciaNumerica(numeroInserido);
		
		

	}
	
	public static void sequenciaNumerica(int numeroInserido) {
		System.out.println("O número inserido pelo Usuario foi"+ " " + numeroInserido);
		
		for (int i = 1; i <= numeroInserido + 20; i++) {
			System.out.print(numeroInserido + i + " , ");
			
		}
		
		System.out.println();
		
	}

}
