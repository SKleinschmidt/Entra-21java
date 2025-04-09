import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String [][] matrizLucro = new String [12][2];
		
		matrizLucro [0] [0] = "Janeiro";
		matrizLucro [0] [1] = "2000";
		
		matrizLucro [1] [0] = "Fevereiro";
		matrizLucro [1] [1] = "1500";
		
		matrizLucro [2] [0] = "Março";
		matrizLucro [2] [1] = "2500";
		
		matrizLucro [3] [0] = "Abril";
		matrizLucro [3] [1] = "1400";
		
		matrizLucro [4] [0] = "Maio";
		matrizLucro [4] [1] = "3200";
		
		matrizLucro [5] [0] = "Junho";
		matrizLucro [5] [1] = "2800";
		
		matrizLucro [6] [0] = "Julho";
		matrizLucro [6] [1] = "1700";
		
		matrizLucro [7] [0] = "Agosto";
		matrizLucro [7] [1] = "2100";
		
		matrizLucro [8] [0] = "Setembro";
		matrizLucro [8] [1] = "800";
		
		matrizLucro [9] [0] = "Outubro";
		matrizLucro [9] [1] = "3600";
		
		matrizLucro [10] [0] = "Novembro";
		matrizLucro [10] [1] = "4200";
		
		matrizLucro [11] [0] = "Dezembro";
		matrizLucro [11] [1] = "6000";
		
		System.out.println("Mês       | Lucro      ");
		System.out.println("----------|------------");
		
		
		for (int i = 0; i < matrizLucro.length; i++) {
			
			int numeroDoMes = i + 1;
			String mes = String.format("%-9s", matrizLucro [i] [0]);
			String lucro ="R$" +  matrizLucro  [i] [1];
		
			System.out.println(mes + " | " + lucro);
			
			
			
		}
		
		

	}

}
