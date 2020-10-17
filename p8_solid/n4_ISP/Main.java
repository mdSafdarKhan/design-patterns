package p8_solid.n4_ISP;

/**
 * ISP: The Interface-Segregation Principle
 * This principle deals with the disadvantages of “fat” interfaces. Classes that 
 * have “fat” interfaces are classes whose interfaces are not cohesive. In other 
 * words, the interfaces of the class can be broken up into groups of methods. 
 * Each group serves a different set of clients. Thus, some clients use one group 
 * of member functions, and other clients use the other groups.
 * 
 * The ISP acknowledges that there are objects that require noncohesive interfaces; 
 * however, it suggests that clients should not know about them as a single class. 
 * Instead, clients should know about abstract base classes that have cohesive interfaces.
 * 
 * ISP: The Interface-Segregation Principle
 * Clients should not be forced to depend on methods that they do not use.
 * 
 * When clients are forced to depend on methods that they don’t use, then those 
 * clients are subject to changes to those methods. This results in an inadvertent 
 * coupling between all the clients. Said another way, when a client depends on a 
 * class that contains methods that the client does not use, but that other clients 
 * do use, then that client will be affected by the changes that those other clients 
 * force upon the class. We would like to avoid such couplings where possible, 
 * and so we want to separate the interfaces.
 * 
 * Conclusion:
 * Fat classes cause bizarre and harmful couplings between their clients. 
 * When one client forces a change on the fat class, all the other clients are 
 * affected. Thus, clients should only have to depend on methods that they actually call. 
 * This can be achieved by breaking the interface of the fat class into many 
 * client-specific interfaces. Each client-specific interface declares only those 
 * functions that its particular client, or client group, invoke. The fat class 
 * can then inherit all the client-specific interfaces and implement them. This 
 * breaks the dependence of the clients on methods that they don’t invoke, and it 
 * allows the clients to be independent of each other.
 * 
 * @author Safdar.Khan
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
