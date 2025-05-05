
public class Mercado {
	
	String mercado;
	int numeroMacasVendidas;
	double precoVendaMaca;
	int numeroLaranjasVendidas;
	double precoVendaLaranja;
	

	public Mercado(String mercado, int numeroMacasVendidas, double precoVendaMaca, int numeroLaranjasVendidas,
			double precoVendaLaranja) {
		super();
		this.mercado = mercado;
		this.numeroMacasVendidas = numeroMacasVendidas;
		this.precoVendaMaca = precoVendaMaca;
		this.numeroLaranjasVendidas = numeroLaranjasVendidas;
		this.precoVendaLaranja = precoVendaLaranja;
	}

	public double vendasMaca() {
		
		double vendaMaca = numeroMacasVendidas * precoVendaMaca;
		
		return vendaMaca;
	}
	
	public double vendasLaranjas() {
		
		double vendaLaranja = numeroLaranjasVendidas * precoVendaLaranja;
		
		return vendaLaranja;
		
	}
	
	public double receitaTotal() {
		
		return vendasMaca() + vendasLaranjas();
	}
	
	

}
