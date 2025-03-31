import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int vetor[] = new int [10];
		
		System.out.println("Insira um idice de 0 a 9");
		int indice = input.nextInt();
		
		if (indice >=0 && indice < vetor.length) {
		
		System.out.println("Insira um numero");
		int numero = input.nextInt();
		
		
			vetor[indice] = numero;
			System.out.println("Numero inserido com sucesso");
		}
		else {
			System.out.println("Indice invalido");
		}
		for (int i =0; i < vetor.length; i++) {
			System.out.println("vetor[" + i + "] = " + vetor[i]);
			
		}
	

	}

}
