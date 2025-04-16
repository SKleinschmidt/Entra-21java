import java.util.Scanner;

public class Exercicio7O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o seu mone");
		String nome = input.next();
		
		System.out.println("insira o sobre nome");
		String sobreNome = input.next();
		
		System.out.println("Insira o sobre de solteira da mãe");
		String sobreNomeMae = input.next();
		
		System.out.println("Cidade onde nasceu");
		String cidade = input.next();
		
		generateStarWars(nome, sobreNome, sobreNomeMae, cidade);
		

	}
	public static void generateStarWars(String nome, String sobreNome, String sobreNomeMae, String cidade) {
		String primeiroNomeStarWars = sobreNome.substring(0,3) + nome.substring(0,2);
		String sobreNomeStarWars = sobreNome.substring(0,2) + cidade.substring(0,3);
		String nomeStarWars = primeiroNomeStarWars + " " + sobreNomeStarWars;
		
		System.out.println(nomeStarWars);
		
	}

}
