import java.util.Scanner;

public class CodigoGemini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 

	        int totalClientes = 30;
	        double somaNotasTotal = 0;
	        int quantidadeHomens = 0;
	        double somaNotasHomens = 0;
	        int idadeMulherMaisJovem = Integer.MAX_VALUE;
	        double notaMulherMaisJovem = -1;
	        int mulheresMais50NotaSuperiorMedia = 0;

	        for (int i = 1; i <= totalClientes; i++) {
	            System.out.println("Cliente " + i + ":");

	            int sexo;
	            do {
	                System.out.print("Sexo (1=feminino, 2=masculino): ");
	                sexo = input.nextInt();
	                if (sexo != 1 && sexo != 2) {
	                    System.out.println("Opção inválida. Digite 1 para feminino ou 2 para masculino.");
	                }
	            } while (sexo != 1 && sexo != 2);

	            int nota;
	            do {
	                System.out.print("Nota para o cinema (0 a 10): ");
	                nota = input.nextInt();
	                if (nota < 0 || nota > 10) {
	                    System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
	                }
	            } while (nota < 0 || nota > 10);

	            System.out.print("Idade: ");
	            int idade = input.nextInt();

	            somaNotasTotal += nota;

	            if (sexo == 2) {
	                quantidadeHomens++;
	                somaNotasHomens += nota;
	            } else {
	                if (idade < idadeMulherMaisJovem) {
	                    idadeMulherMaisJovem = idade;
	                    notaMulherMaisJovem = nota;
	                }
	            }
	        }

	        double notaMediaTotal = somaNotasTotal / totalClientes;
	        System.out.println("\nResultados da Pesquisa:");
	        System.out.printf("Nota média recebida pelo cinema: %.2f\n", notaMediaTotal);

	        if (quantidadeHomens > 0) {
	            double notaMediaHomens = somaNotasHomens / quantidadeHomens;
	            System.out.printf("Nota média atribuída pelos homens: %.2f\n", notaMediaHomens);
	        } else {
	            System.out.println("Nenhum homem respondeu à pesquisa.");
	        }

	        if (notaMulherMaisJovem != -1) {
	            System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
	        } else {
	            System.out.println("Nenhuma mulher respondeu à pesquisa.");
	        }

	        input.close();

	        Scanner input2 = new Scanner(System.in);
	        for (int i = 1; i <= totalClientes; i++) {
	            System.out.println("\nVerificação para mulheres com mais de 50 anos (Cliente " + i + "):");
	            System.out.print("Sexo (1=feminino, 2=masculino): ");
	            int sexo = input2.nextInt();
	            if (sexo == 1) {
	                System.out.print("Idade: ");
	                int idade = input2.nextInt();
	                if (idade > 50) {
	                    System.out.print("Nota atribuída: ");
	                    int nota = input2.nextInt();
	                    if (nota > notaMediaTotal) {
	                        mulheresMais50NotaSuperiorMedia++;
	                    }
	                }
	            }
	        }
	        input2.close();

	        System.out.println("\nQuantidade de mulheres com mais de 50 anos que deram nota superior à média: " + mulheresMais50NotaSuperiorMedia);
	    }
	

	}


