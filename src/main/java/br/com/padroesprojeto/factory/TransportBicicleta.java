package br.com.padroesprojeto.factory;

public class TransportBicicleta extends AstraticTransport{

	@Override
	public IVeiculo criandoVeiculo() {
		IVeiculo veiculo = new Bicicleta();
		return veiculo;
	}

}
