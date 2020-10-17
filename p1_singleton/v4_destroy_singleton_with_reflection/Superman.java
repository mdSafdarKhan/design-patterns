package p1_singleton.v4_destroy_singleton_with_reflection;

/**
 * Reflection can be used to destroy all 
 * the above singleton implementation approaches.
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
