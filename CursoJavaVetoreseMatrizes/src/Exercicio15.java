
public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrizImovel = {
				{2104,3,399900},
				{1600,3,329900},
				{2400,3,369000},
				{1416,2,232000},
				{3000,4,539900},
				{1985,4,299900},
				{1534,3,314900},
				{1427,3,199000},
				{1380,3,212000},
				{1494,3,242500},
				{1940,4,240000},
				{2000,3,347000},
				{1890,3,330000},
				{4478,5,699900},
				{1268,3,259900}
				
		};
		
		System.out.println("Dados dos Imóveis");
		System.out.println("Tamanho------tQuarto------------tPreço");
		
		for (int [] imovel : matrizImovel) {
			System.out.println(imovel[0] + "\t\t" + imovel[1] + "\t\t" + imovel[2]);	
		}
		System.out.println();
		
		double somaPreco = 0;
		for (int[] imovel : matrizImovel) {
			somaPreco += imovel[2];
		}
		 double mediaPreco = (double) somaPreco / matrizImovel.length;
		 System.out.println("Média dos preços:" + mediaPreco);
		 System.out.println();
		 
		 
		 int[] imovelMaisCaro = null;
		 int precoMaximo = -1;
		 
		 for (int [] imovel : matrizImovel) {
			 if (imovel[2] > precoMaximo) {
				 precoMaximo = imovel[2];
				 imovelMaisCaro = imovel;
			 }
		 }
		 
		 if (imovelMaisCaro != null) {
			 System.out.println("Imovel mais caro:");
			 System.out.println("Tamanho:" + imovelMaisCaro[0] + ",Quarto:" + imovelMaisCaro[1] + ",Preço:" + imovelMaisCaro[2]);
			 
		 }
		 
		 System.out.println();
		 
		int quartoDesejado = 3;
		System.out.println("Imovel com " + quartoDesejado + "quartos:");
		
		for (int [] imovel : matrizImovel) {
			if (imovel[1] ==quartoDesejado) {
				System.out.println("Tamanho:" + imovel[0] + ",Preço:" + imovel[2]);
				
			}
			
		}
		
		System.out.println();
		
	}

}
