package com.sai.main;

import com.sai.ICardPaymentImpl.CreditCardPayment;
import com.sai.ICardPaymentImpl.DebitCardPayment;
import com.sai.paymentProcessor.PaymentProcessor;
import java.util.*;
public class Main {
	
public static void main(String[] args) {
	//PaymentProcessor pp=new PaymentProcessor();
	PaymentProcessor pp=new PaymentProcessor(new DebitCardPayment());
	/*
	 * if it is constuctor injection then we use like PaymentProcessor pp=new
	 * PaymentProcessor(new DebitCardPayment()); 
	 */
	//pp.setCardPayment(new DebitCardPayment());
			  
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Bill here..!");
	Double  billAmt=s.nextDouble();
	System.out.println("Your bill is.." +billAmt);
	Double amount=10000d;
	billAmt=amount-billAmt;  
	boolean paymentSatus=pp.doPayment(billAmt);
	
	if(paymentSatus)
	{
		System.out.println("Payment Processed Sucussefully");
		System.out.println("your remaining balance is " + billAmt);
		
	}else
	{
		System.out.println("Failed Process payment");
	}
}
}
