package br.com.padroesprojeto.abstraticfactory.veiculos.terrestres;

public class Carro implements IVeiculoTerrestre{

	@Override
	public void startRoute() {
		System.out.println("inicio rota carro");
		getCargos();
		
	}

	@Override
	public void getCargos() {
		System.out.println("pegando os passageiros carro");
		
	}

}
