package com.codingdojo.zookeeper2;

public class MammalTest {

	public static void main(String[] args) {
		// GORILLA TEST
		System.out.println("------GORILLA------");
		Gorilla gorilla1 = new Gorilla();
		gorilla1.displayEnergy();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.eatBanana();
		gorilla1.eatBanana();
		gorilla1.climb();
		gorilla1.displayEnergy();
		
		System.out.println("------BAT------");
		Bat bat1 = new Bat();
		bat1.displayEnergy();
		bat1.attackTown();
		bat1.fly();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.attackTown();
		bat1.eatHumans();
		bat1.fly();
		bat1.displayEnergy();
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.eatHumans();
		bat1.displayEnergy();
	}
}
