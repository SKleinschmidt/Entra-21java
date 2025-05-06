package Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// incianado uma arraylist 
		
		List<Double>listaNumero = new ArrayList<Double>();
		
		double numero;
		// lendo os valor que foram inserido pelo usuario
		
		do {
			System.out.println("\nDigite um número ou (0 para sair)");
			numero = input.nextDouble();
			if (numero!= 0) {
				listaNumero.add(numero);
			}
		} while (numero !=0);
		
		// verificando se foi inserido algum numero decimal
		if (listaNumero.isEmpty()) {
			System.out.println("Nem um numero decimal foi inserido");
			
		}
		else {
			// calculando o menor numero
			double menor = Collections.min(listaNumero);
			System.out.println("\nO menor numero é: " + menor);
			
			// calculando o maior numero
			double maior = Collections.max(listaNumero);
			System.out.println("\nO maior numero é: " + maior);
			
			// como fazer a soma da arraylist
			double soma = 0;
			
			for (double valor : listaNumero) {
				soma += valor;
				
			}
			
			// calculando a media da array list
			double media = soma / listaNumero.size();
			System.out.println("\nA média dos numero é:" + media);
			
		}
		
			
			
		
		

	}

}
