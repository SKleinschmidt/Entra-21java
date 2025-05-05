
public class Aeronave {
	private String modelo;
	private int passageiros;
	private int velocidadeMaxima;
	private double capacidadeCombustivel;
	private double queimaDeCombustivelPorMinuto;
	
	
	public Aeronave(String modelo, int passageiros, int velocidadeMaxima, double capacidadeCombustivel,
			double queimaDeCombustivelPorMinuto) {
		super();
		setModelo(modelo);
		setPassageiros(passageiros);
		setVelocidadeMaxima(velocidadeMaxima);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaDeCombustivelPorMinuto(queimaDeCombustivelPorMinuto);
	}
	
	// metodo usado para calcular qaul sera o tempo maximo de voo
	
	public double calcularTempoMaximoVoo() {
		
		return this.capacidadeCombustivel / this.queimaDeCombustivelPorMinuto;
	}
	
	// metodo usado para calcular qual sera a distancia maxima que pode ser percorrida
	
	public double calcularDistanciaMaximaVoo() {
		
		return calcularTempoMaximoVoo() * (this.velocidadeMaxima / 60.0);
	}
	
	// metodo para obter a quantidade de passageiros
	
	public int getPassageiros () {
		
		return this.passageiros;
	}
	
	// meotodo para obter qual é o modelo 
	
	public String getModelo() {
		
		return this.modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}

	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}

	public double getQueimaDeCombustivelPorMinuto() {
		return queimaDeCombustivelPorMinuto;
	}

	public void setQueimaDeCombustivelPorMinuto(double queimaDeCombustivelPorMinuto) {
		this.queimaDeCombustivelPorMinuto = queimaDeCombustivelPorMinuto;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", passageiros=" + passageiros + ", velocidadeMaxima=" + velocidadeMaxima
				+ ", capacidadeCombustivel=" + capacidadeCombustivel + ", queimaDeCombustivelPorMinuto="
				+ queimaDeCombustivelPorMinuto + "]";
	}
	
	

}
