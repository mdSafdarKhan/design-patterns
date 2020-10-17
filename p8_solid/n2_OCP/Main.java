package p8_solid.n2_OCP;

import p8_solid.n2_OCP.impl.Cash;
import p8_solid.n2_OCP.impl.CreditCard;
import p8_solid.n2_OCP.impl.DebitCard;
import p8_solid.n2_OCP.impl.GooglePay;

/**
 * As Ivar Jacobson has said, “All systems change during their life cycles. This must be 
 * born in mind when developing systems are expected to last longer than the first 
 * version. How can we create designs that are stable in the face of change and that 
 * will last longer than the first version? Bertrand Meyer gave us guidance as long ago as 
 * 1988 when he coined the now famous Open–Closed Principle. 
 * 
 * OCP: The Open–Closed Principle: Software entities (classes, modules, functions, etc.) 
 * should be open for extension, but closed for modification.
 * 
 * When a single change to a program results in a cascade of changes to dependent modules, 
 * the design smells of Rigidity. The OCP advises us to refactor the system so that further 
 * changes of that kind will not cause more modifications. If the OCP is applied well, then 
 * further changes of that kind are achieved by adding new code, not by changing old 
 * code that already works.
 * 
 * This may seem like motherhood and apple pie—the golden unachievable ideal—but in fact 
 * there are some relatively simple and effective strategies for approaching that ideal.
 * 
 * Description:
 * Modules that conform to the Open–Closed Principle have two primary attributes. They are
 * 
 * 1. “Open for extension.”
 * This means that the behavior of the module can be extended. As the requirements of the 
 * application change, we are able to extend the module with new behaviors that satisfy 
 * those changes. In other words, we are able to change what the module does.
 * 
 * 2. “Closed for modification.”
 * Extending the behavior of a module does not result in changes to the source or binary 
 * code of the module. The binary executable version of the module, whether in a linkable 
 * library, a DLL, or a Java .jar, remains untouched.
 * 
 * It would seem that these two attributes are at odds with each other. The normal way 
 * to extend the behavior of a module is to make changes to the source code of that module. 
 * A module that cannot be changed is normally thought to have a fixed behavior.
 * 
 * How is it possible that the behaviors of a module can be modified without changing its 
 * source code? How can we change what a module does, without changing the module?
 * 
 * Abstraction Is the Key:
 * In C++, Java, or any other OOPL,3 it is possible to create abstractions that are fixed 
 * and yet represent an unbounded group of possible behaviors. The abstractions are abstract 
 * base classes, and the unbounded group of possible behaviors is represented by all the 
 * possible derivative classes.
 * 
 * It is possible for a module to manipulate an abstraction. Such a module can be closed 
 * for modification since it depends upon an abstraction that is fixed. Yet the behavior 
 * of that module can be extended by creating new derivatives of the abstraction.
 * 
 * Conclusion:
 * In many ways, the OCP is at the heart of object-oriented design. Conformance to this 
 * principle is what yields the greatest benefits claimed for object oriented technology 
 * (i.e., flexibility, reusability, and maintainability). Yet conformance to this principle 
 * is not achieved simply by using an object-oriented programming language. Nor is it a 
 * good idea to apply rampant abstraction to every part of the application. Rather, it 
 * requires a dedication on the part of the developers to apply abstraction only to those 
 * parts of the program that exhibit frequent change. Resisting premature abstraction is 
 * as important as abstraction itself.
 * 
 * @author Safdar.Khan
 *
 */

public class Main {

	public static void main(String[] args) {
		
		PaymentType googlePay = new GooglePay();
		PaymentType creditCard = new CreditCard();
		PaymentType debitCard = new DebitCard();
		PaymentType cash = new Cash();
		//You can add new payment method as many as you want without modifying any code.
		
		Payment payment = new Payment();
		payment.paymentProcesing(googlePay);
		payment.paymentProcesing(creditCard);
		payment.paymentProcesing(debitCard);
		payment.paymentProcesing(cash);
	}

}
