package br.com.padroesprojeto.abstraticfactory.veiculos.terrestres;

public class Motocicleta implements IVeiculoTerrestre{

	@Override
	public void startRoute() {
		System.out.println("inicio rota moto");
		getCargos();
		
	}

	@Override
	public void getCargos() {
		System.out.println("pegando carga moto");
		
	}

}
