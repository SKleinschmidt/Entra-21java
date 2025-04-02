import java.util.Scanner;

public class Exercico05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     
     System.out.println("Nota");
     
     System.out.println("Nota A");
     double a = input.nextDouble();
     
     System.out.println("Nota B");
     double b = input.nextDouble();
     
     System.out.println("Peso da Nota");
     
     System.out.println("Peso A");
     double pesoA = 3.5;
     
     System.out.println("Peso B");
     double pesoB = 6.5;
     
     System.out.println("Média");
     
     double media = ((a * pesoA) + (b * pesoB)) / 10;
     
     
     
     
     
     
     System.out.println("média:" + media);
    
     


	}

}
