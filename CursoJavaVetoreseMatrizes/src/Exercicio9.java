import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		int[] vetor1 = new int [10];
		int[] vetor2 = new int [10];
		int[] vetor3 = new int [10];
		
		System.out.println(" Isira 10 numeros");
		// a forma de iniciar um for na maioria das vezes se inicia igual.
		for ( int i = 0; i < 10; i++) {
			vetor1[i] = input.nextInt();
		}
		
		System.out.println("Insira 10 numeros");
		
		for ( int i = 0; i < 10; i++) {
			vetor2[i] = input.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			
			vetor3[i] = vetor1[i] + vetor2[i];
			
		}
		
		System.out.println("Vetor1");
		for (int valor : vetor1) {
			System.out.println(valor + "");
			
		}
		System.out.println("Vetor2");
		
		for (int valor : vetor2) {
			System.out.println(valor + "");
		}
		
		System.out.println("Vetor3");
		
		for (int valor : vetor3) {
			System.out.println(valor + "");
		}
	
		
		
		
		
			
		}
		
		
		
		
	
			
		}
		
		
		
		
		
 
		
	


