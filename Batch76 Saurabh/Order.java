package com.Order;
import com.Product2.*;
public class Order{

	public int oid = 2468;
	public double Oprice = 35097.90;
public void OrderDetails(){
	System.out.println("The Order Details Are : ");
	Order o = new Order();
	System.out.println("Order ID : " + o.oid);
	System.out.println("Order Amount : " + o.Oprice + "/-");
	Product2 p1 = new Product2();
	p1.ProductDetails();


}





}