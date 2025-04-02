import java.util.Scanner;

public class CalculoRocas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double pesoMedio379 = 2.850;
		double pesoMedio164 = 2.700;
		double pesoCone = 0.150;
		
		System.out.println("Escolha o fio a ser Contado");
		System.out.println("\n1-Fio 379");
		System.out.println("2-Fio 164");
		
		int opcao = input.nextInt();
		
		
		System.out.println("\nInsira a quantidade de rocas");
		double quantRocas = input.nextDouble();
		
		System.out.println("\nSe tiver peso quantas rocas");
		double pesoRocas = input.nextDouble();
		
		double resultado = pesoRocas * pesoCone;
		
		System.out.println(resultado);
		
		System.out.println("\nInsira o peso");
		double peso = input.nextDouble();
		
		double pesoOficial = peso - resultado;
		
		System.out.println(pesoOficial);
		
		if (opcao == 1) {
			
			System.out.println("Resultado Contagem:" + ((quantRocas * pesoMedio379) + pesoOficial ) + "Kg");
		}
		else if (opcao == 2) {
			System.out.println("Resultado Contagem:" + ((quantRocas * pesoMedio164) + pesoOficial )+ "Kg");
		}
		else {
			System.out.println("Opção não Existe");
		}

	}

}
