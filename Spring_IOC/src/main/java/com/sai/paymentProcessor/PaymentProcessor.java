package com.sai.paymentProcessor;

import com.sai.IcardInterface.ICardPayment;

public class PaymentProcessor {
	
	private ICardPayment cardPayment;
	
	
	public PaymentProcessor(ICardPayment cardPayment) {
	
		this.cardPayment = cardPayment;
	}

	public void setCardPayment(ICardPayment cardPayment) {
		this.cardPayment = cardPayment;
	}

	public boolean doPayment ( Double Amt) {
	
		  return cardPayment.payBill(Amt);
		
		
		
	
	}
	
}	
