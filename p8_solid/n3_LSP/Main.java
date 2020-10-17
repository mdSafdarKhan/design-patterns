package p8_solid.n3_LSP;

import p8_solid.n3_LSP.impl.RealDuck;
import p8_solid.n3_LSP.impl.ToyDuck;

/**
 * The primary mechanisms behind the OCP are abstraction and polymorphism. In statically 
 * typed languages like C++ and Java, one of the key mechanisms that supports abstraction 
 * and polymorphism is inheritance. It is by using inheritance that we can create derived 
 * classes that implement abstract methods in base classes.
 * 
 * What are the design rules that govern this particular use of inheritance? What are 
 * the characteristics of the best inheritance hierarchies? What are the traps that will 
 * cause us to create hierarchies that do not conform to the OCP? These are the questions 
 * that are addressed by the Liskov Substitution Principle (LSP).
 * 
 * LSP: The Liskov Substitution Principle. The LSP can be paraphrased as follows:
 * SUBTYPES MUST BE SUBSTITUTABLE FOR THEIR BASE TYPES.
 * 
 * The importance of this principle becomes obvious when you consider the consequences 
 * of violating it. Presume that we have a function f that takes, as its argument, a 
 * pointer or reference to some base class B. Presume also that there is some 
 * derivative D of B which, when passed to f in the guise of B, causes f to misbehave. 
 * Then D violates the LSP. Clearly D is Fragile in the presence of f.
 * 
 * The authors of f will be tempted to put in some kind of test for D so that f can behave 
 * properly when a D is passed to it. This test violates the OCP because now f is not 
 * closed to all the various derivatives of B. Such tests are a code smell that are the 
 * result of inexperienced developers (or, what’s worse, developers in a hurry) reacting 
 * to LSP violations.
 * 
 * Conclusion:
 * The OCP is at the heart of many of the claims made for OOD. When this principle is 
 * in effect, applications are more maintainable, reusable, and robust. The LSP is one 
 * of the prime enablers of the OCP. It is the substitutability of subtypes that allows 
 * a module, expressed in terms of a base type, to be extensible without modification. 
 * That substitutability must be something that developers can depend on implicitly. 
 * Thus, the contract of the base type has to be well and prominently understood, if not 
 * explicitly enforced, by the code.
 * 
 * The term “IS-A” is too broad to act as a definition of a subtype. The true definition 
 * of a subtype is “substitutable,” where substitutability is defined by either an 
 * explicit or implicit contract.
 * 
 * @author Safdar.Khan
 *
 */
public class Main {

	public static void main(String[] args) {
		DuckType realDuck = new RealDuck();
		DuckType toyDuck = new ToyDuck();
		
		Duck duck = new Duck();
		duck.makeDuckWork(realDuck);
		//duck.makeDuckWork(toyDuck);	//Violation of LSP.
	}

}
