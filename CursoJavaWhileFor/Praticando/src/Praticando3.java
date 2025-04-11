import java.util.Scanner;

public class Praticando3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		
		System.out.println(" Insira a metragem Cubica consumida");
		double metrosCubico = input.nextDouble();
		
		double esgoto = 1.09;
		double valorAguaMetroCubico = 5.58;
		double tarifaMinima = 44.40;
		double taxaLixo = 75.72;
		
		
		double valorAgua =(metrosCubico * valorAguaMetroCubico) + tarifaMinima;
		double taxaEsgoto = valorAgua * esgoto;
		
		System.out.println("Valor da água é:" + valorAgua);
		System.out.println("Taxa de Esgoto é:" + taxaEsgoto);
		System.out.println("Coleta de lixo:" + taxaLixo);
		
		

	}

}
