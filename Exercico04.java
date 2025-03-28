import java.util.Scanner;

public class Exercico04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o cadastro");
		String cadastro = input.next();
		
		System.out.println("Insira o Nome");
		String nome = input.next();
		
		System.out.println("Horas Trabalhadas");
		double horasTrabalhadas = input.nextDouble();
		
		System.out.println("Valor da hora ");
		double valorHora = input.nextDouble();
		
		System.out.println("Dias trabalhados");
		double diasTrabalhados =input.nextDouble();
		
		System.out.println("Cadastro:" + cadastro);
		System.out.println("Nome:" + nome);
		System.out.println("Salario:" + (horasTrabalhadas * diasTrabalhados) * valorHora);
		
		
				

	}

}
