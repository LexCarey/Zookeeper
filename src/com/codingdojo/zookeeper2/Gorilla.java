package com.codingdojo.zookeeper2;

public class Gorilla extends Mammal {
	
	
	//CONSTRUCTORS
	public Gorilla() {
		super();
	}
	
	public Gorilla(int energy) {
		super(energy);
	}
	
	//METHODS
	public void throwSomething() {
		System.out.println("The gorilla threw something!");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void eatBanana() {
		System.out.println("The gorilla ate a banana!");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("The gorilla climbed up a tree.");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}


