package p1_singleton.v2_thread_safe;

/**
 * The easier way to create a thread-safe singleton
 * class is to make the global access method 
 * synchronized, so that only one thread can execute
 * this method at a time. 
 * 
 * Below implementation works fine and provides 
 * thread-safety but it reduces the performance 
 * because of the cost associated with the 
 * synchronized method, although we need it only 
 * for the first few threads who might create 
 * the separate instances.
 * 
 * @author Safdar.Khan
 */

public class Superman {
	
	private static Superman INSTANCE = null;
	
	private Superman() {}
	
	public static synchronized Superman getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Superman();
			return INSTANCE;
		}
		return INSTANCE;
	}

}
