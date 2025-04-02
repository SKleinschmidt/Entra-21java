import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double somaAlturas = 0;
		int somaPessoas = 0;
		double altura;
		
		do { 
			System.out.println("Digite a altura da pessoa ( ou 0 para sair):");
			 altura = input.nextDouble();
			 
			 if (altura != 0) {
				 somaAlturas += altura;
				 somaPessoas ++;
			 }
			 
			 } 
			 while (altura != 0);
			 
			 if (somaPessoas > 0) {
				 double mediaAltura = somaAlturas / somaPessoas;
				System.out.println("\nMédia das Alturas:" + mediaAltura);
					
				}
			 else {
				 System.out.println("\nNenhuma altura foi inserida.");
			 }
			 
			
			
			 
			 
		
		
		
	
		
		}
	
}




