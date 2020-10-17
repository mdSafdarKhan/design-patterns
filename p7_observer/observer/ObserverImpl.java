package p7_observer.observer;

public class ObserverImpl implements Observer{

	@Override
	public void receive(Object data) {
		System.out.println(this.hashCode() + " received data: " + data);
	}

}
