package p1_singleton.v4_destroy_singleton_with_reflection;

import java.lang.reflect.Constructor;

public class Main {

	public static void main(String[] args) {
		Superman s1 = Superman.getInstance();
		Superman s2 = null;
		try {
			Constructor[] constructors = Superman.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				s2 = (Superman) constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
