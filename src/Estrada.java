
public class Estrada {
	
	private String nome;
	
	public Estrada(String nome){
		this.nome = nome;
	}
	
	public void transitar(IAutomovel automovel){
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		automovel.acelerar(10);
		System.out.println("Velocidade atual depois de acelerar: " + automovel.getVelocidadeAtual());
		automovel.frear(10);
		System.out.println("Velocidade atual depois de frear: " + automovel.getVelocidadeAtual());
		System.out.print("\n\n\n");
	}

	public String getNome() {
		return nome;
	}
}
