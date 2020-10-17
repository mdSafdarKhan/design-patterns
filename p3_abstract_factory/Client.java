package p3_abstract_factory;

import p3_abstract_factory.enums.FactoryType;
import p3_abstract_factory.enums.ShapeType;
import p3_abstract_factory.shapefactory.AbstractFactory;
import p3_abstract_factory.shapefactory.FactoryProvider;

/**
 * Provide an interface for creating families of related or dependent 
 * objects without specifying their concrete classes.
 * 
 * If you are familiar with factory design 
 * pattern in java, you will notice that we 
 * have a single Factory class. This factory 
 * class returns different subclasses based 
 * on the input provided and factory class 
 * uses if-else or switch statement to achieve this.
 * 
 * In the Abstract Factory pattern, we get rid 
 * of if-else block and have a factory class 
 * for each sub-class. Then an Abstract Factory 
 * class that will return the sub-class based on 
 * the input factory class. At first, it seems 
 * confusing but once you see the implementation, 
 * it’s really easy to grasp and understand the 
 * minor difference between Factory and Abstract 
 * Factory pattern.
 * 
 * The first thing the Abstract Factory pattern suggests is to explicitly
 * declare interfaces for each distinct product of the product family 
 * (e.g., chair, sofa or coffee table). Then you can make all variants 
 * of products follow those interfaces. For example, all chair variants 
 * can implement the Chair interface; all coffee table variants can 
 * implement the CoffeeTable interface, and so on.
 *  
 * @author Safdar.Khan
 *
 */
public class Client {

	public static void main(String[] args) {
		AbstractFactory twoDFactory = FactoryProvider.getFactory(FactoryType.TWO_D_FACTORY);
		var line = twoDFactory.getShape(ShapeType.LINE);
		var circle = twoDFactory.getShape(ShapeType.CIRCLE);
		var sphere = twoDFactory.getShape(ShapeType.SPHERE);
		
		AbstractFactory threeDFactory = FactoryProvider.getFactory(FactoryType.THREE_D_FACTORY);
		var line2 = threeDFactory.getShape(ShapeType.LINE);
		var circle2 = threeDFactory.getShape(ShapeType.CIRCLE);
		var sphere2 = threeDFactory.getShape(ShapeType.SPHERE);
		
		line.draw();
		circle.draw();
		//sphere.draw();
		
		//line2.draw();
		//circle2.draw();
		sphere2.draw();
	}

}
