
public class Caminhao extends Automovel{
	
	public Caminhao(int qtdRodas, String marca, String modelo) {
		super(qtdRodas, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int qtdAcelerar) {
		super.acelerar(qtdAcelerar);
		// TODO Auto-generated method stub
		if(this.qtdRodas == 4){
			this.velocidadeAtual += qtdAcelerar;
		}
		else if(this.qtdRodas == 6){
			this.velocidadeAtual += qtdAcelerar * 0.75;
		}
		else {
			this.velocidadeAtual += qtdAcelerar * 0.5;
		}
		
	}

	@Override
	public void frear(int qtdFrear) {
		super.frear(qtdFrear);
		// TODO Auto-generated method stub
		if(this.qtdRodas == 4){
			this.velocidadeAtual -= qtdFrear;
		}
		else if(this.qtdRodas == 6){
			this.velocidadeAtual -= qtdFrear * 0.75;
		}
		else {
			this.velocidadeAtual -= qtdFrear * 0.5;
		}
	}

}
