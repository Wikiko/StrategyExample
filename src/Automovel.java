
public abstract class Automovel implements IAutomovel {
	
	protected int qtdRodas;
	protected double velocidadeAtual;
	protected String marca;
	protected String modelo;
	
	public Automovel(int qtdRodas, String marca, String modelo){
		this.qtdRodas = qtdRodas;
		this.velocidadeAtual = 0;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void acelerar(int qtdAcelerar){
		System.out.println("Acelerando: " + qtdAcelerar);
	}
	
	public void frear(int qtdFrear){
		System.out.println("Freando: " + qtdFrear);
	}
	
	public int getQtdRodas(){
		return this.qtdRodas;
	}
	
	public double getVelocidadeAtual(){
		return this.velocidadeAtual;
	}
	
	public String getMarca(){
		return this.marca;
	}
	
	public String getModelo(){
		return this.modelo;
	}
}
