package ProductMgtSystem;

public class ProductDetails {
	public Product addProduct() {
		
		Product p = new Product();
		p.pid = 247478;
		p.pname = "Chetak";
		p.price = 125879.99;
		return p;
		
	}
	
	
	public Order addOrder() {
		Order o = new Order();
		o.oid = 43257;
		o.oname = "EV Vehicle";
		o.address = "Welahari, Nagpur";
		o.date = "25 February 2026";
		return o;
	}
	
	public Customer addCustomer() {
		
		Customer c = new Customer();
		c.cname = "Sameer Raut";
		c.mailid = "sameer92@gmail.com";
		c.contact = 9145586945l;
		c.cadd = "Jayatala , Nagpur";
		return c;
		
	}
	
}
