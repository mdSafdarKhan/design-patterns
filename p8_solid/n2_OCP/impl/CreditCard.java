package p8_solid.n2_OCP.impl;

import p8_solid.n2_OCP.PaymentType;

public class CreditCard implements PaymentType{

	@Override
	public void processPayment() {
		System.out.println("Credit card processing logic...");
	}

}
