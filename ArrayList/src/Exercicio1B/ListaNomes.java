package Exercicio1B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inicio de uma arrayList
		
		List<String>listaNome = new ArrayList<String>();
		
		// como se escreve uma arrayList
		
		listaNome.add("Lucas");
		listaNome.add("Sig");
		listaNome.add("Amanda");
		listaNome.add("Roberta");
		listaNome.add("Pedro");
		listaNome.add("Wilson");
		
		// imprimindo a arrayList
		
		System.out.println("lista antes de ordenar" + "\n" + listaNome);
		
		// como ordenar a arraylist
		
		Collections.sort(listaNome);
		
		// como fica a array list depois de ordenar ela
		
		System.out.println("\nlista ápos ordenar ela" + "\n" + listaNome);
		

	}

}
