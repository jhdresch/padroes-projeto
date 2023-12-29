package br.com.padroesprojeto.factory.transport;

import br.com.padroesprojeto.factory.AstraticTransport;
import br.com.padroesprojeto.factory.veiculos.Carro;
import br.com.padroesprojeto.factory.veiculos.IVeiculo;

public class TransportCarro extends AstraticTransport{



	@Override
	public IVeiculo criandoVeiculo() {
		IVeiculo veiculo = new Carro();
		return veiculo;
	}

}
