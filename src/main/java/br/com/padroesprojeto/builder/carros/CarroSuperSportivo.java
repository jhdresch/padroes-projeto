package br.com.padroesprojeto.builder.carros;

import br.com.padroesprojeto.builder.componentes.Cor;
import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public class CarroSuperSportivo {

	private Cor cor;
	private TipoCarro tipo;
	private Motor motor;
	private Transmissao transmissao;
	private int assentos;

	public CarroSuperSportivo(Cor cor, TipoCarro tipo, Motor motor, Transmissao transmissao, int assentos) {
		super();
		this.cor = cor;
		this.tipo = tipo;
		this.motor = motor;
		this.transmissao = transmissao;
		this.assentos = assentos;
	}

	public Cor getCor() {
		return cor;
	}

	public TipoCarro getTipo() {
		return tipo;
	}

	public Motor getMotor() {
		return motor;
	}

	public Transmissao getTransmissao() {
		return transmissao;
	}

	public int getAssentos() {
		return assentos;
	}

	@Override
	public String toString() {
		return "CarroSuperSportivo [cor=" + cor.getCor() + ", tipo=" + tipo + ", motor=" + motor + ", transmissao=" + transmissao
				+ ", assentos=" + assentos + "]";
	}
	

	
	

}
