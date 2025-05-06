package ArrayListClassesObjetos1;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorRetangulo {
	
	private List<Retangulo> retangulos;

	public GerenciadorRetangulo() {
		this.retangulos = new ArrayList<Retangulo>();
		
	}
	
	public void adicionarRetangulo(Retangulo retangulo) {
		
		retangulos.add(retangulo);
	
	}
	
	public Retangulo encontrarMaiorArea() {
		if (retangulos.isEmpty()) {
			
			
		}
		return null;
		
	}
	
	

}
