import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pesquisa de satisfação");
		
		int clientes = 30;
		double somaNotaTotal = 0;
		int quantidadeHomens = 0;
		double somaNotaHomens = 0;
		int idadeMulherMaisJovem = Integer.MAX_VALUE;
		double notaMulherMaisJovem = -1;
		int mulhersMais50NotaSuperiorMedia = 0;
		
		for (int i = 1; i <= clientes; i++) {
			System.out.println("Cliente" + i + ":");
			
		}
		
	//  codigo para obter o sexo (Masculino ou Feminino)
		
		int sexo;
		
		do {
			System.out.println("Informe o sexo (1=Feminino ou 2=Masculino):");
			sexo = input.nextInt();
			if (sexo !=1 && sexo !=2) {
				System.out.println("Opcão invalida digite 1 para Feminino ou 2 para Masculino");
			}
			
		} while (sexo !=1 && sexo !=2);
		
		// codigo para obter a nota da pesquisa
		
		int nota;
		
		do {
			System.out.println("De a sua nota de 0 á 10 onde 0 é muito insatisfeito e 10 muito satisfeito");
			nota = input.nextInt();
			if (nota < 0 || nota >10) {
				System.out.println("Nota invalida de outra nota de 0 á 10");
				
			}
		} while (nota < 0 || nota > 10);
		
		// codigo para obter a idade na pesquisa(pode ser utilizado em varias outras situações)
	
		
			System.out.println("Idade?");
			int idade = input.nextInt();
			
			// codigo para atulizar variareis conforme a nessecidade.
			
			somaNotaTotal += nota;
			
			if (sexo == 2) {
				quantidadeHomens++;
				somaNotaHomens += nota;
				
			}
			else {
				if (idade < idadeMulherMaisJovem) {
					idadeMulherMaisJovem = idade;
					notaMulherMaisJovem = nota;
					
				
				}
			}
			
			double notaMediaTotal = somaNotaTotal / clientes;
			
			System.out.println("\nResultados da Pesquisa:");
			
			System.out.println("Nota média recebida pelo cinema: " +  notaMediaTotal);
			
			if (quantidadeHomens > 0) {
				double mediaNotaHomens = somaNotaHomens / quantidadeHomens;
				System.out.println("Nota média atribuidade pelos Homens:" + mediaNotaHomens);
			}
			else {
				System.out.println("Nenhum Homen respondeu a pesquisa");
			}
			
			if (notaMulherMaisJovem != -1) {
				System.out.println("Nota atribuida pela mulher mais jovem:" + notaMulherMaisJovem);
			}
			else {
				System.out.println("Nenhuma mulher respondeu a pesquisa:");
			}
		
			for (int i = 1; i <= clientes; i++) {
				System.out.println("\nVerificação para mulheres com mais de 50 anos(Cliente" + i +"):");
				System.out.println("Sexo (1=feminino, 2=masculino):");
				 sexo = input.nextInt();
				 if (sexo== 1) {
					 System.out.println("Idade");
					 idade = input.nextInt();
					 if (idade > 50) {
						 System.out.println("Nota Atribuida:");
						 nota = input.nextInt();
						 if (nota >notaMediaTotal) {
							 mulhersMais50NotaSuperiorMedia++;
						 }
					 }
				 }
				
			}
			
			System.out.println("\nQuantidade de mulheres com mais de 50 anos que deram nota superior a média:" + mulhersMais50NotaSuperiorMedia);
		}

	

	
	
		
		
		
		

	}


