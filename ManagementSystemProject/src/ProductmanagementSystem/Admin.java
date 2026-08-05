package ProductmanagementSystem;

public class Admin {
	public static void main(String[] args) {

		Controller c = new Controller();
		Product p = c.singleOrder();

		System.out.println("The Single Product Details are : ");
		System.out.println("----------------------------------------------");
		System.out.println(
				"The Product Name : " + p.name + "\nThe Product ID : " + p.pid + "\nThe Product price : " + p.price);

		System.out.println("\nThe All Products Details are : ");

		AddProducts ap = c.allProducts();
//		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("The Product Name : " + ap.Mobile.name + "\nThe Product ID : " + ap.Mobile.pid
				+ "\nThe Product price : " + ap.Mobile.price);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("The Product Name : " + ap.Watch.name + "\nThe Product ID : " + ap.Watch.pid
				+ "\nThe Product price : " + ap.Watch.price);
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println("The Product Name : " + ap.TV.name + "\nThe Product ID : " + ap.TV.pid
				+ "\nThe Product price : " + ap.TV.price);
		
		
		System.out.println("----------------------------------------------");
		
		
		System.out.println("The Product Name : " + ap.Washing.name + "\nThe Product ID : " + ap.Washing.pid
				+ "\nThe Product price : " + ap.Washing.price);
	}
}
