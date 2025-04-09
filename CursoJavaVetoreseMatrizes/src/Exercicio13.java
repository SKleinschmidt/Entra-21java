import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int matriz[] [] = {
				{4,12},
				{2,-3}
		};
		
		int a = matriz [0] [0];
		int b = matriz [0] [1];
		int c = matriz [1] [0];
		int d = matriz [1] [1];
		
		int determinante = (a * d) - (b * c);
		
		System.out.println(" A matriz é");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("| ");
			
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println("| ");
			
		}
		System.out.println("O determinante da matriz é: " + determinante);
		
	}
	


}
