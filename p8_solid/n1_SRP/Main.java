package p8_solid.n1_SRP;

/**
 * The Single-Responsibility Principle: A class should have only one reason to change.	
 * This principle was described in the work of Tom DeMarco1 and Meilir Page-Jones. They 
 * called it cohesion. They defined cohesion as the functional relatedness  of the elements 
 * of a module.
 * 
 * What Is a Responsibility?
 * In the context of the SRP, we define a responsibility to be “a reason for change.” 
 * If you can think of more than one motive for changing a class, then that class 
 * has more than one responsibility. This is sometimes hard to see. We are accustomed to 
 * thinking of responsibility in groups.
 * 
 * There is a corollary here. An axis of change is an axis of change only if the changes 
 * actually occur. It is not wise to apply the SRP, or any other principle for that 
 * matter, if there is no symptom.
 * 
 * Conclusion
 * The SRP is one of the simplest of the principles, and one of the hardest to get right. 
 * Conjoining responsibilities is something that we do naturally. Finding and separating 
 * those responsibilities from one another is much of what software design is really about. 
 * Indeed, the rest of the principles we will discuss come back to this issue in one way 
 * or another.
 * 
 * In the given example, we have two classes Person and Account. Both have single 
 * responsibility to store their specific information. If we want to change the state 
 * of Person then we do not need to modify the class Account and vice-versa.
 * 
 * @author Safdar.Khan
 *
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
