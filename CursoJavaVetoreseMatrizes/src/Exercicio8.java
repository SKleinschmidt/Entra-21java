import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double[] vetor = new double[5];
		double soma = 0;
		
		System.out.println("Digite 5 valores ");
		
		for ( int i = 0; i < 5; i++) {// neste caso junto com o for deve ser solicitado a inclusão do valor
			vetor[i] = input.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma / 5 ;
		
		System.out.println("Valores maior que a media (" + media + "):");
		
		for ( int i = 0 ; i <5 ; i++) {
			if (vetor[i] > media) {
				System.out.println(vetor[i] + " ");
			}
		}

	}

}
