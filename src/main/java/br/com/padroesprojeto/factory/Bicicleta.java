package br.com.padroesprojeto.factory;

public class Bicicleta implements IVeiculo{

	@Override
	public void startRouter() {
		System.out.println("iniciando rota da biclicleta");
		getCargo();
		
	}

	@Override
	public void getCargo() {
		System.out.println("pegamos o delivery");
		
	}

}
