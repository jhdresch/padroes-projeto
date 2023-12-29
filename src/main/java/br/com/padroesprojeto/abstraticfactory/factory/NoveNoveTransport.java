package br.com.padroesprojeto.abstraticfactory.factory;

import br.com.padroesprojeto.abstraticfactory.veiculos.aereos.Helicoptero;
import br.com.padroesprojeto.abstraticfactory.veiculos.aereos.IVeiculoAereo;
import br.com.padroesprojeto.abstraticfactory.veiculos.terrestres.IVeiculoTerrestre;
import br.com.padroesprojeto.abstraticfactory.veiculos.terrestres.Motocicleta;

public class NoveNoveTransport implements ITransportFactory{

	@Override
	public IVeiculoTerrestre criandoTransporteVeiculo() {
		IVeiculoTerrestre veiculo = new Motocicleta();
		return veiculo;
	}

	@Override
	public IVeiculoAereo criandoTransporteAereo() {
		IVeiculoAereo aereo = new Helicoptero();
		return aereo;
	}

}
