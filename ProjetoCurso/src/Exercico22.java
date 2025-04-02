import java.util.Scanner;

public class Exercico22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Informe a idade dos Filhos");
		
		System.out.println("Marquinhos");
		int marquinho = input.nextInt();
		
		System.out.println("Zezinho");
		int zezinho = input.nextInt();
		
		System.out.println("Luluzinha");
		int luluzinha = input.nextInt();
		
		String maisvelho;
		String irmaodomeio;
		String cacula;
		
		
		if (marquinho > zezinho && zezinho > luluzinha) {
			maisvelho = "Marquinhos";
			System.out.println(" Mais Velho:" + maisvelho);
		}
		else if (zezinho > marquinho && marquinho > luluzinha) {
			maisvelho = "Zezinho";
			System.out.println("Mais Velho:" + maisvelho);
		}
		else { maisvelho = "Luluzinha";
		System.out.println("Mais velho:" + maisvelho);
	}
		
		if (marquinho > zezinho && marquinho < luluzinha || marquinho < zezinho && marquinho > luluzinha) {
			irmaodomeio = " Marquinhos";
			System.out.println("Irmão do meio:" + irmaodomeio);
		}
		else if (zezinho > marquinho && zezinho < luluzinha || zezinho < marquinho && marquinho > luluzinha) {
			irmaodomeio = "Zezinho";
			System.out.println("Irmão do meio:" + irmaodomeio);
		}
		else {irmaodomeio = "Luluzinha";
		System.out.println("Irmão do Meio:" + irmaodomeio);
		}
		
		
	}
}
	
