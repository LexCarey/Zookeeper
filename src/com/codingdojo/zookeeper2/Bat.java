package com.codingdojo.zookeeper2;

public class Bat extends Mammal {
	
	//CONSTRUCTORS
	public Bat() {
		super(300);
	}
	
	public Bat(int energy) {
		super(energy);
	}
	
	//METHODS
	public void fly() {
		System.out.println("FWOOOOOSH");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("CHOMP");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("*fire crackling* AHHHHHHHHH");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}

