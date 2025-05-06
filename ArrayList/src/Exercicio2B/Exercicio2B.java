package Exercicio2B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// iciando a arraylist 
		
		List<Integer>listaNumero = new ArrayList<Integer>();
		
		listaNumero.add(25);
		listaNumero.add(60);
		listaNumero.add(15);
		listaNumero.add(9);
		listaNumero.add(45);
		listaNumero.add(1);
		listaNumero.add(29);
		
		// imprimindo a lista antes de inverter ela
		
		System.out.println("Lista de Números antes de inverter\n" + listaNumero);
		
		// como inverter a lista 
		
		Collections.reverse(listaNumero);
		
		// imprimindo a lista ápos ter invertido ela
		
		System.out.println("\nLista de números ápos ter invertido ela\n" + listaNumero);
		

	}

}
