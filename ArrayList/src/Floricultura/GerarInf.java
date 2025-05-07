package Floricultura;

public class GerarInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SistemaFloricultura sistema = new SistemaFloricultura();
		
		Flores rosa = new Flores("Rosa Vermelha", 35.5,"João",false);
		Flores rosaBranca = new Flores("Rosa Branca",25.35,"Lucas",false);
		Flores rosaAmarela = new Flores("Rosa Amarela",23.52,"Joana",true);
		Flores orquidea = new Flores("Orquide Branca",75.63,"Pedro",true);
		Flores petunia = new Flores("Petunia Vermelha",40,"Ana",false);
		Flores begonia = new Flores("Begonia roxa",27,"Rubia",true);
		Flores buqueRosas = new Flores("Buque de Rosas Sortidas",190,"Gisele",true);
		
		sistema.adicionarVenda(rosa);
		sistema.adicionarVenda(rosaBranca);
		sistema.adicionarVenda(rosaAmarela);
		sistema.adicionarVenda(orquidea);
		sistema.adicionarVenda(petunia);
		sistema.adicionarVenda(begonia);
		sistema.adicionarVenda(buqueRosas);
		
		System.out.println("informações das flores vendidas");
		rosa.exibirInformações();
		orquidea.exibirInformações();
		
		Flores florMaisCara = sistema.encontrarFlorMaisCara();
		
		if (florMaisCara != null) {
			System.out.println("A flor mais carra é: " + florMaisCara.getNomeFlor());
		}
		else {
			System.out.println("Nenhum uma venda encontrada");
		}
		
		System.out.println("\nAnalise de receita");
		sistema.calcularReceitaPorTipo();

	}

}
