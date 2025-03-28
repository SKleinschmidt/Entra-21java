import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira um valor para Converter");
		double valor = input.nextDouble();
		
		System.out.println(" Escolha qual tipo de Converção");
		
		System.out.println("1 - Temperatura");
		System.out.println("2 - Peso");
		System.out.println("3 - Comprimento");
		System.out.println("4 - Volume");
		
		int escolha = input.nextInt();
		
		if (escolha == 1 ) {
			System.out.println("1 - Celsius");
			System.out.println("2 - Kelvin");
			System.out.println("3 - Fahrenheit ");
			
			 escolha = input.nextInt();	
			 
			 if (escolha == 1 ) {
					System.out.println("Celsius - Fahrenheit:" + (valor * 5/9 + 32) );
					System.out.println("Celsius - Kelvin:" + (valor +  273.15));
				}
				else if (escolha == 2) {
					System.out.println("Kelvin - Celsius:" + (valor - 273.15));
					System.out.println("Kelvin - Fahrenheit" + (valor - 273.15 * 5/9 + 32));
					
				}
				else if (escolha == 3 ) {
					System.out.println("Fahrenheit - Celsius:" + (valor - 32) * 5/9);
					System.out.println("Fahrenheit - Kelvin:" + ((valor - 273.15) * 5/9 + 32));
				}else {
					
					System.out.println("Escolha Invalida");
				}
		
	}
		else if (escolha == 2) {
			System.out.println("1- Quilos ");
			System.out.println("2- Libras ");
			System.out.println("3- onças");
			
			escolha = input.nextInt();
			
			if (escolha == 1) {
				System.out.println("Quilos - Libas:" + (valor * 2.2046));
				System.out.println("Quilos - Onças:" + (valor * 35.274));
	
			}
			else if (escolha == 2) {
				System.out.println("Libras - Quilos:" + (valor / 2.2046));
				System.out.println("Libras - Onças:" + (valor * 16));
			}
			else if (escolha == 3) {
				System.out.println("Onças - Quilos:" + (valor / 35.274));
				System.out.println("Onças - Libras:" + (valor / 16));
			}else {
				System.out.println("Escolha Invalida");
			}
		}
		else if (escolha == 3) {
			System.out.println("1 - Metros");
			System.out.println("2 - Pés");
			System.out.println("3 - Polegadas");
			
			escolha = input.nextInt();
			
			if (escolha == 1) {
				System.out.println("Metros - Pés:" + (valor * 3.28084));
				System.out.println("Metros - Polegadas:" + (valor * 39.3701));
			}
			else if (escolha == 2) {
				System.out.println("Pés - Metros:" + (valor / 3.28084 ));
				System.out.println("Pés - Polegadas:" + (valor * 12));
			}
			else if (escolha == 3) {
				System.out.println("Polegadas - Metros:" + (valor / 37.01));
				System.out.println("Polegadas - Pés:" + (valor / 12));
			}else {
				System.out.println("Escolha Invalida");
			}
		}
			else if (escolha == 4) {
				System.out.println("1 - Litros");
				System.out.println("2 - Galão liquido");
				System.out.println("3 - Onças liquidas");
				
				escolha = input.nextInt();
				
				if (escolha == 1) {
					System.out.println("litros - Galão liquido:" + (valor / 3.78541));
					System.out.println("Litros - Onças liquidas:" + (valor  * 33.814));
			}
				else if (escolha == 2) {
					System.out.println("Galão - Litros:" + (valor * 3.78541));
					System.out.println("Galão liquido - Onças liquidas:" + (valor * 128));
				}
				else if (escolha == 3) {
					System.out.println("Onças liquidas - metros:" + (valor / 33.814));
					System.out.println("Onças liquidas - Galão liquido:" + (valor / 128));
				}else {
					System.out.println("Escolha Invalida");
				}
		
		
	
		
		
	     
			
	
		
		
	}
	}

}
