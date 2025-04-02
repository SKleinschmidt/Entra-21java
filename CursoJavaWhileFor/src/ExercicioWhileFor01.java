import java.util.Scanner;

public class ExercicioWhileFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		int i = 0;
		
		while ( i < 5 ) {
			
			System.out.println(" Insira um numero inteiro");
			int numero = input.nextInt();
			
			if (numero % 2 == 0) {
				System.out.println(numero + " é par. ");
			}
			else {
				System.out.println(numero + " é impar");
			}
			i++;
			
		
		}
		
		
			
		}
		

	}


