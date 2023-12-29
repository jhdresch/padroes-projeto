package br.com.padroesprojeto.builder;

import br.com.padroesprojeto.builder.builders.BuilderCarro;
import br.com.padroesprojeto.builder.builders.TruckBuilder;
import br.com.padroesprojeto.builder.carros.Carro;
import br.com.padroesprojeto.builder.carros.Truck;
import br.com.padroesprojeto.builder.diretor.DirectorBuilder;

public class BuilderMain {

	public static void main(String[] args) {
		DirectorBuilder diretor = new DirectorBuilder();
		
		BuilderCarro builderCarro = new BuilderCarro();
		
		diretor.construindoCarroSedan(builderCarro);
		
		Carro carro = builderCarro.getResultado();
		
		System.out.println(carro);
		
		
		TruckBuilder builderTruck = new TruckBuilder();
		
		diretor.construindoTruck(builderTruck);
		
		Truck truck = builderTruck.getResultado();
		
		System.out.println(truck.getResultado());
	}

}
