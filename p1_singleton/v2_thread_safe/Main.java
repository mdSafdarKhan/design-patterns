package p1_singleton.v2_thread_safe;

public class Main {

	public static void main(String[] args) {
		Superman s1 = Superman.getInstance();
		Superman s2 = Superman.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
