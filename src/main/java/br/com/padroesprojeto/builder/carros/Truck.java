package br.com.padroesprojeto.builder.carros;

import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public class Truck {
	
	private TipoCarro tipo;
	private Motor motor;
	private Transmissao transmissao;
	private int assentos;

	public Truck(TipoCarro tipo, Motor motor, Transmissao transmissao, int assentos) {

		this.tipo = tipo;
		this.motor = motor;
		this.transmissao = transmissao;
		this.assentos = assentos;
	}
	
	public String getResultado() {
		return "Truck transmissao = "+ this.transmissao + "\n"+ "Truck motor = "+motor.getPower();
	}

}
