import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira as informações abaixo");
		
		System.out.println("Primeiro número");
		int numeroUm = input.nextInt();
		
		System.out.println("Segundo número");
		int numeroDois = input.nextInt();
		
		System.out.println("Resultado é");
		int soma = (numeroUm + numeroDois);
		int produto = (numeroUm * numeroDois);
		
		System.out.println("A soma é:" + soma);
		System.out.println("O produto é:" + produto);
		
		
		
	

	}

}
