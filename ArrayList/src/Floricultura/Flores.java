package Floricultura;

public class Flores {
	
	private String nomeFlor;
	private double preco;
	private String cliente;
	private boolean paraPresente;
	
	public Flores(String nomeFlor, double preco, String cliente, boolean paraPresente) {
		this.nomeFlor = nomeFlor;
		this.preco = preco;
		this.cliente = cliente;
		this.paraPresente = paraPresente;
	}

	
	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		this.nomeFlor = nomeFlor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getcliente() {
		return cliente;
	}

	public void setcliente(String Cliente, String cliente) {
		this.cliente = cliente;
	}

	public boolean isParaPresente() {
		return paraPresente;
	}

	public void setParaPresente(boolean paraPresente) {
		this.paraPresente = paraPresente;
	}

	@Override
	public String toString() {
		return "Flores [nomeFlor=" + nomeFlor + ", preco=" + preco + ", nomeCliente=" + cliente + ", paraPresente="
				+ paraPresente + "]";
	}
	
	public void exibirInformações() {
		
		System.out.println("Nome: " + nomeFlor);
		System.out.println("Preço da flor R$  " + String.format("%.2f",preco));
		System.out.println("Cliente  " + cliente);
		System.out.println("Para presente:  " + (paraPresente ? "Sim" : "Não"));
		System.out.println("-----------------------");
		
	}
	
	

}
