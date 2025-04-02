import java.util.Scanner;

public class ConteudoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um numero");
		int numero = input.nextInt();
		
		for (int i = numero; i >=10; i--) {
			System.out.println(i);
		}

	}

}
