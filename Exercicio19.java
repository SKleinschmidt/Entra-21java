import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira o valor x");
		double x = input.nextDouble();
		System.out.println(" Insira o valor y");
		double y = input.nextDouble();
		
		if (x >= 0 && y >= 0) {
			System.out.println(" 1 quadrante");
		}
		else if (x >= 0 && y <= 0) {
			System.out.println(" 4 quadrante");
		}
		else if (x <= 0 && y >= 0) {
			System.out.println(" 2 quadrante");
		}
		else {
			System.out.println(" 3 quadrante");
		}
		

	}

}
