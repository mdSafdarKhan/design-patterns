package p7_observer.subject;

import java.util.ArrayList;
import java.util.List;

import p7_observer.observer.Observer;

public class SubjectImpl implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	private Object data;
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void update(Object data) {
		this.data = data;
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.receive(data);
		}
	}

	@Override
	public int countObservers() {
		return observers.size();
	}

	@Override
	public void unregister(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
		}
	}

}
