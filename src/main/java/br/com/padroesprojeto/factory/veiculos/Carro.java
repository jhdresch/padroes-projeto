package br.com.padroesprojeto.factory.veiculos;

public class Carro implements IVeiculo{


	public Carro() {

	}
	
	@Override
	public void startRouter() {
		System.out.println("Iniciando a roda do Carro");
		getCargo();
		
	}

	@Override
	public void getCargo() {
		System.out.println("Pegando os Passageiros do carro");
		
	}

}
