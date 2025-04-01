import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double [] vetor = new double[10];
		
		System.out.println(" Digite 10 valores");
		 for (int i = 0; i < 10; i++ ) {
			 vetor[i] = input.nextDouble();
		 }
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 0 ) { // if para a posição par 
				vetor[i] *= 1.02; // calculo do % da posição
			}
			else {
				vetor[i] *= 1.05; // calculo do % da posição impar
			}
				System.out.println(" Resultado ");
				
				for (double valor : vetor) {
				
				System.out.print(valor + " ");
				
		}

	}

	}
}

