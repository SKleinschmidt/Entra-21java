import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int vetor [] = new int [100];
		
		for (int i = 0; i < vetor.length; i++ ) {
			vetor[i] = i * i;
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor[" + i +"] = " + vetor[i]);
			
		}
		

	}

}
