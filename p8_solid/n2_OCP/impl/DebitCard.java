package p8_solid.n2_OCP.impl;

import p8_solid.n2_OCP.PaymentType;

public class DebitCard implements PaymentType{

	@Override
	public void processPayment() {
		System.out.println("Debit card processing logic...");
	}

}
