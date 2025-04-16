import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Insira um numero");
		int base = input.nextInt();
		
		maisPerto(base);
		
	}

	public static void maisPerto(int base) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número");
		int numero1 = input.nextInt();
		
		System.out.println("Insira o segundo número");
		int numero2 = input.nextInt();
		
		int distancia1 = Math.abs(base - numero1);
		
		int distancia2 = Math.abs(base - numero2);
		
		if (distancia1 < distancia2) {
			System.out.println(numero1 + " " +"esta mais perto de" +" " + base + ".");
		}
		else if (distancia2 < distancia1) {
			System.out.println(numero2 + " " +"esta masi perto de" + " " + base + ".");
		}
		else {
			System.out.println("Os dois números estão longe do " + base);
		}
		
	}
}
