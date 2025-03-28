import java.util.Scanner;

public class ConteudoNovo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira um numero qualquer");
		int numero = input.nextInt();
		
		while(numero >= 10) {
			System.out.println(numero);
			numero--;
		}
		
		

	}

}
