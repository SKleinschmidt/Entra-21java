import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println(" informa M para masculino ou F para feminino");
		
		char sexo = input.next().charAt(0);
		
		if (sexo== 'M' || sexo =='m') {
			System.out.println("Masculino");
		} else if (sexo == 'F' || sexo =='f') {
			System.out.println(" Feminino");
		} else {
			System.out.println("Entrada  Incorreta");
		}

	}

}
