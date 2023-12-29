package br.com.padroesprojeto.builder.diretor;

import br.com.padroesprojeto.builder.builders.IBuilder;
import br.com.padroesprojeto.builder.builders.IBulderCarroSuperEsportivo;
import br.com.padroesprojeto.builder.componentes.Cor;
import br.com.padroesprojeto.builder.componentes.Motor;
import br.com.padroesprojeto.builder.componentes.TipoCarro;
import br.com.padroesprojeto.builder.componentes.Transmissao;

public class DirectorBuilder {
	
	
	public void construindoCarroSedan(IBuilder builder) {
		builder.setLugares(5);
		builder.setMotor(new Motor(1600));
		builder.setTransmicao(Transmissao.AUTOMATICA);
		builder.setTipoCarro(TipoCarro.SEDAN);
	}
	
	public void construindoTruck(IBuilder builder) {
		builder.setLugares(2);
		builder.setMotor(new Motor(13600));
		builder.setTransmicao(Transmissao.AUTOMATICO_SEQUENCIAL);
		builder.setTipoCarro(TipoCarro.TRUCK);
	}
	
	public void construindoSuperEsportivo(IBulderCarroSuperEsportivo builder) {
		builder.setLugares(2);
		builder.setMotor(new Motor(13600));
		builder.setTransmicao(Transmissao.AUTOMATICA);
		builder.setTipoCarro(TipoCarro.SPORTCAR);
		builder.setCor(new Cor("vermelho"));
	}

}
