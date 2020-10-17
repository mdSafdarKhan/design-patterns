package p2_factory.car;

public class SuperCar implements Car {

	private String maxSpeed;
	private String mileage;
	private String weight;

	public SuperCar(String maxSpeed, String mileage, String weight) {
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
		this.weight = weight;
	}

	@Override
	public String maxSpeed() {
		return maxSpeed;
	}

	@Override
	public String mileage() {
		return mileage;
	}

	@Override
	public String weight() {
		return weight;
	}

	@Override
	public String toString() {
		return "SuperCar [maxSpeed=" + maxSpeed + ", mileage=" + mileage + ", weight=" + weight + "]";
	}

}
