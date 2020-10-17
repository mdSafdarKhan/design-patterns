package p2_factory;

import p2_factory.car.Car;
import p2_factory.car.CarBuilder;

/**
 * The factory design pattern is used when we have
 * a superclass with multiple sub-classes and based
 * on input, we need to return one of the sub-class. 
 * This pattern takes out the responsibility of the 
 * instantiation of a class from the client program 
 * to the factory class.
 * 
 * @author Safdar.Khan
 *
 */
public class Main {

	public static void main(String[] args) {
		Car car1 = CarBuilder.buildCar("SuperCar");
		Car car2 = CarBuilder.buildCar("SuperCar");
		Car car3 = CarBuilder.buildCar("RegularCar");
		Car car4 = CarBuilder.buildCar("RegularCar");
		
		System.out.println(car1.toString() + ", " + car1.hashCode());
		System.out.println(car2.toString() + ", " + car2.hashCode());
		System.out.println(car3.toString() + ", " + car3.hashCode());
		System.out.println(car4.toString() + ", " + car4.hashCode());
	}

}
