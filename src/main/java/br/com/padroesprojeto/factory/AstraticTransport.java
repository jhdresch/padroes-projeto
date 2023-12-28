package br.com.padroesprojeto.factory;

public abstract class AstraticTransport {
	
	public void startTransport() {
		IVeiculo veiculo = criandoVeiculo();
		veiculo.startRouter();
	};
	
	public  abstract IVeiculo criandoVeiculo();	

}
