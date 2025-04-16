import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numeroEstacao;
		
		System.out.println("Escolha a estação do ano");
		
		System.out.println("1- Verão");
		System.out.println("2- Outono");
		System.out.println("3- Inverno");
		System.out.println("4- Primavera");
		
		System.out.println("Qual é a sua Escolha?");
		numeroEstacao = input.nextInt();

		if (numeroEstacao == 1) {
			verao();
			
		}
		else if (numeroEstacao == 2) {
			outono();
			
		}
		else if (numeroEstacao == 3) {
			
		}
		else if(numeroEstacao == 4) {
			
		}
		else {
			System.out.println("Opção invalida");
		}
	}
	
	public static int verao() {
		System.out.println("É verão e o tempo sera muito quente");
		return 1;
		
	}
	
	public static int outono() {
		System.out.println("É outono tempo das folhas das árvores cairem");
		return 2;
		
		
	}

}
