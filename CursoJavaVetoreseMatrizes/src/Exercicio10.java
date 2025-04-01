import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] perguntas = {
				"Gosta de música sertaneja?",
				"Gosta de futebol?",
				"Gosta de seriados?",
				"Gosta de redes sociais?",
				"Gosta da Oktoberfest?"	
		};
		
		String[] respostaRapaz = new String[5];
		String[] respostaMoca = new String[5];
		
		System.out.println(" Resposta do Rapaz");
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(perguntas[i] + "(SIM/NAO/IND):");
			respostaRapaz[i] = input.nextLine().toUpperCase();
		}
		
		System.out.println("\nResposta Noça");
		
		for (int i = 0; i < 5 ; i++) {
			System.out.println(perguntas[i] + "(SIM/NAO/IND):");
			respostaMoca[i] = input.nextLine().toUpperCase();
			
		}
		
		int indice = 0;
		
		for (int i = 0; i < 5; i++) {
			if (respostaRapaz[i].equals(respostaMoca[i])) {
				indice 	+= 3;
			}
			else if (respostaRapaz[i].equals("IND") || respostaMoca.equals("IND")) {
				indice += 1;
			}
			
			else {
				indice -= 2;
				
				
			}
			
			System.out.println("Afinidade" + indice);
			
			
		
	
		

	}


	}
}
