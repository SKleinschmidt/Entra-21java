import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Vendedor");
		String nome = input.next();
		
		System.out.println("Salario Fixo");
		double salario = 3500;
		
		System.out.println(salario);
		
		System.out.println("Total em vendas realizadas");
		double vendas = input.nextDouble();
		
		System.out.println(vendas);
		
		System.out.println("Comição de Vendas");
		double porcentagemComissao = 0.15;
		double comicao = vendas * porcentagemComissao;
		
		System.out.println(comicao);
		
		double salarioComicao = salario + comicao;
		
		System.out.println("Salario com a comição:" + salarioComicao);
		
		
		
		
		
		
		
		
		

	}

}
