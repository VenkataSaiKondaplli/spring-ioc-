package com.sai.ICardPaymentImpl;

import com.sai.IcardInterface.ICardPayment;

public class CreditCardPayment implements ICardPayment {

	public boolean payBill(Double billAmt) {
		System.out.println("paying Bill is Using CCD " +billAmt);
		
		return true;
	}

}
