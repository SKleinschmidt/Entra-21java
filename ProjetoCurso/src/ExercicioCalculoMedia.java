import java.util.Scanner;

public class ExercicioCalculoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("VAmos Calcular a Media");
		
		System.out.println(" Nota Prova 1 ");
		double notaProva1 = input.nextDouble();
		
		System.out.println("Nota Prova 2 ");
		double notaProva2 = input.nextDouble();
		
		System.out.println("Nota Prova 3 ");
		double notaProva3 = input.nextDouble();
		
		System.out.println("Notas dos Exercicios");
		double notaExercicios = input.nextDouble();
		
		double mediaAproveitamento = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExercicios) / 7;
		
		double resultado = mediaAproveitamento;
		
		String conceito = "";
		String situacao = "";
		
		if (mediaAproveitamento >= 9 ) {
			conceito = "A";
		}
		else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9 ) {
			conceito = "B";	
		}
		else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			conceito = "C";
		}
		else if (mediaAproveitamento >= 4 && mediaAproveitamento < 6) {
			conceito = "D";
		}
		else { 
			conceito = "E";
		}
		if (conceito =="A" || conceito =="B" || conceito =="C") {
			situacao = "Aprovado";
		}
		else if (conceito =="D") {
			situacao = "Recuperação";
		}
		else {
			situacao = "Reprovado";
		}
		
		
		System.out.println("Média de Aproveitamento:" + mediaAproveitamento);
		System.out.println("Conceito:" + conceito);
		System.out.println("Situação:" + situacao);

	}

}
