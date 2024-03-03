package com.sai.ICardPaymentImpl;

import com.sai.IcardInterface.ICardPayment;

public class DebitCardPayment implements ICardPayment {

	public boolean payBill(Double billAmt) {
		// TODO Auto-generated method stub
		
		System.out.println("The Paying bill is using DCP successfully") ;
		
		return true;
	}

}
