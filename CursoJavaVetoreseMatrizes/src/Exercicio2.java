import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numero[] = {6,7,8,9,10};
		
		int maior = numero[0];
		int menor = numero[0];
		int soma = 0;
		
		for (int i = 0; i < numero.length; i++) {
			
			
			if ( numero[i] > maior) {
				maior = numero[i];
				
			}
			
			if (numero[i] < menor) {
				menor = numero[i];
			}
			
			soma += numero[i];
			
			
			
			
			
		}
		

		double media = soma / numero.length;
		
		
		System.out.println("Maior elemento é " + maior);
		System.out.println("Menor elemento é " + menor);
		System.out.println("A Média é " + media);
	}

}
