
public class CalculoDoImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// vetor para armazenamento das informações dos 5 contribuintes
		Contribuinte [] contribuintes = new Contribuinte[5];
		
		contribuintes[0] = new Contribuinte("Jose da Costa ", "075.352.362-01", "SC", 2500);
		contribuintes[1] = new Contribuinte("Gerusa Perreira", "085.963.596-23", "PR",7500);
		contribuintes[2] = new Contribuinte("Jessica Silva", "069.770.665-50", "RS", 15000);
		contribuintes[3] = new Contribuinte("Judas Lock", "088.556.495-69", "PR", 28000);
		contribuintes[4] = new Contribuinte("Sig Kl", "074.392.629-30", "SC", 105000);
		
		double maiorImposto = -1.0;
		String nomeMaiorImposto = "";
		double menorImposto = Double.MAX_VALUE;
		String nomeMenorImposto = "";
		double totalImposto = 0.0;
		
		// calcular o imposto de cada contribuinte e verificar quem paga mais e quem é o maior e menor pagador
		
		for (Contribuinte contribuinte : contribuintes) {
			double impostoDevido = contribuinte.calculoDoImpostoRenda();
			totalImposto += impostoDevido;
			
		System.out.println("Nome: " + contribuinte.getNome());
		System.out.println("CFP: " + contribuinte.getCpf());
		System.out.println("UF: " + contribuinte.getUf());
		System.out.println("Renda Anual: " + contribuinte.getRendaAnual());
		System.out.println("Imposto a Pagar: " + "R$ " +  String.format("%.2f", impostoDevido));
		System.out.println("----------------------");
		
		
		if (impostoDevido > maiorImposto) {
			maiorImposto = impostoDevido;
			nomeMaiorImposto = contribuinte.getNome();
			
		}
		
		 if (impostoDevido < menorImposto) {
			menorImposto = impostoDevido;
		    nomeMenorImposto = contribuinte.getNome();
		}
		 
		}
		
		System.out.println("\n---Resultado---");
		System.out.println("\nQuem mais paga imposto: " + nomeMaiorImposto + " " + "R$ " + String.format("%.2f", maiorImposto));
		System.out.println("\nQuem menos paga imposto: " + nomeMenorImposto + " " + "R$ " + String.format("%.2f", menorImposto));
		System.out.println("\nTotal de imposto pago entre 5 contribuintes: R$ " + String.format("%.2f", totalImposto));
		
		
	
	}

}
