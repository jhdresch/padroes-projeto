package br.com.padroesprojeto.abstraticfactory.veiculos.aereos;

public class Helicoptero implements IVeiculoAereo{

	@Override
	public void startRoute() {
		
		System.out.println("inicio da rota do Helicoptero");
		getCargos();
		ventos();
	}

	@Override
	public void getCargos() {
		System.out.println("pegando os passageiros do Helicoptero");
		
	}

	@Override
	public void ventos() {
		System.out.println("otimo tempo para fazer um voo de Helicoptero");
		
	}

	

}
