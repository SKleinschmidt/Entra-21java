import java.util.Calendar;
import java.util.Scanner;

public class ExercicioFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cáculo de reajuste salarial");
		
		System.out.println("Insira o ano de contratação");
		int ano = input.nextInt();
		System.out.println("Mês de contação");
		int mes = input.nextInt();
		
		System.out.println("Informe o Salario atual");
		double salarioAtual = input.nextDouble();
		
		
		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		
		int meses = ((anoAtual - ano) * 12) - mes ;
		int resultado = meses;
		
		double percentualAjuste;
		
		if (meses < 12) {
			percentualAjuste = 0.05;
		}
		else if (meses >= 13 || meses <= 48) {
			percentualAjuste = 0.07;
		}
		else {
			percentualAjuste = 0.0;
			
			double ajuste = salarioAtual * percentualAjuste;
			
			System.out.println("Novo Valor Salaria R$:" + ajuste);
			
		}

	}

}
