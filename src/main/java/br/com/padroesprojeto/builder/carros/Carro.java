package br.com.padroesprojeto.builder.carros;

import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public class Carro {

	private TipoCarro tipo;
	private Motor motor;
	private Transmissao transmissao;
	private int assentos;

	public Carro(TipoCarro tipo, Motor motor, Transmissao transmissao, int assentos) {

		this.tipo = tipo;
		this.motor = motor;
		this.transmissao = transmissao;
		this.assentos = assentos;
	}

	public TipoCarro getTipo() {
		return tipo;
	}

	public int getMotor() {
		return motor.getPower();
	}

	public Transmissao getTransmicao() {
		return transmissao;
	}

	public int getAssentos() {
		return assentos;
	}

	@Override
	public String toString() {
		return "Carro [tipo=" + tipo + ", motor=" + motor + ", transmissao=" + transmissao + ", assentos=" + assentos
				+ "]";
	}
	
	

}
