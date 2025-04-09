
public class Exercicio143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matriz1 [][] = { {1,3,5},{2,4,6},{7,9,8},{7,10,12}};
		int matriz2 [][] = { {2,3,5},{3,5,6},{8,9,6},{4,6,5}};
		int matrizSoma [][] = new int [matriz1.length][matriz1[0].length];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
				
				
			}
		}

		for (int i = 0 ; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				
				System.out.print(matrizSoma[i][j] + " ");
			}
			
			System.out.println();
			
			
		}
	}
}


