package br.com.padroesprojeto.factory.transport;

import br.com.padroesprojeto.factory.veiculos.Bicicleta;
import br.com.padroesprojeto.factory.veiculos.IVeiculo;

public class TransportBicicleta extends AstraticTransport{

	@Override
	public IVeiculo criandoVeiculo() {
		IVeiculo veiculo = new Bicicleta();
		return veiculo;
	}

}
