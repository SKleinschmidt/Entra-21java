import java.util.Scanner;

public class Exercicio4B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int [] vetor = {12,25,35,30,50,65,78};
		
		maior(vetor);
		menor(vetor);
		media(vetor);

	}

	private static void media(int[] vetor) {
		// TODO Auto-generated method stub
		
		double soma =0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
			
		
		double media = soma / vetor.length;
		
		System.out.println(" A média é " + media);
	}


	private static void menor(int[] vetor) {
		// TODO Auto-generated method stub
		
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		}
		
		System.out.println("O menor valor  é " + menor);
	}

	private static void maior(int[] vetor) {
		// TODO Auto-generated method stub
		
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
			}
		}
	
		System.out.println("O maior valor é " + maior);
	}

}
