package br.com.padroesprojeto.abstraticfactory.factory;

import br.com.padroesprojeto.abstraticfactory.veiculos.aereos.IVeiculoAereo;
import br.com.padroesprojeto.abstraticfactory.veiculos.terrestres.IVeiculoTerrestre;

public interface ITransportFactory {
	
	public IVeiculoTerrestre criandoTransporteVeiculo();

	public IVeiculoAereo criandoTransporteAereo();
}
