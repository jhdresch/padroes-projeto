package br.com.padroesprojeto.factory;

import br.com.padroesprojeto.factory.veiculos.IVeiculo;

public abstract class AstraticTransport {
	
	public void startTransport() {
		IVeiculo veiculo = criandoVeiculo();
		veiculo.startRouter();
	};
	
	public  abstract IVeiculo criandoVeiculo();	

}
