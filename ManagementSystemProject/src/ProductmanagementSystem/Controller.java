package ProductmanagementSystem;

public class Controller {
	
	public Product singleOrder() {
		Product p = new Product();
		p.pid = 473847;
		p.name = "Washing Machine";
		p.price = 25098;
		return p;
	}
	
	public AddProducts allProducts() {
		
		AddProducts AP = new AddProducts();
		AP.Mobile.name = "Motorola";
		AP.Mobile.pid = 50;
		AP.Mobile.price = 25000;
	
		
		
		AP.Watch.name = "NoiseFit";
		AP.Watch.pid = 32;
		AP.Watch.price = 2000;
		
		
		AP.TV.name = "Sony";
		AP.TV.pid = 547;
		AP.TV.price = 37560;
		
		
		AP.Washing.name = "Samsung Smart Washuing Machine";
		AP.Washing.pid = 3743846;
		AP.Washing.price = 45000;
		return AP;
	}
}
