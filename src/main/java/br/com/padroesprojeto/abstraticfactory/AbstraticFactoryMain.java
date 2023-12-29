package br.com.padroesprojeto.abstraticfactory;

import br.com.padroesprojeto.abstraticfactory.app.Aplicacao;
import br.com.padroesprojeto.abstraticfactory.factory.ITransportFactory;
import br.com.padroesprojeto.abstraticfactory.factory.NoveNoveTransport;
import br.com.padroesprojeto.abstraticfactory.factory.UberTransport;

public class AbstraticFactoryMain {

	public static Aplicacao config(String compania) throws Exception {
		
	
		ITransportFactory factory;
		
		
		if(compania.contains("uber")) {
			factory = new UberTransport();
			
		}else if(compania.contains("99")) {
			factory = new NoveNoveTransport();
		}else {
			throw new Exception("Não localizado compania");
		}
	
		
		return new Aplicacao(factory);
		
	};

	public static void main(String[] args) throws Exception {
		Aplicacao app = config("99");
		app.startRouter();

	}

}
