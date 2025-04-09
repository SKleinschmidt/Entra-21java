import java.security.PublicKey;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = {
				{2104,3,399900},
				{1600,3,329900},
				{2400,3,369000},
				{1416,2,232000},
				{3000,4,539900},
				{1985,4,299900},
				{1534,3,314900},
				{1427,3,199000},
				{1380,3,212000},
				{1494,3,242500},
				{1940,4,240000},
				{2000,3,347000},
				{1890,3,330000},
				{4478,5,699900},
				{1268,3,259900}
				
		};
	
        
		}
	
	public void calcularMediaPreco(int[][] matriz) {
		
		double somaPreco = 0;
		for(int[] casa : matriz) { 
			somaPreco += casa[2];
		}
		 
		 double mediaPreco = somaPreco / matriz.length;
		 System.out.printf("a)A média dos preços das casas é: R$ %.2f%n"+ mediaPreco);
		
	}
	public void encontrarMenorCasa(int[][] matriz) {
		int menorPreco = Integer.MAX_VALUE;
		for (int [] casa : matriz) {
			if (casa[2] < menorPreco) {
				menorPreco = casa[2];
					
			}
		}
		
		System.out.println("b)O preço da menor casa é: R$ %d%n" + menorPreco );
	}
		
		public void encontrarQuartosCasaMaisCara(int [][] matriz) {
			
			int maiorPreco = Integer.MIN_VALUE;
			int quartoCasaMaisCara = 0;
			
			
			
		}

	}


