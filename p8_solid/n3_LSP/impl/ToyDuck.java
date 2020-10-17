package p8_solid.n3_LSP.impl;

import p8_solid.n3_LSP.DuckType;

public class ToyDuck implements DuckType{

	@Override
	public void layEgg() {
		throw new RuntimeException("Sorry, I don't lays eggs");
	}

	@Override
	public void makeSound() {
		System.out.println("Quak Tirrrr Quak Tirrrr");
	}

}
