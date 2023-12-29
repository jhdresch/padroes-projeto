package br.com.padroesprojeto.abstraticfactory.veiculos.aereos;

public class Aviao implements IVeiculoAereo{

	@Override
	public void startRoute() {
		
		System.out.println("inicio da rota do aviao");
		getCargos();
		ventos();
	}

	@Override
	public void getCargos() {
		System.out.println("pegando os passageiros do aviao");
		
	}

	@Override
	public void ventos() {
		System.out.println("otimo tempo para fazer um voo");
		
	}

}
