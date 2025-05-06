import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// o Array list sempre vai começar com a seguinte informação
		
		List<String>listaNomes = new ArrayList<String>();
		
		// como é adicionado as informações a array list
		
		listaNomes.add("Carlos");
		listaNomes.add("Ana");
		listaNomes.add("Jessica");
		listaNomes.add("Joao");
		listaNomes.add("Pedro");
		
		// imprimir uma array list antes de ordenar ou de outra situação
		
		System.out.println(listaNomes);
		
		// Ordenando uma array list com o Collections.sort()
		
		Collections.sort(listaNomes);
		
		// imprindo a array list depois de ordenar ela
		
		System.out.println("\n" + listaNomes);
		
	
		
		
		

	}

}
