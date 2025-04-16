import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculo de ganho diario");
		
		System.out.println("Insira qual é a sua meta bruta");
		double meta = input.nextDouble();
		
		System.out.println("Insira os Ganhos");
		double ganhos = input.nextDouble();
		
		
		
		despesas(meta,ganhos);
		
	}
	public static void despesas(double meta,double ganhos) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira as despesas a baixo");
		
		System.out.println("Combustivel");
		double combustivel = input.nextDouble();
		
		System.out.println("\nMecanica");
		double mecanica = input.nextDouble();
		
		System.out.println("Aluguel de carro (se não tiver digite 0) ");
		double aluguelCarro = input.nextDouble();
		
		System.out.println(" Mercado ou alimentação");
		double alimentacao = input.nextDouble();
		
        double despesas = combustivel + mecanica + aluguelCarro + alimentacao;
		
		double lucroDia = ganhos - despesas;
		
		System.out.println("Seu ganho liquido foi de "+ "R$" + lucroDia);
		
		
	}
}
