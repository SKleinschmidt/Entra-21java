import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Insira as vogais");
		char letra = input.next().charAt(0);
		
		if (letra =='A' || letra =='E' || letra =='I' || letra =='O' || letra == 'U') {
			System.out.println(letra + " é uma vogal");
		}else {
			System.out.println(letra + "é uma consoante");
		}

	}

}
