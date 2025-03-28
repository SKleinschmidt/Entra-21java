import java.util.Scanner;

public class Exercico03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Produto A");
		double produtoA = input.nextDouble();
		
		System.out.println("ProdutoB");
		double produtoB = input.nextDouble();
		
		System.out.println("Produto C");
		double produtoC = input.nextDouble();
		
		System.out.println("Produto D");
		double produtoD = input.nextDouble();
		
		System.out.println("Produto A e B");
		
		System.out.println("Multiplicação dos produtos");
		
		double resultadoAB = (produtoA * produtoB);
		
		double resultadoCD = (produtoC * produtoD);	
		
		double resultado = (resultadoAB - resultadoCD);
		
		System.out.println("o resultado é:" + resultado);
		
		
		
		
		
		

	}

}
