import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira as notas");
		
		System.out.println("\n1ª nota");
		double nota1 = input.nextDouble();
		
		System.out.println("\n2ª nota");
		double nota2 = input.nextDouble();
		
		System.out.println("\n3ª nota");
		double nota3 = input.nextDouble();
		
		double vetor [] = {nota1,nota2,nota3};
		
		System.out.println("A média é " + calcularMedia(vetor));
		

	}
	
	public static double calcularMedia(double vetor []) {
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i ++) {
			soma += vetor[i];
		}
		return soma / vetor.length;
	}

}
