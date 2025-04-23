
public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo1 = new Circulo(5);
		Circulo circulo2 = new Circulo(7);
		Circulo circulo3 = new Circulo(15.6);
		Circulo circulo4 = new Circulo(25.3);
		Circulo circulo5 = new Circulo(13);
		
		double area1 = circulo1.calcularArea();
		System.out.println("Área do objeto 1 é:" + " " + area1);
		
		double area2 = circulo2.calcularArea();
		System.out.println("\nÁrea do objeto 2 é:" + " " + area2);
		
		double area3 = circulo3.calcularArea();
		System.out.println("\nÁrea do objeto 3 é:" + " " + area3);
		
		double area4 = circulo4.calcularArea();
		System.out.println("\nÁrea do objeto 4 é:" + " " + area4);
		
		double area5 = circulo5.calcularArea();
		System.out.println("\nÁrea do objeto 5 é:" + " " + area5);

	}

}
