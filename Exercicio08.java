import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numeroInscricao;
		double altura;
		
		int numeroInscricaoMaisAlto = 0;
		double alturaMaisAlto = 0;
		
		int numeroInscricaoMaisBaixo = 0;
		double alturaMaisBaixo = Double.MAX_VALUE;
		
		double somaAltura = 0;
		int quantidadeAtletas = 0;
		
		do { 
			System.out.println("Digite o número da inscrição do atleta (ou 0 para sair):");
			numeroInscricao = input.nextInt();
			
			if (numeroInscricao != 0 ) {
				System.out.println("Digite a Altura do Atleta");
				altura = input.nextDouble();
			
			if (altura > alturaMaisAlto) {
				alturaMaisAlto = altura;
				numeroInscricaoMaisAlto = numeroInscricao;
			}
			if (altura < alturaMaisBaixo) {
				alturaMaisBaixo = altura;
				numeroInscricaoMaisBaixo = numeroInscricao;
			}
			
			somaAltura += altura;
			quantidadeAtletas ++;
		}
			
		} while (numeroInscricao != 0);
		
		if (quantidadeAtletas > 0) {
			double mediaAltura  = somaAltura / quantidadeAtletas;
			
			System.out.println("\nAtleta mais Alto:");
			System.out.println("Número de Inscrição:" + numeroInscricaoMaisAlto );
			System.out.println("Altura:" + alturaMaisAlto);
			
			System.out.println("\nAtleta mais Baixo;");
			System.out.println("Número de Inscrição:" + numeroInscricaoMaisBaixo);
			System.out.println("Altura:" + alturaMaisBaixo);
			
			System.out.println("\nMédia das Alturas;" + mediaAltura);
			System.out.println("Quantidade de Atletas Cadastrado:" + quantidadeAtletas);
		}
		else {
			System.out.println("\nNehum Atleta Cadastrado");
		}
		
			
			
		
			
			
	
	} 
		
		
		

	}


