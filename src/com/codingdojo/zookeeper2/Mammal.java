package com.codingdojo.zookeeper2;

public class Mammal {
	//MEMORY VARIABLES
	private int energyLevel = 100;
	
	//CONSTRUCTORS
	public Mammal() {
	}
	
	public Mammal(int energy) {
		this.energyLevel = energy;
	}
	
	
	//METHOD
	public int displayEnergy() {
		System.out.println("Current Energy: " + this.getEnergyLevel());
		return this.getEnergyLevel();
	}


	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}

