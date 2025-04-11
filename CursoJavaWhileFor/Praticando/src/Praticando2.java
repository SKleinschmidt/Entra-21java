import java.util.Scanner;

public class Praticando2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int [][] matriz  = {
				{2104, 3, 399900},
				{1600, 3, 329900},
				{2400, 3, 369000},
				{1416, 2, 232000},
				{3000, 4, 539900},
				{1985, 4, 299900},
				{1534, 3, 314900},
				{1427, 3, 199000},
				{1380, 3, 212000},
				{1494, 3, 242500},
				{1940, 4, 240000},
				{2000, 3, 347000},
				{1890, 3, 330000},
				{4478, 5, 699900},
				{1268, 3, 259900}	
		};
		// media dos preços das casa
		
		double soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			soma += matriz[i][2];
		}
		double media = soma / matriz.length;
		
		System.out.println("Media do preço das casas:" + media);
		
	// Valor da menor casa
		
		int menorCasa = Integer.MAX_VALUE;
		int precoMenorCasa = 0;
		 for (int i = 0; i < matriz.length; i++) {
			 if (matriz[i][0] < menorCasa) {
				 menorCasa = matriz[i][0];
				 precoMenorCasa = matriz[i][2];
				 
			 }
		 }
		 
		 System.out.println("O valor da menor casa é R$:" + precoMenorCasa);
		 
		 // Quantidade de quartos da casa mais cara
		 
		 int casaCara = Integer.MIN_VALUE;
		 int quartoCasaCara = 0;
		 for (int i = 0; i < matriz.length; i++) {
			 if (matriz[i][0] > casaCara) {
				 casaCara = matriz[i][2];
				 quartoCasaCara = matriz[i][1];
			 }
		 }
		 
		 System.out.println("A casa mais cara tem:"   + quartoCasaCara +   "quartos");
		 
		 // Diferença casa maior número de quartos para a casa com o menor número
		 
		 int qntMaisQuarto = Integer.MIN_VALUE;
		 int qntMenosQuarto = Integer.MAX_VALUE;
		 int tamanhoMaisQuarto = 0;
		 int tamanhoMenosQuarto = 0;
		 
		 for (int i = 0; i < matriz.length; i++) {
			 if (matriz[i][1] > qntMaisQuarto) {
				 qntMaisQuarto = matriz[i][1];
				 tamanhoMaisQuarto = matriz[i][0];
			 }
			 if (matriz[i][1] < qntMenosQuarto) {
				 qntMenosQuarto = matriz[i][1];
				 tamanhoMenosQuarto = matriz[i][0];
			 }
		 }
		 
		 int diferenca = tamanhoMaisQuarto - tamanhoMenosQuarto;
		 System.out.println("A diferença de tamanho é de " + diferenca);
		 
		// Média do tamanho das casas que custam mais de 300.000 mil
		 
		 double somaTamanho = 0;
		 int contador = 0;
		 for (int i = 0; i < matriz.length; i++) {
			 if (matriz[i][2] > 300000) {
				 somaTamanho += matriz[i][0];
				 contador++;
				 
			 }
		 }
		 double mediaTamanho = somaTamanho / contador;
		 
		 System.out.println("A média do tamanho das casas que custam mais de 300.000 mil é de" + mediaTamanho);
	}

}
