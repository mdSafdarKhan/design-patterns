package p8_solid.n5_DIP.bad_design;
/**
 * DIP: The Dependency-Inversion Principle:
 * a. High-level modules should not depend on low-level modules. Both should depend 
 * on abstractions.
 * b. Abstractions should not depend on details. Details should depend on abstractions.
 * 
 * Over the years, many have questioned why I use the word “inversion” in the name of 
 * this principle. It is because more traditional software development methods, such as 
 * Structured Analysis and Design, tend to create software structures in which high-level 
 * modules depend on low-level modules, and in which policy depends on detail. Indeed one 
 * of the goals of these methods is to define the subprogram hierarchy that describes how 
 * the high-level modules make calls to the low-level modules.
 * 
 * Consider the implications of high-level modules that depend on low-level modules. 
 * It is the high-level modules that contain the important policy decisions and business 
 * models of an application. These modules contain the identity of the application. Yet, 
 * when these modules depend on the lower level modules, changes to the lower level 
 * modules can have direct effects on the higher level modules and can force them to 
 * change in turn.
 * 
 * This predicament is absurd! It is the high-level, policy-setting modules that ought to 
 * be influencing the lowlevel, detailed modules. The modules that contain the high-level 
 * business rules should take precedence over, and be independent of, the modules that 
 * contain the implementation details. High-level modules simply should not depend on 
 * low-level modules in any way.
 * 
 * Moreover, it is high-level, policy-setting modules that we want to be able to reuse. 
 * We are already quite good at reusing low-level modules in the form of subroutine libraries. 
 * When high-level modules depend on low-level modules, it becomes very difficult to reuse 
 * those high-level modules in different contexts. However, when the high-level modules 
 * are independent of the low-level modules, then the high-level modules can be reused 
 * quite simply. This principle is at the very heart of framework design.
 * 
 * Layering:
 * According to Booch, “...all well-structured object-oriented architectures have clearly 
 * defined layers, with each layer providing some coherent set of services though a 
 * well-defined and controlled interface.”
 * 
 * An Inversion of Ownership:
 * Notice that the inversion here is not just one of dependencies, it is also one of 
 * interface ownership. We often think of utility libraries as owning their own interfaces. 
 * But when the DIP is applied, we find that the clients tend to own the abstract interfaces 
 * and that their servers derive from them.
 * 
 * This is sometimes known as the Hollywood principle: “Don’t call us, we’ll call you. 
 * The lower-level modules provide the implementation for interfaces that are declared 
 * within, and called by, the upper-level modules.
 * 
 * Depend On Abstractions:
 * A somewhat more naive, yet still very powerful, interpretation of the DIP is the simple 
 * heuristic: “Depend on abstractions.” Simply stated, this heuristic recommends that you 
 * should not depend on a concrete class—that all relationships in a program should 
 * terminate on an abstract class or an interface. 
 * 
 * According to this heuristic,
 * • No variable should hold a pointer or reference to a concrete class.
 * • No class should derive from a concrete class.
 * • No method should override an implemented method of any of its base classes.
 * 
 * Certainly this heuristic is usually violated at least once in every program. 
 * Somebody has to create the instances of the concrete classes, and whatever module 
 * does that will depend on them.3 Moreover, there seems no reason to follow this heuristic 
 * for classes that are concrete but nonvolatile. If a concrete class is not going to 
 * change very much, and no other similar derivatives are going to be created, then 
 * it does very little harm to depend on it.
 * 
 * For example, in most systems the class that describes a string is concrete. In Java, 
 * for example, it is the concrete class String. This class is not volatile. That is, it 
 * does not change very often. Therefore it does no harm to depend directly on it.
 * 
 * However, most concrete classes that we write as part of an application program 
 * are volatile. It is those concrete classes that we do not want to depend directly on. 
 * Their volatility can be isolated by keeping them behind an abstract interface.
 * 
 * Conclusion:
 * Traditional procedural programming creates a dependency structure in which policy 
 * depends on detail. This is unfortunate since the policies are then vulnerable to 
 * changes in the details. Object-oriented programming inverts that dependency 
 * structure such that both details and policies depend on abstraction, and service 
 * interfaces are often owned by their clients.
 * 
 * Indeed, it is this inversion of dependencies that is the hallmark of good 
 * object-oriented design. It doesn’t matter what language a program is written in. 
 * If its dependencies are inverted, it has an OO design. If its dependencies are 
 * not inverted, it has a procedural design.
 * 
 * The principle of dependency inversion is the fundamental low-level mechanism 
 * behind many of the benefits claimed for object-oriented technology. Its proper 
 * application is necessary for the creation of reusable frameworks.
 * 
 * It is also critically important for the construction of code that is resilient 
 * to change. Since the abstractions and details are all isolated from each other, 
 * the code is much easier to maintain.
 * 
 * Example:
 * Below is an example which violates the Dependency Inversion Principle. 
 * We have the manager class which is a high level class, and the low level class 
 * called Worker. We need to add a new module to our application to model the 
 * changes in the company structure determined by the employment of new specialized 
 * workers. We created a new class SuperWorker for this.
 * 
 * Let's assume the Manager class is quite complex, containing very complex logic. 
 * And now we have to change it in order to introduce the new SuperWorker. Let's see 
 * the disadvantages:
 * a. we have to change the Manager class (remember it is a complex one and this will 
 * involve time and effort to make the changes).
 * b. some of the current functionality from the manager class might be affected.
 * c. the unit testing should be redone.
 * 
 * All those problems could take a lot of time to be solved and they might induce 
 * new errors in the old functionlity. The situation would be different if the 
 * application had been designed following the Dependency Inversion Principle. 
 * It means we design the manager class, an IWorker interface and the Worker class 
 * implementing the IWorker interface. When we need to add the SuperWorker class 
 * all we have to do is implement the IWorker interface for it. No additional 
 * changes in the existing classes.
 * 
 * @author Safdar.Khan
 *
 */

//Dependency Inversion Principle - Bad example
class Worker{
	public void work() {
		System.out.println("working...");
	}
}
class Manager{
	Worker worker;
	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	public void manage() {
		worker.work();
	}
}
class SuperWorker{
	public void work() {
		System.out.println("working much more...");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
