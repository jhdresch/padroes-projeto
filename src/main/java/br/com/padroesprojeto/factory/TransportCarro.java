package br.com.padroesprojeto.factory;

public class TransportCarro extends AstraticTransport{



	@Override
	public IVeiculo criandoVeiculo() {
		IVeiculo veiculo = new Carro();
		return veiculo;
	}

}
