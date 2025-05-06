package Exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// iniciando uma arraylist sempre vai inicar como String,Double,Integer... sempre iniciando maiuscolo
		
		List<Double>listaNumeros = new ArrayList<Double>();
		
		listaNumeros.add(25.5);
		listaNumeros.add(19.25);
		listaNumeros.add(35.33);
		listaNumeros.add(11.36);
		listaNumeros.add(20.1);
		listaNumeros.add(150.25);
		listaNumeros.add(0.01);
		
		// lista antes de inverter 
		
		System.out.println("\nLista antes de inverter"+"\n" + listaNumeros);
		
		// como inverter a lista
		
		Collections.reverse(listaNumeros);
		
		// lista apos inverter a lista
		
		System.out.println("\nLista invertida" + "\n" + listaNumeros);
		
		
		
		

	}

}
