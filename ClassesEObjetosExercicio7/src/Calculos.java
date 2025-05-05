
public class Calculos {

	private Aeronave maiorTempovoo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aeronave aviao1 = new Aeronave("Boing A350", 350, 900,5000, 6);
		Aeronave aviao2 = new Aeronave("Boing A700", 300, 1050,60000, 7);
		Aeronave aviao3 = new Aeronave("Boing 767", 500, 800, 8000, 9);
		Aeronave aviao4 = new Aeronave("Boing A800", 200, 850,5000, 5);
		
		Aeronave [] aeronaves = {aviao1,aviao2,aviao3,aviao4};
		
		calcularInformacoes(aeronaves);
		

	}

	private static void calcularInformacoes(Aeronave[] aeronaves) {
		// TODO Auto-generated method stub
		
		
		// a) Qual aeronave leva o maior número de passageiros?

		Aeronave maiorPassageiros = aeronaves[0];
		
		for (Aeronave aeronave : aeronaves) {
			if (aeronave.getPassageiros() > maiorPassageiros.getPassageiros()) {
				maiorPassageiros = aeronave;
			}
		}
		
		System.out.println("A aeronave com o maior número de passageiro é: " + maiorPassageiros.getModelo() + " (" + maiorPassageiros.getPassageiros() + "Passageiros)");
	}

	double maiorAutominia = Double.MIN_VALUE;
	String moneAeronave = "";
	
	
		
		

	
	

	


	
	



	
		
	}

	
	
	
	
	
	


	
	
	



