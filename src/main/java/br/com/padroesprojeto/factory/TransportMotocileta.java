package br.com.padroesprojeto.factory;

public class TransportMotocileta extends AstraticTransport{


	@Override
	public IVeiculo criandoVeiculo() {
		IVeiculo veiculo = new Motocicleta();
		return veiculo;
	}

}
