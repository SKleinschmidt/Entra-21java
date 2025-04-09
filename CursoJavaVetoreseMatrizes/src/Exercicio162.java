
public class Exercicio162 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][] matriz = {
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
		// Média dos preços
		
		double soma = 0;
		for (int i = 0; i < matriz.length; i++) {
			soma += matriz[i][2];
			
		}
		double media = soma / matriz.length;
		System.out.println("valor medio das casas: R$" + media);
		
		// Quanto custa a menor casa
		
		int menorCasa = Integer.MAX_VALUE;
		int precoMenorCasa = 0;
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] < menorCasa) {
				menorCasa += matriz[i][0];
				precoMenorCasa += matriz[i][2];
				
			}
			System.out.println("a nemor casa custa R$:" + precoMenorCasa);
			
		}
	}

}
