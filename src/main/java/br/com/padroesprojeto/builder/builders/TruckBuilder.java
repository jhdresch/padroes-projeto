package br.com.padroesprojeto.builder.builders;

import br.com.padroesprojeto.builder.carros.Truck;
import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public class TruckBuilder implements IBuilder{

	private Motor motor;
	private Integer lugares;
	private Transmissao transmicao;
	private TipoCarro tipoCarro;

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

	public Truck getResultado() {
		return new Truck(tipoCarro, motor, transmicao, lugares);
	}

}
