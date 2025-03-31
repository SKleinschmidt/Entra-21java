import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int numero[] = {10,5,20,15,8};
		
		System.out.println("Insira um numero");
		int numeroIns = input.nextInt();
		
		boolean encontrado = false;
		
		for (int i = 0; i < numero.length; i++) {
			
			if (numero[i] == numeroIns) {
				System.out.println(" numero encontrado no indice " + i);
				encontrado = true;
				break;
				
			}
		}
		if (!encontrado) {
			System.out.println("Numero não encontrado");
		}
		

	}

}
