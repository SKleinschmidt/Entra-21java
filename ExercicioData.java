import java.util.Scanner;

public class ExercicioData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o dia");
		int dia = input.nextInt();
		
		if (dia >=1 && dia <= 31) {
			System.out.println("Informe o Mês");
			int mes = input.nextInt();
			if (mes >=1 && mes <=12) {
				if ((mes ==4 || mes ==6 || mes ==9 || mes ==9 || mes ==1) && dia > 31 || ( mes == 2 && dia 29) {
					System.out.println("Dia invalido");
				}
				
			}
		}
		
	}

}
