import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double altura;
		double somaAlturaMulheres = 0;
		int quantidadeMulheres = 0;
		double somaAlturaGrupo = 0;
		int quantidadePessoas = 0;
		
		while (true) {
			System.out.println("Digite a Altura ou 0 para sair ");
			altura = input.nextDouble();
			
			if (altura == 0) {
				break;
			}
			
			System.out.println("Digite o Sexo(M para masculino e F para feminino):");
			String sexo = input.next();
			
			if (sexo.equalsIgnoreCase("F")) {
				
				somaAlturaMulheres += altura;
				quantidadeMulheres ++;
				
			}
			if (quantidadeMulheres > 0) {
				double mediaAlturaMulheres = somaAlturaMulheres / quantidadeMulheres;
				
				
				
			}
		}
		
		

	}

}
