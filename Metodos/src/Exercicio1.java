import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numeroEstacao;
		
		System.out.println(" Escolha a opção ");
		System.out.println(" 1- Verão");
		System.out.println(" 2- Outono");
		System.out.println(" 3- Inverno");
		System.out.println(" 4- Primavera");
		
		System.out.println("Qual a sua escolha");
		numeroEstacao = input.nextInt();
		
		 if (numeroEstacao == 1) {
			verao();
			}
		 else if (numeroEstacao == 2) {
			outono();
		 }
		 else if (numeroEstacao == 3) {
			 inverno();
		 }
		 else if (numeroEstacao == 4) {
			 primavera();
		 }
		 else {
			 System.out.println("Opção invalida");
		 }
				
		}
public static void verao() {
	System.out.println("É verão ");
	System.out.println("O tempo será muito quente");
	
}
public static void outono() {
	System.out.println("É Outono");
	System.out.println("É tempo das folhas cairem das árvores");
	
}
public static void inverno() {
	System.out.println("É Inverno");
	System.out.println("Tempo para uma canja de galinha e chocolate quente");
	
}
public static void primavera() {
	System.out.println("É Primavera");
	System.out.println("Estação das flores");
	
}
	
	}


