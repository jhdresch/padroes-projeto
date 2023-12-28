package br.com.padroesprojeto.factory;

public class FactoryMain {
	
	public static AstraticTransport transporte;
	
	public static String tipoVeiculo = "carro";

	public static void main(String[] args) {
		
		System.out.println("inicio");
		
		switch (tipoVeiculo) {
		case "moto":
			transporte = new TransportMotocileta();
			break;
		case "carro":
			transporte = new TransportCarro();
			break;

		default:
			System.out.println("Selecione um tipo de entrega");
			break;
		}
		
		transporte.startTransport();
	}

}