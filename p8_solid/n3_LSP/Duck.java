package p8_solid.n3_LSP;

public class Duck {

	public void makeDuckWork(DuckType duckType) {
		duckType.layEgg();
		duckType.makeSound();
	}
}
