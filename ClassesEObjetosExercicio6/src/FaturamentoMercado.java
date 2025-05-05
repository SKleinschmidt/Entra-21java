
public class FaturamentoMercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mercado m1 = new Mercado("Mercado do João Unidade Blumenau ", 25000, 0.45, 45000, 0.60);
		
		Mercado m2 = new Mercado("Mercado do João Unidade Joinvile", 30000, 0.50, 15000, 0.45);
		
		Mercado m3 = new Mercado("Mercado do João Unidade florianópolis", 50000, 0.65, 80000, 0.55);
		
		
		System.out.println(m1.mercado);
		System.out.println("Faturamento das Macas " + "R$ "+ m1.vendasMaca());
		System.out.println("Faturamento das laranjas " + "R$ " + m1.vendasLaranjas());
		System.out.println("Total Faturado " + "R$ " + m1.receitaTotal());
		
		System.out.println("\n" + m2.mercado);
		System.out.println("Faturamento das Macas " + "R$ " + m2.vendasMaca());
		System.out.println("Faturamento das laranjas " + "R$ " + m2.vendasLaranjas());
		System.out.println("Total Faturado " + "R$ " + m2.receitaTotal());
		
		System.out.println("\n" + m3.mercado);
		System.out.println("Faturamento das Macas " + "R$ " + m3.vendasMaca());
		System.out.println("Faturamento das Laranjas " + "R$ " + m3.vendasLaranjas());
		System.out.println("Total Faturado " + "R$ " + m3.receitaTotal());
		
		
		 
		
		String maiorVendaMaca;
		
		if (m1.vendasMaca() > m2.vendasMaca() || m1.vendasMaca() > m3.vendasMaca()) {
			maiorVendaMaca = m2.mercado;
			System.out.println("\nMaior Venda de Maças " + m2.mercado);
		}
		else if (m2.vendasMaca() < m3.vendasMaca() || m3.vendasMaca() > m2.vendasMaca()) {
			maiorVendaMaca = m3.mercado;
			
			System.out.println("\nMaior venda de Maças" + " " + m3.mercado);
		}
		else {
			System.out.println("\nMaior venda de Maças" + " " + m1.mercado);
		}
		
		String maiorVendaLaranja;
		
		if (m1.vendasLaranjas() > m2.vendasLaranjas() || m1.vendasLaranjas() > m3.vendasLaranjas()) {
			maiorVendaLaranja = m2.mercado;
			System.out.println("\nMaior venda de Laranja" + " " + m2.mercado);
		}
		else if (m2.vendasLaranjas() < m3.vendasLaranjas() || m3.vendasLaranjas() > m2.vendasLaranjas()) {
			maiorVendaLaranja = m3.mercado;
			System.out.println("\nMaior venda de Laranja" + " " + m3.mercado);
		}
		else {
			System.out.println("\nMaior venda de Laranja" + " " + m1.mercado);
		}
		
		double maiorReceita;
		
		
	
	}

}
