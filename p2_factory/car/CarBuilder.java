package p2_factory.car;

public class CarBuilder {

	public static Car buildCar(String carType) {
		Car car = null;
		switch (carType) {
		case "SuperCar":
			car = new SuperCar("250 KMPL", "10 KM/L", "1500 KG");
			break;
		case "RegularCar":
			car = new RegularCar("150 KMPL", "15 KM/L", "1000 KG");
			break;
		default:
			break;
		}
		return car;
	}
}
