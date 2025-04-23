
public class Empregado {
	int identificacao;
	String nome;
	String sobreNome;
	double salario;
	
	
	public double calcularSalario() {
		
		return salario * 12 ;
	
	}
	
	public String nomeSobreNome() {
		return nome +" " + sobreNome;
	}

}
