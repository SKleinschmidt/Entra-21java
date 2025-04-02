import java.util.Scanner;

public class ExercicioIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Vamos Cálcular o seu IMC");
		
		System.out.println("Insira o seu peso");
		double peso = input.nextDouble();
		
		System.out.println("Insira a sua altura");
		double altura = input.nextDouble();
		
		double resultado = peso / (altura * altura);
		
		if (resultado < 18.5) {
			System.out.println(" Você está abaixo do peso");
		}
		else if (resultado < 25) {
			System.out.println("Seu peso está normal");
		}
		else if (resultado < 30) {
			System.out.println("Você está com sobre peso");
		}
		else if (resultado < 35) {
			System.out.println("Você está com obesidade grau I");
		}
		else if (resultado < 40) {
			System.out.println("Você está com obesidade grau II");
		}
		else {
			System.out.println("Você está com obesidade grau III");
		}

	}

}
