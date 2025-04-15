import java.util.Scanner;

public class Exercicio2 {

	public static void sig() {
		System.out.println("O nome é Sigfrid Kleinschmidt");
		System.out.println("ele tem 36 anos");
		System.out.println("Não tem filhos");
		System.out.println("È caso");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o nome do seu colega");
		String nome = input.next();
		
		
		if (nome.equalsIgnoreCase(nome)) {
			sig();
			
			
		}
		

	}

}
