import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero[]= {1,2,3,4,5};
		
		for (int i =0; i < numero.length / 2;  i++) {
			int temp = numero[numero.length - 1 - i];
			numero[numero.length - 1 - i] = temp;
			
		}
		for (int i =0; i < numero.length; i++) {
			System.out.println(numero[i] + " ");
			
		}

	}

}
