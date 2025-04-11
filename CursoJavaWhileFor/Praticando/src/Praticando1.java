import java.util.Scanner;

public class Praticando1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

String matriz1[][] = new String [4][4];
String matriz2[][] = new String [4][4];
String matriz3[][] = new String [4][4];

for (int i = 0; i < matriz1.length; i++) {
	for (int j = 0; j < matriz1[i].length; j++) {
		matriz1[i][j] = " ";
		matriz2[i][j] = " ";
		matriz3[i][j] = " ";
	}
}

// Preenchimento matriz 1

for (int i = 0; i < matriz1.length; i++) {
	for (int j = 0; j < matriz1[i].length; j++) {
		matriz1[i][j] = "*";
	}
}

// Preenchimento matriz 2 

for (int i = 0; i < matriz2.length; i++) {
	for (int j = 0; j < matriz2[i].length; j++) {
		if (i == 0 || j == 0 || i == matriz2.length -1 || j == matriz2[i].length -1) {
			matriz2[i][j] = "*";
		}
	}
}

// Preenchimento matriz 3 

for (int i = 0; i < matriz3.length; i++) {
	for (int j = 0; j < i + 1; j++) {
		matriz3[i][j] = "*";
		
	}
}

// Impimir as matrizes

	System.out.println("Matriz 1");
	
	for (int i = 0; i < matriz1.length; i++) {
		for (int j = 0; j < matriz1[i].length; j++) {
		System.out.print(matriz1[i][j] + " ");	
		
		}
		System.out.println();
	}
	
	// Imprimir matriz 2
	
	System.out.println("\nMatriz 2");
	
	for (int i = 0; i < matriz2.length; i++) {
		for (int j = 0; j < matriz2[i].length; j++) {
		System.out.print(matriz2[i][j] + " ");	
		
		}
		System.out.println();
	}
	
	// Imprimir matriz 3 
	
System.out.println("\nMatriz 3");
	
	for (int i = 0; i < matriz3.length; i++) {
		for (int j = 0; j < matriz3[i].length; j++) {
		System.out.print(matriz3[i][j] + " ");	
		
		}
		System.out.println();
	}

	}

}
