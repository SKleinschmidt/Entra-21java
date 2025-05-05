
public class FaturamentoMercados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mercado m1 = new Mercado("Mercado do João Unidade Blumenau ", 25000, 0.45, 45000, 0.60);
		
		Mercado m2 = new Mercado("Mercado do João Unidade Joinvile", 30000, 0.50, 15000, 0.45);
		
		Mercado m3 = new Mercado("Mercado do João Unidade florianópolis", 50000, 0.65, 80000, 0.55);
		
		
		
		Mercado vetor[] = {m1,m2,m3};
	
		
		// Quem teve a maior receita vendendo maçãs
		
		double maiorReceitaMaca = Double.MIN_VALUE;
		String maiorReceitaMacaNome = "";
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i].vendasMaca() > maiorReceitaMaca) {
				maiorReceitaMaca = vetor[i].vendasMaca();
				maiorReceitaMacaNome = vetor[i].mercado;
			}
		}
		
		System.out.println("Maior Venda de Maças");
		System.out.println("\n" + maiorReceitaMacaNome);
	
		double maiorReceitaLaranja = Double.MIN_VALUE;
		String maiorReceitaLaranjaNome = "";
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i].vendasLaranjas() > maiorReceitaLaranja) {
				maiorReceitaLaranja = vetor[i].vendasLaranjas();
				maiorReceitaLaranjaNome = vetor[i].mercado;
			}
		}
		
		System.out.println("Maior Venda de Laranja");
		System.out.println("\n" + maiorReceitaLaranjaNome);
		
		// maior receita 
		
		double maiorReceitaTotal = 0;
		double receitaMeio = 0;
		String receitaMeionome;
		
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i].receitaTotal() > maiorReceitaTotal) {
				maiorReceitaTotal = vetor[i].receitaTotal();
		
			}
		}
		
		
		double receitaLaranja = 0;
		double receitaMaca = 0;
		
		for ( int i = 0; i < vetor.length; i++) {
			receitaLaranja += vetor[i].vendasLaranjas();
		}
	}

}
		
