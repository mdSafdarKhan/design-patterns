package p1_singleton.v3_thread_safe_lazy_loading;

public class Main {

	public static void main(String[] args) {
		MyThread m1 = new MyThread();
		MyThread m2 = new MyThread();
		
		new Thread(m1).start();
		new Thread(m2).start();
		
		System.out.println("main done!");
	}

}
