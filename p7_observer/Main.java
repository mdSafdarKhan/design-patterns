package p7_observer;

import p7_observer.observer.ObserverImpl;
import p7_observer.subject.SubjectImpl;

/**
 * Observer is a behavioral design pattern that lets you define a subscription
 * mechanism to notify multiple objects about any events that happen to the
 * object they’re observing.
 * 
 * Problem: Imagine that you have two types of objects: a Customer and a Store.
 * The customer is very interested in a particular brand of product (say, it’s a
 * new model of the iPhone) which should become available in the store very
 * soon.
 * 
 * The customer could visit the store every day and check product availability.
 * But while the product is still en route, most of these trips would be
 * pointless.
 * 
 * On the other hand, the store could send tons of emails (which might be
 * considered spam) to all customers each time a new product becomes available.
 * This would save some customers from endless trips to the store. At the same
 * time, it’d upset other customers who aren’t interested in new products.
 * 
 * It looks like we’ve got a conflict. Either the customer wastes time checking
 * product availability or the store wastes resources notifying the wrong
 * customers.
 * 
 * Solution: The Observer pattern suggests that you add a subscription mechanism
 * to the publisher class so individual objects can subscribe to or unsubscribe
 * from a stream of events coming from that publisher. Fear not! Everything
 * isn’t as complicated as it sounds. In reality, this mechanism consists of 1)
 * an array field for storing a list of references to subscriber objects and 2)
 * several public methods which allow adding subscribers to and removing them
 * from that list.
 * 
 * Observer design pattern is useful when you are interested in the state of an
 * object and want to get notified whenever there is any change. In observer
 * pattern, the object that watch on the state of another object are called
 * Observer and the object that is being watched is called Subject.
 * 
 * According to GoF, observer design pattern intent is; Define a one-to-many
 * dependency between objects so that when one object changes state, all its
 * dependents are notified and updated automatically.
 * 
 * Java provides inbuilt platform for implementing Observer pattern through
 * java.util.Observable class and java.util.Observer interface.
 * 
 * @author Safdar.Khan
 *
 */
public class Main {

	public static void main(String[] args) {
		var subject = new SubjectImpl();

		var observer1 = new ObserverImpl();
		var observer2 = new ObserverImpl();
		var observer3 = new ObserverImpl();

		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);

		System.out.println("Total Observers Are: " + subject.countObservers());

		subject.update("CSK Won By 20 Runs");

		System.out.println("Subject State Has Been Changed");

		subject.notifyObservers();

		System.out.println("All Observers Has Been Notified");

		subject.unregister(observer3);

		System.out.println("One Obsever Has Been Removed From Subject");

		System.out.println("Total Observers Are: " + subject.countObservers());

		subject.update("MI Won By 5 Wickets");

		System.out.println("Subject State Has Been Changed");

		subject.notifyObservers();

		System.out.println("All Observers Has Been Notified");

	}

}
