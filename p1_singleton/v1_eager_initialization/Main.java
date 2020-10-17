package p1_singleton.v1_eager_initialization;

public class Main {

	public static void main(String[] args) {
		Superman s1 = Superman.INSTANCE;
		Superman s2 = Superman.INSTANCE;
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
