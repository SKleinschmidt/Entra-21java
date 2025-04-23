
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Sigfrid";
		p1.sexo = 'H';
		p1.dataNascimento = "17/08/1989";
		p1.estadoCivil = "Casado";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Roberta";
		p2.sexo = 'F';
		p2.dataNascimento = "28/01/1988";
		p2.estadoCivil = "casada";
		
		
		System.out.println("Data de nascimento do" + p1.nome + " " + p1.dataNascimento);
		System.out.println("Data de nascimento da " + p2.nome + " " + p2.dataNascimento);

	}

}
