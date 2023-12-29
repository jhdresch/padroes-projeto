package br.com.padroesprojeto.abstraticfactory.factory;

import br.com.padroesprojeto.abstraticfactory.veiculos.aereos.Aviao;
import br.com.padroesprojeto.abstraticfactory.veiculos.aereos.IVeiculoAereo;
import br.com.padroesprojeto.abstraticfactory.veiculos.terrestres.Carro;
import br.com.padroesprojeto.abstraticfactory.veiculos.terrestres.IVeiculoTerrestre;

public class UberTransport implements ITransportFactory {

	@Override
	public IVeiculoTerrestre criandoTransporteVeiculo() {
		IVeiculoTerrestre veiculo = new Carro();
		return veiculo;
	}

	@Override
	public IVeiculoAereo criandoTransporteAereo() {
		IVeiculoAereo veiculoAereo = new Aviao();
		return veiculoAereo;
	}

}
