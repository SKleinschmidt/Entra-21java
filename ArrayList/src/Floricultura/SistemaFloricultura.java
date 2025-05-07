package Floricultura;

import java.util.ArrayList;
import java.util.List;

public class SistemaFloricultura {
	private List<Flores> vendas;

	public SistemaFloricultura() {
		vendas=new ArrayList<Flores>();
		
	}
	
	public void adicionarVenda(Flores flores) {
		this.vendas.add(flores);
	
	}
	public Flores encontrarFlorMaisCara() {
		if (vendas.isEmpty()) {
			return encontrarFlorMaisCara();
			
		}
		
		Flores florMaisCara = vendas.get(0);
		
		for (Flores flores : vendas) {
			if (flores.getPreco() > florMaisCara.getPreco()) {
				florMaisCara = flores;
			}
		}
		return florMaisCara;
		
	}
	
	public void calcularReceitaPorTipo() {
		double receitaPresente = 0;
		double receitaNaoPresente = 0;
		
		for (Flores flores : vendas) {
			
			if(flores.isParaPresente()) {
				receitaPresente += flores.getPreco();
			}
			else {
				receitaNaoPresente += flores.getPreco();
			}
		}
		
		System.out.println("Receita com flores para presente R$: " + String.format("%.2f", receitaPresente));
		System.out.println("Receita com flores não presente R$: " + String.format("%.2f", receitaNaoPresente));
		
		if (receitaPresente > receitaNaoPresente) {
			System.out.println("A loja teve uma receita maior vendendo flores para presente");
		}
		else if (receitaNaoPresente > receitaPresente) {
			System.out.println("A loja teve uma receita maior vendendo flores que não são para presente");
		}
		else {
			System.out.println("A receita das flores para presente e não presente são iguais");
		}
	}
	

}
