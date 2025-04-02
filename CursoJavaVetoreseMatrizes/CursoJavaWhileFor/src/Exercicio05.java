import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double alturas[]= new double[5];
		double somaAltura = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a altura" + ( i + 1) + "ª pessoa:");
			alturas[i] = input.nextDouble();
			somaAltura += alturas[i];
		}
		
		double mediaAlturas = somaAltura / 5;
		
		System.out.println("\nMédia das alturas:" + mediaAlturas);

	}

}
