import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercico07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Insira o valor");
		double valor = input.nextDouble();
		double taxaConvercao = 5.77;
		double calculo = valor * taxaConvercao;
		
		System.out.println("valor a retornar");
		System.out.println(df.format(calculo));
		

	}

}
