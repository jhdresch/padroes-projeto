package br.com.padroesprojeto.builder.componentes;

public class Motor {
	
	private int power;
	
	public Motor(int power) {
		super();
		this.power = power;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return ""+power;
	}
	
	

}
