package br.com.padroesprojeto.factory.transport;

import br.com.padroesprojeto.factory.AstraticTransport;
import br.com.padroesprojeto.factory.veiculos.IVeiculo;
import br.com.padroesprojeto.factory.veiculos.Motocicleta;

public class TransportMotocileta extends AstraticTransport{


	@Override
	public IVeiculo criandoVeiculo() {
		IVeiculo veiculo = new Motocicleta();
		return veiculo;
	}

}
