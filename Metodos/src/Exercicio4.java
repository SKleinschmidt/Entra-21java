import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] vetor = { 1, 5, 6, 9, 10, 20 };

		encontrarMaior(vetor);
		encontrarMenor(vetor);
		calcularMedia(vetor);

	}

	private static void calcularMedia(int[] vetor) {
		// TODO Auto-generated method stub
		
		double soma = 0;
		
		for (int i =0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		
		double media = soma / vetor.length;
		
		System.out.println("A media é " + media);
	}

	private static void encontrarMenor(int[] vetor) {
		// TODO Auto-generated method stub
		
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < vetor.length; i++)
			if (vetor[i] < menor) {
				menor = vetor[i];
			}
		
		System.out.println("O menor valor è " + " " + menor);
	}
	
	

	private static void encontrarMaior(int[] vetor) {
		// TODO Auto-generated method stub

		int maior = Integer.MIN_VALUE;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];

			}

		}

		System.out.println("O maior valor è " + " " + maior);

	}

}
