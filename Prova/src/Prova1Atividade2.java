import java.util.Scanner;

public class Prova1Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// comição paga para o vendedor
		
		double comicao = 0.17;
		
		System.out.println("Isniras as inforções abaixo");
		
		// como iserir o mone do vendedor ou sair
		
		while (true){
			System.out.println("\nInsira o codigo do vendedor deja continuar(1-Sim ou 2-nao para sair");
		int vendedor = input.nextInt();
		
		if (vendedor == 2) {
			break;
		}
			
		// como iserir o total de vendas realizadas
		
		        System.out.println("Insira o nome do vendedor");
		        String nomeVendedor = input.next();
		
				System.out.println("\nTotal de vendas realizadas");
				double vendas = input.nextDouble();
				
				double salario = vendas * comicao;
				
				System.out.println("\nVendedor:" + nomeVendedor);
				System.out.println("Total vendido:" + vendas);
				System.out.println("Salario:"+"R$" + salario);
				
				
		}
		
		
		
		
		
				
	}

}
