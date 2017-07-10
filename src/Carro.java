
public class Carro extends Automovel {

	public Carro(int qtdRodas, String marca, String modelo) {
		super(qtdRodas, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int qtdAcelerar) {
		super.acelerar(qtdAcelerar);
		this.velocidadeAtual += qtdAcelerar;
	}

	@Override
	public void frear(int qtdFrear) {
		super.frear(qtdFrear);
		this.velocidadeAtual -= qtdFrear;
	}

}
