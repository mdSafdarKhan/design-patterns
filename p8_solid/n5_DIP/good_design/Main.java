package p8_solid.n5_DIP.good_design;

/**
 * Below is the code which supports the Dependency Inversion Principle. In this new 
 * design a new abstraction layer is added through the IWorker Interface. Now the 
 * problems from the above code are solved(considering there is no change in the 
 * high level logic):
 * 
 * a. Manager class doesn't require changes when adding SuperWorkers.
 * b. Minimized risk to affect old functionality present in Manager 
 * class since we don't change it.
 * c. No need to redo the unit testing for Manager class.
 * 
 * @author Safdar.Khan
 *
 */

//Dependency Inversion Principle - Good example
interface IWorker{
	public void work();
}
class Worker implements IWorker{
	@Override
	public void work() {
		System.out.println("Working...");
	}
}
class SuperWorker implements IWorker{
	@Override
	public void work() {
		System.out.println("Working much more...");
	}
}
class Manager{
	IWorker worker;
	public void setWorker(IWorker worker) {
		this.worker = worker;
	}
	public void manage() {
		worker.work();
	}
}

public class Main {

}
