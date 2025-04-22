import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double vetor [] = {2,10,25,35,47,6,1,50};
		

	}
	
	
	public static double calcularMedia(double vetor []) {
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i ++) {
			soma += vetor[i];
		}
		return soma / vetor.length;
		
	}
	
	public static double descobrirMaiorValor(double vetor []) {
		
		double maiorValor = Double.MIN_VALUE;

		for (int i = 0; i < vetor.length; i ++) {
			if (maiorValor > vetor[i]) {
				maiorValor = vetor[i];
			}
		}
		return maiorValor;
	}

}
