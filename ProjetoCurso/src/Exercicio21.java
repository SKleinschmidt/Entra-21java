import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira as idades solicitadas abaixo");
		
		System.out.println("Homen 1 ");
		int homen1 = input.nextInt();
		
		System.out.println("Homen 2 ");
		int homen2 = input.nextInt();
		
		System.out.println("Mulher 1 ");
		int mulher1 = input.nextInt();
		
		System.out.println("Mulher 2 ");
		int mulher2 = input.nextInt();
		
		int homennovo;
		int homenvelho;
		int mulhernova;
		int mulhervelha;
		
		if (homen1 > homen2) {
			homenvelho = homen1;
			homennovo = homen2;
			System.out.println("Homen mais velho:" + homenvelho);
		}else {
			homenvelho = homen2;
			homennovo = homen1;
			System.out.println("Homen mais novo:" + homennovo);
			
		}
		
		if (mulher1 > mulher2) {
			mulhervelha = mulher1;
			mulhernova = mulher2;
			System.out.println("Mulher mais velha:" + mulhervelha);
		}else {
			mulhervelha = mulher2;
			mulhernova = mulher1;
			System.out.println("Mulher mais nova:" + mulhernova);
					
		}
		
		System.out.println("Homen mais Velho com mulher mais nova:" + (homenvelho + mulhernova ));
		System.out.println("Homen mais Novo com mulher masi velha:" + (homennovo + mulhervelha));
		
		
				
				
		
		
				

	}

}
