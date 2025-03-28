import java.util.Scanner;

public class Exercico09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String nomeAluno;
		
		do {
			System.out.println("Digite o Nome do Aluno ou (fim para sair):");
			nomeAluno = input.next();
			
			if (!nomeAluno.equalsIgnoreCase("fim")) {
				
				System.out.println(" Digite a Nota ");
				double nota1 = input.nextDouble();
				
				System.out.println("Digite a Nota");
				double nota2 = input.nextDouble();
				
				double media = (nota1 + nota2) / 2;
			
				
				System.out.println("Média do Aluno:" + nomeAluno + ":" + media);
				input.next();
			}
		
				
		} while (!nomeAluno.equalsIgnoreCase("fim"));
		System.out.println("Media Finalizada");
	
		
	

	}

}
