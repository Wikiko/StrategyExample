
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estrada estrada = new Estrada("Bandeirantes");
		IAutomovel carro = new Carro(4, "Ford", "Fusion");
		IAutomovel caminhaoSeisRodas = new Caminhao(6, "Scania", "G420");
		IAutomovel caminhaoOitoRodas = new Caminhao(8, "Volvo", "XL10");
		IAutomovel motoDaora = new Motocicleta(0, "Kawasaki", "Ninja"); 
		
		//Colocamos o carro fusion lindo para andar na estrada e depois parar.
		
		estrada.transitar(carro);
		
		//Colocamos o caminhaoOitoRodas Scania lindo para andar na estrada e depois parar.
		
		estrada.transitar(caminhaoOitoRodas);
		
		//Colocamos o caminhaoSeisRodas Volvo lindo para andar na estrada e depois parar.
		
		estrada.transitar(caminhaoSeisRodas);
		
		//Colocamos a MotoDaora Kawasaki lindo para andar na estrada e depois parar.
		
		estrada.transitar(motoDaora);
		
	}

}
