package p1_singleton.v1_eager_initialization;

/**
 * In eager initialization, the instance of Singleton Class 
 * is created at the time of class loading, this is the 
 * easiest method to create a singleton class but it has
 * a drawback that instance is created even though client 
 * application might not be using it.
 * 
 * @author Safdar.Khan
 */

public class Superman {
	
	public static Superman INSTANCE = getInstance();
	
	private Superman() {}
	
	private static Superman getInstance() {
		return new Superman();
	}

}
