package br.com.padroesprojeto.factory;

import br.com.padroesprojeto.factory.transport.AstraticTransport;
import br.com.padroesprojeto.factory.transport.TransportBicicleta;
import br.com.padroesprojeto.factory.transport.TransportCarro;
import br.com.padroesprojeto.factory.transport.TransportMotocileta;

public class FactoryMain {
	
	public static AstraticTransport transporte;
	
	public static String tipoVeiculo = "bici";

	public static void main(String[] args) {
		
		System.out.println("inicio");
		
		switch (tipoVeiculo) {
		case "moto":
			transporte = new TransportMotocileta();
			break;
		case "carro":
			transporte = new TransportCarro();
			break;
		case "bici":
			transporte = new TransportBicicleta();
			break;	

		default:
			System.out.println("Selecione um tipo de entrega");
			break;
		}
		
		transporte.startTransport();
	}

}
