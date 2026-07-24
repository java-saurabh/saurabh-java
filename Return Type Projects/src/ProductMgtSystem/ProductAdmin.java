package ProductMgtSystem;

public class ProductAdmin {
	
	public static void main(String[] args) {
		
		ProductDetails PD = new ProductDetails();
		
		Product P = PD.addProduct();
		Order O = PD.addOrder();
		Customer C = PD.addCustomer();
		
		System.out.println("The Product management System Using Return Type");
		System.out.println("\n---------------------------------------------------------");
		
		// The Product Details Calling 
		
		System.out.println("The Product Details are : ");
		System.out.println("Product ID : " + P.pid);
		System.out.println("Product Name : " + P.pname);
		System.out.println("Product Price : " + P.price);
	
		System.out.println("\n---------------------------------------------------------");
		
		// The Order Details Calling 
		
		System.out.println("The Order Details are : ");
		System.out.println("Order ID : " + O.oid);
		System.out.println("Order Name : " + O.oname);
		System.out.println("Order Address : " + O.address);
		System.out.println("Order Date : " + O.date);

		System.out.println("\n---------------------------------------------------------");
		
		// The Customer Details Calling 
		
		System.out.println("The Customer Details are : ");
		System.out.println("Customer Name  : " + C.cname);
		System.out.println("Customer Contact : " + C.contact);
		System.out.println("Mail ID : " + C.mailid);
		System.out.println("Customer Address : " + C.cadd);
	}

}
