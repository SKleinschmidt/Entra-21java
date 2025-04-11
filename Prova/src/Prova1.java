import java.util.Scanner;

public class Prova1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Isira as informações Solicitadas a baixo");
		
		// primeiro lado a ser inserido
		System.out.println("Insira o primeiro lado");
		double primeiro = input.nextDouble();
		
		// segundo lado a ser inserido
		System.out.println("\nInsira o lado");
		double segundo = input.nextDouble();
		
		// terceiro lado a ser inserido
		System.out.println("\ninsira o lado");
		double terceiro = input.nextDouble();
		
		// tipo de triangulos que podem ser
		
		String equilatero;
		String isosceles;
		String escaleno;
		
		// calculo para diser qual tipo de triangulo é
		
		if (primeiro == segundo && segundo == terceiro) {
			
			equilatero = "equilatero";
			
			System.out.println("O triangulo é:" + equilatero);
			
		}
		else if (primeiro == segundo || primeiro == terceiro || terceiro == segundo) {
			
			isosceles = "isosceles";
			
			System.out.println("O triangulo é:" + isosceles);
		}
		else { escaleno ="escaleno";
		
			System.out.println("O triangulo é:" + escaleno);
			
		}

	}

}
