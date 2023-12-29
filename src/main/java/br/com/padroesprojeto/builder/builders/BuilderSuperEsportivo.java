package br.com.padroesprojeto.builder.builders;

import br.com.padroesprojeto.builder.carros.CarroSuperSportivo;
import br.com.padroesprojeto.builder.componentes.Cor;
import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public class BuilderSuperEsportivo implements IBulderCarroSuperEsportivo {

	private Motor motor;
	private Integer lugares;
	private Transmissao transmicao;
	private TipoCarro tipoCarro;
	private Cor cor;

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setMotor(Motor motor) {
		this.motor = motor;

	}

	@Override
	public void setLugares(Integer lugares) {
		this.lugares = lugares;

	}

	@Override
	public void setTransmicao(Transmissao transmicao) {
		this.transmicao = transmicao;

	}

	@Override
	public void setTipoCarro(TipoCarro tipoCarro) {
		this.tipoCarro = tipoCarro;

	}

	@Override
	public void setCor(Cor cor) {
		this.cor = cor;

	}
	
	public CarroSuperSportivo getResultados() {
		return new CarroSuperSportivo(cor, tipoCarro, motor, transmicao, lugares);
	}

}
