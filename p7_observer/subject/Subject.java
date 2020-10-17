package p7_observer.subject;

import p7_observer.observer.Observer;

public interface Subject {
	void register(Observer observer);
	void update(Object data);
	void notifyObservers();
	int countObservers();
	void unregister(Observer observer);
}
