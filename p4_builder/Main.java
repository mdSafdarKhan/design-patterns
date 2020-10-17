package p4_builder;

import p4_builder.house.House;
import p4_builder.house.HouseBuilder;

/**
 * Builder is a creational design pattern that lets you construct 
 * complex objects step by step. The pattern allows you to produce 
 * different types and representations of an object using the same 
 * construction code.
 * 
 * The Builder pattern suggests that you extract the object construction 
 * code out of its own class and move it to separate objects called builders.
 * 
 * The builder pattern is a design pattern that allows for the 
 * step-by-step creation of complex objects using the correct 
 * sequence of actions. The construction is controlled by a director
 * object that only needs to know the type of object it is to create.
 * 
 * Builder pattern was introduced to solve some of the problems with
 * Factory and Abstract Factory design patterns when the Object 
 * contains a lot of attributes.
 * 
 * We can solve the issues with large number of parameters by 
 * providing a constructor with required parameters and then different 
 * setter methods to set the optional parameters. The problem with this 
 * approach is that the Object state will be inconsistent until unless 
 * all the attributes are set explicitly.
 * 
 * A builder pattern ensures we create a valid object to work with.
 * Let's use a Person class as an example. If we opt for the no-args 
 * constructor approach it means users of those objects must check the 
 * validity of the object; has the name field been set? Has the DOB 
 * field been set? The list goes on.
 * 
 * Use the Builder pattern to get rid of a “telescopic constructor”.
 * 
	Person(String firstName, String lastName) {
		this(firstName, lastName, null);
	}
	public Person(String firstName, String lastName, String description) {
		this(firstName, lastName, description, 0);
	}
	public Person(String firstName, String lastName, String description, int age) {
		this.firstName = firstName;
	    this.lastName = lastName;
	    this.description = description;
	    this.age = age;
	} 
 *
 * Use the Builder pattern when you want your code to be able to 
 * create different representations of some product 
 * (for example, stone and wooden houses).
 * 
 * It also ensures that an object is immutable. You have to take
 * some extra precautions in your class.
 * 
 * @author Safdar.Khan
 *
 */

public class Main {

	public static void main(String[] args) {
		
		House houseWithBasement = new HouseBuilder()
				.setBasement("Basement")
				.build();
		
		House houseWithBasementAndPool = new HouseBuilder()
				.setBasement("Basement")
				.setPool("Pool")
				.build();
		
		House houseWithBasementAndPoolAndKitchen = new HouseBuilder()
				.setBasement("Basement")
				.setPool("Pool")
				.setKitchen("Kitchen")
				.build();
	
		System.out.println(houseWithBasement);
		System.out.println(houseWithBasementAndPool);
		System.out.println(houseWithBasementAndPoolAndKitchen);
	}

}
