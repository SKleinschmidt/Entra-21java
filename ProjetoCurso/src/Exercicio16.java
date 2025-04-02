import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" insiras as cartas");
		System.out.println(" Carta 1");
		int carta1 = input.nextInt();
		System.out.println(" Carta 2");
		int carta2 = input.nextInt();
		System.out.println(" Carta 3");
		int carta3 = input.nextInt();
		
		int pontos = 0;
		
		if (carta1 == 1 || carta2 == 2 || carta3 == 3) {
			pontos++;
		}
		if (carta1 == 1 || carta2 == 2 || carta3 == 3) {
			pontos++;
		}
				
		if (carta1 == 1 || carta2 == 2 || carta3 == 3) {
			pontos++;
		}
		
		if (carta1 == 1) {
			System.out.println(" truco");
		}
		else if (carta2 == 2 ) {
			System.out.println("Seis");
		}
		else if (carta3 == 3 ) {
			System.out.println(" Nove");
		}

	}

}
