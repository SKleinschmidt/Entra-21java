import java.util.Scanner;

public class Exercico18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String matriz1[][] = new String [4][4];
		String matriz2[][] = new String [4][4];
		String matriz3[][] = new String [4][4];
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j <matriz1[i].length; j++) {
				matriz1[i][j] = " ";
				matriz2[i][j] = " ";
				matriz3[i][j] = " ";
				
			}
		}
	
		
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j <matriz1[i].length; j++) {
				
				matriz1[i][j] = "*";
				
				
				
			}
				
			
		
		}

	}
}


