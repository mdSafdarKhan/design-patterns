package p8_solid.n2_OCP.impl;

import p8_solid.n2_OCP.PaymentType;

public class Cash implements PaymentType{

	@Override
	public void processPayment() {
		System.out.println("Cash processing logic...");
	}

}
