package p6_prototype;

import p6_prototype.tree.PlasticTree;

/**
 * Prototype is a creational design pattern that lets you copy existing objects without 
 * making your code dependent on their classes.
 * 
 * Problem: Say you have an object, and you want to create an exact copy of it. 
 * How would you do it? First, you have to create a new object of the same class. 
 * Then you have to go through all the fields of the original object and copy their 
 * values over to the new object.
 * 
 * Nice! But there’s a catch. Not all objects can be copied that way because some of 
 * the object’s fields may be private and not visible from outside of the object itself.
 * 
 * Solution: The Prototype pattern delegates the cloning process to the actual objects 
 * that are being cloned. The pattern declares a common interface for all objects that 
 * support cloning. This interface lets you clone an object without coupling your code 
 * to the class of that object. Usually, such an interface contains just a single 
 * clone method.
 * 
 * The implementation of the clone method is very similar in all classes. The method 
 * creates an object of the current class and carries over all of the field values of 
 * the old object into the new one. You can even copy private fields because most 
 * programming languages let objects access private fields of other objects that 
 * belong to the same class.
 * 
 * Prototype design pattern is used when the Object creation is a costly affair and 
 * requires a lot of time and resources and you have a similar object already existing.
 * 
 * Prototype pattern provides a mechanism to copy the original object to a new object 
 * and then modify it according to our needs. Prototype design pattern uses java 
 * cloning to copy the object.
 * 
 * Prototype design pattern mandates that the Object which you are copying should 
 * provide the copying feature. It should not be done by any other class. However 
 * whether to use shallow or deep copy of the Object properties depends on the 
 * requirements and its a design decision.
 * 
 * Let's use an analogy to better understand this pattern.
 * In some games, we want trees or buildings in the background. We may realize that 
 * we don't have to create new trees or buildings and render them on the screen every 
 * time the character moves.
 * 
 * So, we create an instance of the tree first. Then we can create as many trees as 
 * we want from this instance (prototype) and update their positions. We may also 
 * choose to change the color of the trees for a new level in the game.
 * 
 * @author Safdar.Khan
 *
 */
public class Main {

	public static void main(String[] args) {
		PlasticTree tree1 = new PlasticTree("Green", 20.50);
		PlasticTree tree2 = (PlasticTree) tree1.clone();
		
		System.out.println(tree1 + ", " + tree1.hashCode());
		System.out.println(tree2 + ", " + tree2.hashCode());
	}

}
