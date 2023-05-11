package com.AOP.aopconcept.service;

public class PaymentServiceImpl implements PaymentService{

	public void makePayment(int amount) {
		System.out.println(amount + "Amount Debited..");
		
		System.out.println(amount + "Amount Credited..");
//		System.out.println("Amount Debited..");
//		
//		System.out.println("Amount Credited..");
	}

	

}
