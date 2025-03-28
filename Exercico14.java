import java.util.Scanner;
import java.util.Calendar;

public class Exercico14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite o ano de nascimento");
		int anoNascimento = input.nextInt();
		
		System.out.println("Digite o mês de nascimento");
		int mesNascimento = input.nextInt();
		
		System.out.println("Digite o dia do nascimento");
		int diaNascimento = input.nextInt();
		
		Calendar dataAtual = Calendar.getInstance();
		int anoAtual = dataAtual.get(Calendar.YEAR);
		int mesAtual = dataAtual.get(Calendar.MONTH) + 1;
		int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println(" Sua idade é:" + idade + "anos");
		
		System.out.println("Insara o ano de nascimento do irmão");
		int anoNascimentoIrmao = input.nextInt();
		
		System.out.println("Insira o mês de Nascimento do irmão");
		int mesNascimentoIrmao = input.nextInt();
		
		System.out.println("Insira o dia de nascimento do irmâo");
		int diaNascimentoIrmao = input.nextInt();
		
		int idadeIrmao = anoAtual - anoNascimentoIrmao;
		
		System.out.println("A idade do seu irmão é:" + idadeIrmao + "anos");
		
		if (idade>= idadeIrmao) {
			System.out.println("Irmão Gemeo");
			
		}
		else if(idade < idadeIrmao) {
			System.out.println("Ele é seu Irmão");
		}
		else {
			System.out.println("Não reconhecido");
		}
	

	}

}
