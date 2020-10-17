package p8_solid.n4_ISP.good_design;

/**
 * Following it's the code supporting the Interface Segregation Principle. 
 * By splitting the IWorker interface in 2 different interfaces the new 
 * Robot class is no longer forced to implement the eat method. Also if we 
 * need another functionality for the robot like recharging we create another 
 * interface IRechargeble with a method recharge.
 * 
 * @author Safdar.Khan
 *
 */

//interface segregation principle - good example

interface IWorkable{
	public void work();
}

interface IFeedable{
	public void eat();
}

interface IWorker extends IWorkable, IFeedable{
	
}

class Worker implements IWorker{

	@Override
	public void work() {
		//...working
	}

	@Override
	public void eat() {
		//...eating in lunch time
	}
	
}

class SuperWorker implements IWorker{

	@Override
	public void work() {
		//...working much more
	}

	@Override
	public void eat() {
		//...eating in lunch time
	}
	
}

class Robot implements IWorkable{

	@Override
	public void work() {
		//...working infinite
	}
	
}

class Manager{
	
	public IWorkable workable;
	
	public void setWorkable(IWorkable workable) {
		this.workable = workable;
	}
	
	public void manage() {
		workable.work();
	}
}

public class GoodDesign {

}
