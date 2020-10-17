package p8_solid.n2_OCP.impl;

import p8_solid.n2_OCP.PaymentType;

public class GooglePay implements PaymentType{

	@Override
	public void processPayment() {
		System.out.println("Google pay processing logic...");
	}

}
