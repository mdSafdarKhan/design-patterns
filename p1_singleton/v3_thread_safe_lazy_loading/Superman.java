package p1_singleton.v3_thread_safe_lazy_loading;

/**
 * In this approach, the synchronized block is 
 * used inside the if condition with an additional 
 * check to ensure that only one instance of a 
 * singleton class is created.
 * 
 * There is no synchronized block on method. So
 * no thread requires lock at this point. The if
 * INSATNCE has been loaded then no need to initialize.
 * It is for lazy loading. If instance has not been
 * initialized then t1 will acquire lock and initializes
 * the INSTANCE. Then if t2 gets chance it acquire locks
 * and try to do lazy loading through second null check.
 * Since INSTANCE has been initialized through t1, then
 * t2 will not initialize it even it acquires lock.
 * 
 * volatile keyword is used because to make sure there
 * is no visibility issue. Suppose t1 initializes INSTNACE
 * then t2 should see the updated value of INSTANCE whenever
 * it get chance before initialization.
 * 
 * Make sure to set default constructor private.
 * 
 * @author Safdar.Khan
 */

public class Superman {
	
	private static volatile Superman INSTANCE = null;
	
	private Superman() {
		//Just to give chance to other thread.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static Superman getInstance() {
		if(INSTANCE == null) {
			synchronized (Superman.class) {
				System.out.println(Thread.currentThread().getName() + " gets chance to initialize Superman.");
				if(INSTANCE == null) {
					System.out.println(Thread.currentThread().getName() + " is about to initialize Superman.");
					INSTANCE = new Superman();
					System.out.println(Thread.currentThread().getName() + " initialized Superman.");
					return INSTANCE;
				}
			}
		}
		return INSTANCE;
	}

}
