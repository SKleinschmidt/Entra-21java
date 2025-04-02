import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int [] valores = new int[5];
		
		for ( int i = 0; i < 5; i++) {
			boolean valorValido = false;
			while (!valorValido) {
				System.out.println("Digite um valor" + (i + 1 ) + "º valor ( entre e 1000):");
				int valor = input.nextInt();
				
				if (valor >= 0 && valor <= 1000) {
					valores[i] = valor;
					valorValido = true;
				}
				else {
					System.out.println(" Valor invalido. Digite um valor entre 0 a  1000");
				}
					
					
				}
			}
			
		System.out.println("\nValores inseridos:");
		for (int valor : valores) {
			System.out.println(valor + "");
			
		}
			
		}
		
		

	}


