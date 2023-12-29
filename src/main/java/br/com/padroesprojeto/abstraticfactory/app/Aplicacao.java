package br.com.padroesprojeto.abstraticfactory.app;

import br.com.padroesprojeto.abstraticfactory.factory.ITransportFactory;
import br.com.padroesprojeto.abstraticfactory.veiculos.aereos.IVeiculoAereo;
import br.com.padroesprojeto.abstraticfactory.veiculos.terrestres.IVeiculoTerrestre;

public class Aplicacao {

	private IVeiculoAereo aereo;

	private IVeiculoTerrestre terrestre;

	public Aplicacao(ITransportFactory factory) {
		
		aereo = factory.criandoTransporteAereo();
		terrestre = factory.criandoTransporteVeiculo();

	}
	
	public void startRouter() {
		aereo.startRoute();
		terrestre.startRoute();
	}

}
