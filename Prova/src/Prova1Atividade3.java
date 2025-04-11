import java.util.Scanner;

public class Prova1Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] vetor = new int [11];
		
		System.out.println("Insira o numero subsequente ate fechar 11");
		
		for (int i = 0; i < 11; i++) {
			vetor[0] = 0;
			vetor[1] = 1;
			vetor[2] = 2;
			vetor[i] = input.nextInt();
			
			
		}
		

	}

}
