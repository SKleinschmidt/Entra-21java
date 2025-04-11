import java.util.Scanner;

public class Praticando4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// taxa minima ate 10.000 metros cubicos
		double taxaMinima = 44.40;
		// de 11 á 20 metros cubicos
		double valorMetroscubicos11A20 = 5.15;
		// de 20 metros cubicos para cima
		double valorMetrosCubicosACima20 = 6.513;
		// taxa do tratamento de esgoto
		double tratamentoEsgoto = 1.09;
		double tratamentoEsgotoMenosQue10 =0.80;
		// Taxa de coleta de lixo
		double coletaLixo = 75.72;
		
		System.out.println("Insira os Metros Cubicos consumidos");
		double consumo = input.nextDouble();
		
		if (consumo <= 10) {
			consumo = taxaMinima;
			tratamentoEsgoto = consumo * tratamentoEsgotoMenosQue10;
			System.out.println("Valor a ser pago:" + consumo);
			System.out.println("Tratamento de esgoto:" + tratamentoEsgoto);
			System.out.println("Taxa de lixo:" + coletaLixo);
		}
		else if (consumo >= 11 && consumo <= 20) {
			consumo = (consumo * valorMetroscubicos11A20) + taxaMinima;
			tratamentoEsgoto = consumo * tratamentoEsgoto;
			System.out.println("Valor a ser pago:" + consumo);
			System.out.println("Tratamento de esgoto:" + tratamentoEsgoto);
			System.out.println("Taxa de lixo:" + coletaLixo);
		}
		else if (consumo >=21) {
			consumo = (consumo * valorMetrosCubicosACima20) + taxaMinima;
			tratamentoEsgoto = consumo * tratamentoEsgoto;
			System.out.println("Valor a ser pago:" + consumo);
			System.out.println("Tratamento de esgoto:" + tratamentoEsgoto);
			System.out.println("Taxa de lixo:" + coletaLixo);
		}
		else {
			System.out.println("Nao foi possivel Cálcular");
		}
		
		double fatura = consumo + tratamentoEsgoto + coletaLixo;
		System.out.println("Total da fatura é:" + fatura);
		

	}


}
