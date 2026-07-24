package com.Payment;
import com.Order.*;
public class Payment{

	public int pmid = 2468;
	public double pamt = 35097.90;
	public int tid = 247397375;
public void PaymentDetails(){
	System.out.println("The Payments Details Are : ");
	Payment p2= new Payment();
	System.out.println("Payment ID : " + p2.pmid);
	System.out.println("Payment Amount : " + p2.pamt+ "/-");
	System.out.println("Payment Transaction ID : " + p2.tid);	
	Order o1= new Order();
	o1.OrderDetails();


}





}