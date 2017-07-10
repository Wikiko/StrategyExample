
public class Motocicleta extends Automovel {

	private int cilindradas;
	
	public Motocicleta(int qtdRodas, String marca, String modelo) {
		super(qtdRodas, marca, modelo);
		this.cilindradas = 90;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar(int qtdAcelerar) {
		super.acelerar(qtdAcelerar);
		// TODO Auto-generated method stub
		if(this.cilindradas <= 100){
			this.velocidadeAtual += qtdAcelerar - 5;
		}
		else {
			this.velocidadeAtual += qtdAcelerar + 8;
		}
	}

	@Override
	public void frear(int qtdFrear) {
		super.frear(qtdFrear);
		// TODO Auto-generated method stub
		if(this.cilindradas <= 100){
			this.velocidadeAtual -= qtdFrear - 5;
		}
		else {
			this.velocidadeAtual -= qtdFrear + 8;
		}
	}
	
	public void setCilindradas(int cilindradas){
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas(){
		return this.cilindradas;
	}

}
