package p8_solid.n3_LSP.impl;

import p8_solid.n3_LSP.DuckType;

public class RealDuck implements DuckType{

	@Override
	public void layEgg() {
		System.out.println("Egg laying");
	}

	@Override
	public void makeSound() {
		System.out.println("Quak Quak");
	}

}
