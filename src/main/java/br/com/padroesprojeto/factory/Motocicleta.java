package br.com.padroesprojeto.factory;

public class Motocicleta implements IVeiculo{
	

	public Motocicleta() {

	}

	@Override
	public void startRouter() {
		System.out.println("Iniciando a roda do Motocicleta");
		getCargo();
		
	}

	@Override
	public void getCargo() {
		System.out.println("Pegando a pagagem na Motocicleta");
		
	}

}
