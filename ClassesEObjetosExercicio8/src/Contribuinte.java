
public class Contribuinte {
	
	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;
	
	
	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaAnual(rendaAnual);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			
			this.nome = nome;
		}
		else {
			System.out.println("Nome Invalido.");
		}
		
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		
		if (cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
			this.cpf = cpf;
		}
		else {
			System.out.println("CPF Inválido.Formato esperado: 000.000.000-00");
		}
	
		
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		if (uf!= null && (uf.equals("RS") || uf.equals("PR") || uf.equals("SC"))) {
			this.uf = uf;
		}
		else {
			System.out.println("UF inválido. As opções são: PR,SC,RS.");
		}
		
	}


	public double getRendaAnual() {
		return rendaAnual;
	}


	public void setRendaAnual(double renadaAnual) {
		if (rendaAnual >= 0) {
			this.rendaAnual = renadaAnual;
		}
		else {
			System.out.println("Renda Anual inválida");
		}
	}
	
	
	// metodo e forma de calcular o imposto de renda
	
	public double calculoDoImpostoRenda() {
		
		
		double imposto = 0.0;
		
		if (rendaAnual >= 4000 && rendaAnual <= 9000) {
			imposto = rendaAnual * 0.058;
		}
		else if (rendaAnual >= 9001 && rendaAnual <= 25000) {
			imposto = rendaAnual * 0.15;
		}
		else if (rendaAnual >= 25001 && rendaAnual <=35000) {
			imposto = rendaAnual * 0.275;
		}
		else {
			imposto = rendaAnual * 0.30;
			
		}
	
		return imposto;
		
		
	}
	
	
	
	

}
