package p1_singleton.v3_thread_safe_lazy_loading;

public class MyThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Superman : " + Superman.getInstance());
	}

}
